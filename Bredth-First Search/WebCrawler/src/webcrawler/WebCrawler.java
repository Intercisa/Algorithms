package webcrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {

	private Queue<String> queue;
	private List<String> discoveredWebsitesList;

	public WebCrawler() {
		queue = new LinkedList<String>();
		discoveredWebsitesList = new ArrayList<>();
	}

	public void disvoverWeb(String root) {

		this.queue.add(root);
		this.discoveredWebsitesList.add(root);

		while (!queue.isEmpty()) {

			String w = this.queue.remove();
			String rawHTML = readURL(w);
			
			String regexp = "https://(\\w+\\.)*(\\w+)";
			Pattern pattern = Pattern.compile(regexp);
			Matcher matcher = pattern.matcher(rawHTML);
			
			while (matcher.find()) {
				String actualUrl = matcher.group();
				
				if(!discoveredWebsitesList.contains(actualUrl)) {
					discoveredWebsitesList.add(actualUrl);
					System.out.println("Website has been found with URL: "+ actualUrl);
					queue.add(actualUrl);
				}
			}

		}

	}

	private String readURL(String w) {
		StringBuilder rawHTML = new StringBuilder();

		try {

			URL url = new URL(w);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			String inputLine = "";

			while ((inputLine = in.readLine()) != null) {
				rawHTML.append(inputLine);

			}

			in.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

		return rawHTML.toString();

	}

}

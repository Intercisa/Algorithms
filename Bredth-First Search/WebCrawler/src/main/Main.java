package main;

import webcrawler.WebCrawler;

/*
 * WebCrawler (core of search engines)
 * 
 * 	Basically the whole internet can be represented by a directed graph / network 
 * 		- with vertexes -> these are the domains /URLs / websites 
 * 		- edges -> these are the connections
 * 
 *  ---------------------------------------------------------------------
 *  
 *  With breadth-first search we are able to traverse the web -> 
 *  	this is called a web-crawler that can hop from URL to URL and can observe the features of the network 
 *  		for example: the topology ~ degree distributions and so on!! 
 * 
 * 	This kind of web crawler that traverse the web can acquire important parameters of the web
 * 		
 * 		what is the frequently visited websites
 * 		what are the websites that are important in the network as a whole
 * 		Barabasi model -> complex network theory 
 * 
 * 		He came to the conclusion that sometimes it is extremely useful to monitor / study complex networks: 
 * 			can contains useful information
 * 		
 * 		social networks: facebook, twitter...
 * 			Who is the most popular person in a group of people? 
 * 			Who is the most important software engineer in a company? 
 * 
 */

public class Main {

	public static void main(String[] args) {
	
		WebCrawler crawler = new WebCrawler();
		String rootURL = "https://www.bbc.com";
		crawler.disvoverWeb(rootURL);
		
	}
}

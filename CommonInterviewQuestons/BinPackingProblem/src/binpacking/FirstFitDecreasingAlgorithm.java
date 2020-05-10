package binpacking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstFitDecreasingAlgorithm {

	private List<Bin> bins;
	private List<Integer> items;
	private int binCapacity;
	private int binCounter = 1;
	
	public FirstFitDecreasingAlgorithm(List<Integer> items, int binCapacity) {
		this.items = items;
		this.binCapacity = binCapacity;
		this.bins = new ArrayList<>(this.items.size()); //worst case we end up as many bins as many items we have 
	}
	
	public void solveBinpackingProblem() {
		
		Collections.sort(items, Collections.reverseOrder()); //we want to start with the biggest element 
		
		if(this.items.get(0) > this.binCapacity) {
			System.out.println("No feasable solution...");
			return;
		}
		
		this.bins.add(new Bin(binCapacity, binCounter)); //first bin 
		
		for (Integer currentItem : items) {
			
			boolean isOk = false; //track whether we have put the item into a bin or not
			int currentBin = 0;
			
			while (!isOk) {
				if(currentBin == this.bins.size()) { //item does not fit in last bin -> try new bin
					Bin newBin = new Bin(binCapacity, ++binCounter);
					newBin.put(currentItem);
					this.bins.add(newBin);
					isOk = true;
				}else if(this.bins.get(currentBin).put(currentItem)) { //current item fits in the given bin
					isOk = true;
				}else {
					currentBin++; //trying the next bin
				}
			}
		}
	}
	
	public void showResults() {
		for(Bin bin : this.bins)
			System.out.println(bin);
	}
}

package fruitbaskets;

import java.util.HashMap;

public class FruitIntoBaskets {

	
    public int totalFruit(int[] tree) {
    	 // track last two fruits seen
        int lastFruit = -1;
        int secondLastFruit = -1;
        int lastFruitCount = 0;
        int currMax = 0;
        int max = 0;
        
        for (int fruit : tree) {
            if (fruit == lastFruit || fruit == secondLastFruit)
                currMax++;
            else
                currMax = lastFruitCount + 1; // last fruit + new fruit
            
            if (fruit == lastFruit)
                lastFruitCount++;
            else
                lastFruitCount = 1; 
            
            if (fruit != lastFruit) {
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }
            
            max = Math.max(max, currMax);
        }
        
        return max;
    }
	
	
	public int totalFruitHash(int[] tree) {

		int n = tree.length;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int window = 0, res = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			map.put(tree[i], map.getOrDefault(tree[i], 0) + 1); /* have some hashmap or counter */

			/* Loop inside for to reduce the window size based on constraint */
			while (window < n && map.size() > 2) {
				map.put(tree[window], map.get(tree[window]) - 1);
				if (map.get(tree[window]) == 0)
					map.remove(tree[window]);

				window++;
			}
			/* get the maximum value of the window which satisfies the constraint */
			res = Math.max(res, i - window + 1);
		}
		return res == Integer.MIN_VALUE ? (map.size() > 0 ? n : 0) : res;
	}

}

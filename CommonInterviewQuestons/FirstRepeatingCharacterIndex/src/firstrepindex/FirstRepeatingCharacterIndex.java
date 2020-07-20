package firstrepindex;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstRepeatingCharacterIndex {
	public int findFirstIndex(String str) {
		
		HashMap<Character, IndexHash<Integer, Integer>> map = 
				new LinkedHashMap<Character, FirstRepeatingCharacterIndex.IndexMap<Integer,Integer>>();
		
		for (int i = 0; i < str.length(); i++) {
		
			if(!hash.containsKey(str.charAt(i))) {
				IndexMap<Integer, Integer> temp = new IndexMap<Integer, Integer>();
				temp.index =i;
				temp.num=1;
				map.put(str.charAt(i),temp);
			}else {
				map.get(str.charAt(i)).num++;
			}
		}

	 	return map.values().stream().filter( i -> i.num == 1)
		.findFirst().get().index;

	}
	
	private class IndexMap<K, V>{
		private K num;
		private V index;
		
		@Override
		public String toString() {
			return String.format("IndexMap [num=%s, index=%s]", num, index);
		}
		
	}
}




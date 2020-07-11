package firstrepindex;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstRepeatingCharacterIndex {
	public int findFirstIndex(String str) {
		
		HashMap<Character, IndexHash<Integer, Integer>> hash = 
				new LinkedHashMap<Character, FirstRepeatingCharacterIndex.IndexHash<Integer,Integer>>();
		
		for (int i = 0; i < str.length(); i++) {
		
			if(!hash.containsKey(str.charAt(i))) {
				IndexHash<Integer, Integer> temp = new IndexHash<Integer, Integer>();
				temp.index =i;
				temp.num=1;
				hash.put(str.charAt(i),temp);
			}else {
				hash.get(str.charAt(i)).num++;
			}
		}

	 	return hash.values().stream().filter( i -> i.num == 1)
		.findFirst().get().index;

	}
	
	private class IndexHash<K, V>{
		private K num;
		private V index;
		
		@Override
		public String toString() {
			return String.format("IndexHash [num=%s, index=%s]", num, index);
		}
		
	}
}




package Array;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MaxOccuredInteger {
	public static int maxOccuredInteger(Map<Integer, Character> map, int[] L, int[] R) {
		int currCount = 0;
		int maxCount = 0;
		int resultSetIndex = 0;
		int result = 0;
		int index = 0;
		Iterator<Entry<Integer, Character>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			index++;
			Entry<Integer, Character> entry = iterator.next();
			if(entry.getValue() == 'S') {
				currCount++;
				if(maxCount < currCount) {
					maxCount = currCount;
					if(resultSetIndex < index) {
						result = entry.getKey();
						resultSetIndex = index;
					}
				}
			}
			else {
				if(currCount == maxCount && resultSetIndex > index) {
						result = entry.getKey();
				}
				currCount--;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int L[] = { 1, 4, 9, 13, 21 };
		int R[] = {15,8,12,20,30};
		//		Complexity of maintaining the TreeMap will be O(nlogn)
		Map<Integer, Character> map = new TreeMap<Integer, Character>();
		for(int ele : L)
			map.put(ele, 'S');
		for(int ele : R)
			map.put(ele, 'E');
		System.out.println(map);
		System.out.println(maxOccuredInteger(map, L,R));
	}
}

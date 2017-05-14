package Array;

import java.util.HashMap;
import java.util.Map;

public class SubarrayGivenXor {
	public static int countSubarrayXor(int[] arr, int m) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int xor = 0;
		int count = 0;
		for(int ele : arr) {
			xor ^= ele;
			if(xor == m) {count++; map.put(m, count);}
			else {
				int newXor = xor ^ m;
				count += map.get(newXor) == null ? 0 : map.get(newXor);
				int val = 1 + (map.get(xor)==null ? 0 : map.get(xor));
				map.put(xor, val);	
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {5,6,7,8,9};
		int m = 5;
		System.out.println(countSubarrayXor(arr, m));
	}
}

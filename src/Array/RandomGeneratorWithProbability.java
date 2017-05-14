package Array;

import java.util.Random;

public class RandomGeneratorWithProbability {
	public static int getCeilUtil(int[] freq, int l, int h, int n) {
		if(l >= h)return l;
		int mid = l + ((h - l) >> 1);
		if(freq[mid] < n)
			return getCeilUtil(freq, mid+1, h, n);
		else 
			return getCeilUtil(freq, l, mid, n);
	}
	public static int getCeil(int[] freq, int n) {
		return getCeilUtil(freq, 0, freq.length - 1, n);
	}
	public static void getRandomNumber(int[] arr, int[] freq) {
		for(int i = 1; i < freq.length; i++)
			freq[i] += freq[i-1];
		Random random = new Random();
		for(int i = 0; i < 1000; i++) {
			int num = 1 + random.nextInt(freq[freq.length - 1]);
			System.out.print(arr[getCeil(freq, num)] + "  ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {10, 30, 20, 40};
		int freq[] = {1, 6, 2, 1};
		getRandomNumber(arr, freq);
	}
}

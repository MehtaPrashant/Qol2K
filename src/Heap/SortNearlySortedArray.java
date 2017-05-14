package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortNearlySortedArray {
	public static void sortKHeap(int[] arr, int k) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		int index = 0;
		for(int i = 0; i < arr.length; i+=k) {
			for(int j = 0; j < k && i+j < arr.length; j++) {
				pQueue.add(arr[i+j]);
			}
			for(int kk = 0; kk < k && !pQueue.isEmpty(); kk++) {
				arr[index++] = pQueue.peek();
				pQueue.remove();
			}
		}
	}
	public static void main(String[] args) {
		int k = 3;
		int arr[] = {2,6,3,12,56,8};
		sortKHeap(arr, k);
		System.out.println(Arrays.toString(arr));
	}
}

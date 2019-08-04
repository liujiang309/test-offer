package 冒泡排序;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 23, 45, 123, 45, 64, 65 };
		System.out.println("排序前:" + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("排序后:" + Arrays.toString(arr));
		
	}

	public static void bubbleSort(int[] arr) {

		for (int i = 1; i <= arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j + 1] ^ arr[j];
					arr[j + 1] = arr[j + 1] ^ arr[j];
					arr[j] = arr[j + 1] ^ arr[j];
				}
			}
		}
	}
}

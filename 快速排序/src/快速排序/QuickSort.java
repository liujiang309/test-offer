package 快速排序;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 23, 43, 54, 20, 40, 50, 70, 80, 24 };
		System.out.println("排序前:" + Arrays.toString(arr));
		quickSort(arr,0,arr.length - 1);
		System.out.println("排序后:" + Arrays.toString(arr));
	}

	public static void quickSort(int[] arr, int left, int right) {
		int l = left;
		int r = right;
		int middle = arr[(left + right) / 2];

		while (l < r) {

			while (arr[l] < middle) {
				l++;
			}

			while (arr[r] > middle) {
				r--;
			}

			if (l >= r) {
				break;
			}

			arr[l] = arr[l] ^ arr[r];
			arr[r] = arr[l] ^ arr[r];
			arr[l] = arr[l] ^ arr[r];

			if (arr[l] == middle) {
				r--;
			}

			if (arr[r] == middle) {
				l++;
			}

			if (l == r) {
				l++;
				r--;
			}

			if (left < r) {
				quickSort(arr, left, r);
			}

			if (l < right) {
				quickSort(arr, l, right);
			}

		}
	}
}

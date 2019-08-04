package 选择排序;

import java.util.Arrays;

public class SelectSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23,45,67,89,90,34,25};
		System.out.println("排序前:" + Arrays.toString(arr));
		selectSort(arr);
		System.out.println("排序后:" + Arrays.toString(arr));
	}
	
	public static void selectSort(int[] arr) {
		for(int i = 0; i < arr.length - 1;i++) {
			int minValue = arr[i];
			int minIndex = i;
			
			for(int j = i + 1;j < arr.length;j++) {
				if(arr[j] < minValue) {
					minValue = arr[j];
					minIndex = j;
				}
			}
			
			if(minIndex != i) {
			 	arr[minIndex] = arr[i];
				arr[i] = minValue;
			}
		}
	}

}

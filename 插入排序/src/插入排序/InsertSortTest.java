package 插入排序;

import java.util.Arrays;

public class InsertSortTest {

	public static void main(String[] args) {
			int[] arr = {23,42,86,78,34,20,44};
			System.out.println("排序前:" + Arrays.toString(arr));
			insertSort(arr);
			System.out.println("排序后:" + Arrays.toString(arr));
	}

	public static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int insertValue = arr[i];
			int insertIndex = i - 1;
			
			while(insertIndex >= 0 && arr[insertIndex] > insertValue) {
				arr[insertIndex + 1] = arr[insertIndex];
				insertIndex--;
			}
			
			if(insertIndex + 1 != i) {
				arr[insertIndex + 1] = insertValue;
			}
		}
	}

}

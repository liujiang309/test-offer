import java.util.*;
public class ArrayTest{
	
	public static void main(String[] args){
		int[] numbers = {1,1,2,2,3,4,3,4,3};
		ArrayList<Integer> doubleNumber = new ArrayList<Integer>();
		getDoubleNumber(numbers,9,doubleNumber);
		System.out.println(doubleNumber);
	}
	
	public static boolean getDoubleNumber(int[] numbers,int length,List<Integer> doubleNumber){
		boolean flag = false;		
		if(numbers == null || length <= 0){
			return false;
		} 
		
		for(int i = 0;i < length;i++){
			if(numbers[i] < 0 || numbers[i] > length -1){
				return false;
			}
		}

		for(int i = 0;i< length;i++){
			while(numbers[i] != i){
				
				if(numbers[i] == numbers[numbers[i]]){
					doubleNumber.add(numbers[i]);
					flag = true;
				} else {
					int temp = numbers[i];
					numbers[i] = numbers[numbers[i]];
					numbers[numbers[i]] = temp;
				}
				
			}
		}
		
		return flag;
	}
}

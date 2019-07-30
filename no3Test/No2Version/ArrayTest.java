import java.util.*;
public class ArrayTest{
	
	public static void main(String[] args){
		int[] numbers = {2,3,1,0,2,5,3};
		ArrayList<Integer> doubleNumber = new ArrayList<Integer>();
		getDoubleNumber(numbers,doubleNumber);
		System.out.println(doubleNumber);	
	}

	public static boolean getDoubleNumber(int[] numbers,List<Integer> doubleNumber){
		if(numbers == null){
			return false;
		} else if(numbers.length == 0){
			return false;
		} else {
			int i = 0;
			while(i < numbers.length){
				if(i == numbers[i]){
					i++;
				} else if( numbers[numbers[i]] != numbers[i]){
					int temp = numbers[i];
					numbers[i] = numbers[temp];
					numbers[temp] = temp;
				} else if( numbers[numbers[i]] == numbers[i]){
					doubleNumber.add(numbers[i]);
					return true;
				}
			}
		
			return false;
		}
	}
}

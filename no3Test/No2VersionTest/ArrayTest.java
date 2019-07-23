import java.util.*;
public class ArrayTest{
	
	public static void main(String[] args){
		int[] numbers = {2,3,1,0,2,5,3};
		List<Integer> doubleNumber = new ArrayList<Integer>();
		getDoubleNumber(numbers,7,doubleNumber);
		System.out.println(doubleNumber);
	}
	
	public static boolean getDoubleNumber(int[] numbers,int length,List<Integer> doubleNumber){
		
		//判断数据的有效性
		if(numbers == null || length <=0){
			return false;
		} 
		
		for(int i = 0;i< length;i++){
			if(numbers[i] < 0 || numbers[i] > length -1 ){
				return false;
			}
		}

		for(int i = 0;i < length; i++){
			
			while(numbers[i] != i){
				
				if(numbers[i] == numbers[numbers[i]]){
					doubleNumber.add(numbers[i]);
					return true;
				} 
				
				int temp = numbers[i];
				numbers[i] = numbers[temp];
				numbers[temp] = temp; 
			}
		}
			
		return true;
	}
}

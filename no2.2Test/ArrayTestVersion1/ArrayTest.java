import java.util.*;
public class ArrayTest{
	
	public static void main(String[] args){
		int[] numbers = {2,3,5,4,3,2,6,7};
		List<Integer> doubleNumber = new ArrayList<Integer>();
		getDoubleNumber(numbers,8,doubleNumber);
		System.out.println(doubleNumber);
	}
	
	public static boolean getDoubleNumber(int[] numbers,int length,List<Integer> doubleNumber){
		//保证数据的可靠性
		boolean flag = false;
		if(numbers == null || length < 0){
			return false;
		}
		
		for(int i = 0; i < length;i++){
			if(numbers[i] < 1 || numbers[i] > length - 1){
				return false;
			}
		}

		//创建一个辅助数组
		int[] helpArray = new int[length];
		for(int i = 0;i < length;i++){
			if(numbers[i] == helpArray[numbers[i]]){
				doubleNumber.add(numbers[i]);
				flag = true;
			} else {
				helpArray[numbers[i]] = numbers[i];
			}
		}

		return flag;

	}
}

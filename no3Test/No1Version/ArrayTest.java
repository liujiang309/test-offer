import java.util.*;
public class ArrayTest{

	public static void main(String[] args){
		int[] array = {2,3,1,0,2,5,3};
		List<Integer> doubleNumber = new ArrayList<Integer>();
		getDoubleNumber(array,7,doubleNumber);
		System.out.println(doubleNumber);
	}

	public static boolean getDoubleNumber(int[] numbers,int length,List<Integer> doubleNumber){
		
		boolean flag = false;
		Set<Integer> hashSet = new HashSet<Integer>();
		
		for(int i = 0;i < length;i++){
			if(hashSet.contains(numbers[i])){
				doubleNumber.add(numbers[i]);
				flag = true;
			} else {
				hashSet.add(numbers[i]);
			}
		}
		
		return flag;
	}
}

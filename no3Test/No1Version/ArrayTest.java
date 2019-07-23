import java.util.*;
public class ArrayTest{
	
	public static void main(String[] args){
		int[] numbers = {2,3,1,0,2,5,3};
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		getDoubleNumber(numbers,7,arrayList);
		System.out.println(arrayList);
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

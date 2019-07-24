import java.util.*;
class ListNode{
	
	int val;
	ListNode next;
	
	public ListNode(int val){
		this.val = val;
	}
}

public class ArrayTest{
	
	public static void main(String[] args){
		int[] numbers = {2,3,1,0,2,5,3};
		ArrayList<Integer> doubleNumber = new ArrayList<Integer>();
		getDoubleNumber(numbers,doubleNumber);
		System.out.println(doubleNumber);
	}
	
	public static boolean getDoubleNumber(int[] numbers,List<Integer> doubleNumber){
		boolean flag = false;
		if(numbers == null){
			return false;
		} else if(numbers.length == 0){
			return false;
		} else {
			Set<Integer> hashSet = new HashSet<Integer>();
			
			for(int i = 0;i< numbers.length;i++){
				if(hashSet.contains(numbers[i])){
					doubleNumber.add(numbers[i]);
					flag = true;
				} else {
					hashSet.add(numbers[i]);
				}
			}
			
		}
			
		return flag;
	}
}

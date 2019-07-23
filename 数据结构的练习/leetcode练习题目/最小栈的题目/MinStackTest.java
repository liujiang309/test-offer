import java.util.*;

class MinStack{
	
	private Stack<Integer> stack;

	private int min = Integer.MAX_VALUE;
	
	private HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
	
	public MinStack(){
		stack = new Stack<Integer>();
	}
	
	public void push(int x){
	
		if(min > x){
			min = x;
		}
		
		stack.push(x);
		if(hashMap.containsKey(x)){
			hashMap.put(x,hashMap.get(x) + 1);
		} else {
			hashMap.put(x,1);
		}
	}

	public void pop(){
		int topElement = stack.pop();
		
		if(hashMap.get(topElement) == 1){
			hashMap.remove(topElement);
			if(min == topElement){
				min = Integer.MAX_VALUE;
			}
		} else {
			hashMap.put(topElement,hashMap.get(topElement) - 1);
		}
		
		Set<Integer> keys = hashMap.keySet();
		for(Integer key:keys){
			if(min > key){
			    min = key;
			}
		}
	}

	public int getMin(){
		return min;
	}

	public int top(){
		return stack.peek();
	}

	
}

public class MinStackTest{
	
	public static void main(String[] args){
		MinStack minStack = new MinStack();
		minStack.push(-3);
		minStack.push(-2);
		minStack.push(1);
		
		System.out.println("min:" + minStack.getMin());
		System.out.println(minStack.top());
		minStack.pop();
		System.out.println("min:" + minStack.getMin());
	}
}

import java.util.ArrayList;
import java.util.Stack;

class ListNode{
	
	int val;
	ListNode next;
		
	public ListNode(int val){
		this.val = val;
	}
	
}

public class PrintReverseList{
	
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		head.next = two;
		two.next = three;
		ListNode preHead = head;	
			
		while(preHead != null){
			System.out.print(preHead.val + "-------");
			preHead = preHead.next;
		}
	
		System.out.println("-----");
	
		ArrayList<Integer> arrayList = printReverseList(head);
		System.out.println(arrayList);			
	}
	
	public static ArrayList<Integer> printReverseList(ListNode listNode){
		
		if(listNode == null){
			return new ArrayList<Integer>();
		} else {
			//存储相应结点信息的栈
			Stack<Integer> stack = new Stack<Integer>();
			while(listNode != null){
				stack.push(listNode.val);
				listNode = listNode.next;
			}
			

			//进行相应的出栈的操作
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			while(!stack.isEmpty()){
				Integer end = stack.pop();
				arrayList.add(end);
			}
			
			return arrayList;
		}
	}
}

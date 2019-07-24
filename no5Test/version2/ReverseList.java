class ListNode{
	
	int val;
	ListNode next;
	
	public ListNode(int val){
		this.val = val;
	}
}

public class ReverseList{

	public static void main(String[] args){
		ListNode  head = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		head.next = two;
		two.next = three;
		
		reverseList(head);
	}
	
	public static void  reverseList(ListNode listNode){
		if(listNode != null){
			if(listNode.next != null){
				reverseList(listNode.next);
			} 
			
			System.out.print(listNode.val + "------");	
		} 
	}
}

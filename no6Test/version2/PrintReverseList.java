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
		
		printReverseList(head);
	}
	
	public static void printReverseList(ListNode head){
		
		if(head !=null){
			if(head.next != null){
				printReverseList(head.next);
			}
		
			System.out.print(head.val + "----- " );
		}
	}
}

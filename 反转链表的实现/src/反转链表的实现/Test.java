package 反转链表的实现;

class Node{
	int value;
	Node next;
	
	public Node(int val) {
		this.value = val;
	}
}

public class Test {
	public static void main(String[] args) {
		Node preHead = new Node(-1);
		Node node = new Node(1);
		Node next = new Node(2);
		Node nextNext = new Node(3);
		preHead.next = node;
		node.next = next;
		next.next = nextNext;
		

		
		Node reverseNode = getReverse(preHead);
		while(reverseNode != null) {
			System.out.println(reverseNode.value);
			reverseNode = reverseNode.next;
		}
	}
	
	public static Node getReverse(Node head){
		
		Node newHead = new Node(-1);
		
		Node cur = head.next;
		Node next = null;
		while(cur != null) {
			next = cur.next;
			
			cur.next = newHead.next;
			newHead.next = cur;
			cur = next;
		}
		
		return newHead.next;
	}
}





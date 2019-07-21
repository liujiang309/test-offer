class Node{
	
	int value;
	Node next;
		
	public Node(int value){
		this.value = value;
	}
}

class MyLinkedList{
	
	Node head;
	
	public MyLinkedList(int n){
		
		Node headNode = new Node(n);
		headNode.next = null;
		head = headNode;
		
		//头插法		
		for(int i = 1; i <= n;i++){
			Node newNode = new Node(i);
			Node p = head;
			newNode.next = p.next;
			p.next = newNode;
		}
	}

	public void print(){
		Node p = head;
		//表示为空链表
		if(p.next == null){
			System.out.println("这是一个空链表");
		} else {
			while(p.next != null){
				p = p.next;
				System.out.print(p.value + "----");
			}	
		}
	}

}

public class MyLinkedListTest{
	
	public static void main(String[] args){
		MyLinkedList myLinkedList = new MyLinkedList(10);
		myLinkedList.print();
	}
}

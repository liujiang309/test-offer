class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
	}
}

class MyLinkedList{
	
	//头指针
	Node head;

	//初始化链表操作
	public MyLinkedList(int n){
		//存入头结点的操作
		Node headNode = new Node(n);
		headNode.next = null;
		
		//头指针指向头结点
		this.head = headNode;

		for(int i = 1;i <= n;i++){
			Node newNode = new Node(i);
			Node p = this.head;
			newNode.next = p.next;
			p.next = newNode;			
		}
	}

	public void print(){
		
		Node p = head;
		while(p.next != null){
			p = p.next;
			System.out.print(p.data + "---");
		}
	}

}

public class MyLinkedListTest{

	public static void main(String[] args){
		MyLinkedList myLinkedList = new MyLinkedList(10);
		myLinkedList.print();
	}
}

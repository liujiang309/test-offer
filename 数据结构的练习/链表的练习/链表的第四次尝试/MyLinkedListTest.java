class Node{
	
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
}

class MyLinkedList{

	Node head;

	public MyLinkedList(){
		Node headNode = new Node(0);
		headNode.next = null;
		head = headNode;
	}
	
	public void add(Node newNode){
		
		Node p = this.head;
		newNode.next = p.next;
		p.next = newNode;
		this.head.data++;
	}

	public void insert(Node newNode,int i){
		
		//判断插入的位置是否是合理的值
		if(i <=0 || i > this.head.data + 1){
			System.out.println("你要插入的位置是不合理的值");
			return; 
		} else {
		 	if(i==1){
				Node p = this.head;
				newNode.next = p.next;
				p.next = newNode;
				this.head.data++;
			} else {
				Node p = this.head;
				int j = 1;
				while(p.next != null && j < i){
					p = p.next;
					j++;
				}
				
				newNode.next = p.next;
				p.next = newNode;
				this.head.data++;
			}
		}
		
	}

	public void print(){
		 Node p = this.head;
		 while(p.next!=null){
			p = p.next;
			System.out.print(p.data + "------");
		}
	}
}

public class MyLinkedListTest{
	
	public static void main(String[] args){
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(new Node(1));
		myLinkedList.add(new Node(2));
		myLinkedList.print();
		System.out.println();
		myLinkedList.insert(new Node(3), 1);
		myLinkedList.print();
		System.out.println();
		myLinkedList.insert(new Node(4), 4);
		myLinkedList.print();
		System.out.println();
		myLinkedList.insert(new Node(5), 4);
		myLinkedList.print();
		System.out.println();
		myLinkedList.insert(new Node(6), 4);
		myLinkedList.print();
		System.out.println();
		myLinkedList.insert(new Node(7), 1);
		myLinkedList.print();
		System.out.println();
	}
}

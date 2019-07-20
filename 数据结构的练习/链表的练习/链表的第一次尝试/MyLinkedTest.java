class Node{
	
	int value;
	
	Node next;
	
	public Node(int value){
		this.value = value;
	}
}

class MyLinkedList{
	
	Node head;
	
	public MyLinkedList(){
		Node newNode = new Node(-1);
		newNode.next = null;
		newNode.value = 0;
		head = newNode;
	}
	
	public void add(Node newNode){
		newNode.next = head.next;
		head.next = newNode;
		head.value++;
	}
	
	public void insert(int index,Node newNode){
		if(head.next == null){
			return;
		}
	
		if(!checkIndex(index)){
			
			Node p = head;
			int j = 1;
			p = head.next;
			while(j < index - 1){
				j++;
				p = p.next;
			}
			
			newNode.next = p.next;
			p.next = newNode;	
			head.value++;
				
		}
	}
	
	public void delete(int index){
		
		if(head.value == 0){
			return;
		}

		if(index <= 0 || index > head.value){
			Node p = head;
			int j = 1;
  			p = head.next;
			while(j < index - 1){
				j++;
				p = p.next;
			}
			
			p.next = null;
		}
	}

	
	public boolean checkIndex(int index){
		boolean flag = false;
		if(index <=0 || index > head.value + 1){
				System.out.println("你要插入的位置越界了");
				flag = true;
		}
		return flag;
	}
	
	public void print(){
		Node p = head;
		while(p.next != null){
			p = p.next;
			System.out.println(p.value);
		}
	}
}	

public class MyLinkedTest{
	
	public static void main(String[] args){
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(new Node(1));
		myLinkedList.add(new Node(2));
		
		myLinkedList.print();
		System.out.println("-----------");	
		myLinkedList.delete(1);
		System.out.println("-----------");
		myLinkedList.print();
		myLinkedList.insert(1,new Node(3));
		System.out.println("-----------");
		myLinkedList.print();
		
	}
}

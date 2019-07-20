/*
*  这表示是链表中的结点信息
*/
class Node{
	
	int value;
	Node next;
	
	
	public Node(int value){
		this.value = value;
	}

	public String toString(){
		return value + "";
	}
}

/*
*  这是我创建的链表信息
*/
class MyLinkedList{
	
	/*
	* 这是链表中存储了头指针和对尾指针
	*/
	Node head;
	int length;
	
	/*
	* 构建我的链表
	*/
	public MyLinkedList(){
		Node node = new Node(0);
		node.next = null;
		head = node;
		length = 0;
	}
	
	/*
	* 进行相应的读操作
	*/
	public Node getElement(int index){
		
		Node node = null;		

		if(length == 0){
			System.out.println("该链表为空");
		} else if(index < 1 || index > length + 1){
			System.out.println("你访问的索引越界了");
		} else {
			
			int j = 1;
			Node p = head.next;
			while(p.next != null || j < index){
				p = p.next;
				j++;
			}
			
			node = p;
			
		}
		
		return node;
	}
	
	
	/*
	*  进行添加操作
	*/
	public void add(Node newNode){
		Node p = head;
		
			while(p.next != null){
				p = p.next;
			} 
				p.next = newNode;
			length++;			
			
	}
	
	/*
	* 进行插入操作(插入操作和添加操作不同的地方)
	*/
//	public void insert(int index){
//		checkIndex(index);
//		//判断是否是添加操作
//		if(index == 1 && length == 0){
//			Node newNode = new Node(1);
//			newNode.next = head.next;
//			head.next = node;
//		}
//	}
	
//	public void checkIndex(int index){
//		if(index < 0 || index > length + 1){
//		 	throw new Exception("你插入的位置越界了");
//		}
//	}

}

public class MyLinkedListTest{

	public static void main(String[] args){
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(new Node(1));
		myLinkedList.add(new Node(2));
		Node node = myLinkedList.getElement(1);		
		System.out.println(node);
		//System.out.println(myLinkedList.head.value);
		//System.out.println(myLinkedList.length);	
	}
}

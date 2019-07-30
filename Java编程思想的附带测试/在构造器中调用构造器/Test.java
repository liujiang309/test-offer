class Dog{
		
	int i = 0;

	public Dog(int i ){
		this.i = i;
		System.out.println("这是带参数的构造方法");		
	}

	public Dog(){
		this();
		System.out.println("测试成功");
	}
}

public class Test{
	
	public static void main(String[] args){
		Dog dog = new Dog();
	}
}

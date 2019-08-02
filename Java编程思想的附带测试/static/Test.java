class Dog{
	static int i;
	static void play(){
		System.out.println("狗在玩游戏");
	}
}

public class Test{
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.i = 1;
		Dog dog2 = new Dog();
		System.out.println(dog2.i);
	}
}

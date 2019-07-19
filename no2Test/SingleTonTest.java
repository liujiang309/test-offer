public class SingleTonTest{
	
	public static void main(String[] args){
		
		SingleTon1 singleTon1 = SingleTon1.getInstance();
		SingleTon1 singleTon2 = SingleTon1.getInstance();
		
		if(singleTon1 == singleTon2){
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}

class SingleTon1{
	
	private SingleTon1(){}

	private static SingleTon1 singleTon1 = null;

	public static SingleTon1 getInstance(){
		
		if(singleTon1 == null){
			singleTon1 = new SingleTon1();
		} 
		
		return singleTon1;

	}
}

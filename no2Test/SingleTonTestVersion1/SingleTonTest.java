public class SingleTonTest{

	public static void main(String[] args){
		
		SingleTon singleTonTest = SingleTon.getInstance();
		SingleTon singleTonTest2 = SingleTon.getInstance();

		if(singleTonTest == singleTonTest2){
			System.out.println(true);
		} else {
			System.out.println(false);
		}		
	}
}

class SingleTon{
	
	private SingleTon(){}

	private static SingleTon singleTon = null;

	public static SingleTon getInstance(){

		if(singleTon == null){
			singleTon = new SingleTon();
		}
		
		return singleTon;
	}
}

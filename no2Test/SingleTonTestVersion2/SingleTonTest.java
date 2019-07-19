public class SingleTonTest{
	
	public static void main(String[] args){
		SingleTon singleTon1 = SingleTon.getInstance();

		SingleTon singleTon2 = SingleTon.getInstance();
		
		if(singleTon1 == singleTon2){ 
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}

class SingleTon{

	
	private SingleTon(){}

	private static SingleTon singleTon1 = null;

	public static SingleTon getInstance(){
		if(singleTon1 == null){	
			synchronized(SingleTon.class){
				if(singleTon1 == null){
					singleTon1 = new SingleTon();
				}
			}
		}
		
		return singleTon1;
	}
}

public class SingleTonTest{
	
	public static void main(String[] args){
		SingleTon singleTon = SingleTon.getInstance();
		SingleTon singleTon2 = SingleTon.getInstance();

		if(singleTon == singleTon2){
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
			
			synchronized(SingleTon.class){
				if(singleTon == null){
					singleTon = new SingleTon();
				}
			}
		}

		return singleTon;
	}
}

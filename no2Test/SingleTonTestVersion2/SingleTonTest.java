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

public class SingleTonTest{
	
	public static void main(String[] args){
		SingleTon singleTon1 = SingleTon.getInstance();
		SingleTon singleTon2 = SingleTon.getInstance();
		if(singleTon1 != null && singleTon2 != null){
			if(singleTon1 == singleTon2){
				System.out.println(true);
			} else {
				System.out.println(false);
			}	
		}	
	}
}

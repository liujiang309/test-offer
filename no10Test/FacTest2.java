import java.util.Scanner;
public class FacTest2{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要上的台阶数量为:");
		int number = sc.nextInt();
		
		System.out.println(getNumber(number));
		
	}

	public static int getNumber(int n){
		if(n == 1) return 1;
		if(n == 2) return 2;
		
		return getNumber(n - 1) + getNumber(n - 2);
	}
}

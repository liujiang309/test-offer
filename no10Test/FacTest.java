import java.util.Scanner;
public class FacTest{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正整数:");
		int number = sc.nextInt();
		System.out.println(fac(number));
	}

	public static int fac(int n){
		
		if(n == 1) return 1;
		if(n == 2) return 2;
		
		return fac(n - 1) + fac(n - 2);
	}
}

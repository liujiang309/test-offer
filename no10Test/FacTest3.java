import java.util.Scanner;
public class FacTest3{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正整数:");
		int number = sc.nextInt();
		System.out.println("一共有" + getCount(number) + "种统计方法");
	}
		
	public static int getCount(int n){
		if(n == 1) return 1;
		if(n == 2) return 2;
		
		int numberOne = 1;
		int numberTwo = 2;
		int count = 0;
		for(int i = 3;i<=n;i++){
			count = numberOne + numberTwo;
			numberOne = numberTwo;
			numberTwo = count;
		}
	
		return count;
	}
}



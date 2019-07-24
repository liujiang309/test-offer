public class FindNumber{
	
	public static void main(String[] args){
		int[][] numbers = {{1,2,3},{4,5,6}};
		int number = 4;
		System.out.println(findNumber(numbers,number));		
	}
	
	public static boolean findNumber(int[][] numbers,int number){
		boolean flag = false;
		if(numbers == null){
  			return false;
		} else {
			int row = 0;
			int column = numbers[0].length - 1;
			while(row < numbers.length && column >= 0){
				if(numbers[row][column] > number){
					column--;
				} else if(numbers[row][column] < number){
					row++;
				} else if(numbers[row][column] == number){
					flag = true;
					break;
				}
			}
		}
	
		return flag;
	}
}

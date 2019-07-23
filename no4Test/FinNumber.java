public class FinNumber{
	
	public static void main(String[] args){
		int[][] array = {{1,2,3},{4,5}};
		int target = 3;
		System.out.println(findNumber(array,target));				
	}
	
	public static boolean findNumber(int[][] array,int target){
		boolean flag = false;
		if(array !=null && array.length > 0 && array[0].length > 0){
			
			int row = 0;
			int column = array[0].length - 1;
			while(row < array.length && column >= 0){
				if(array[row][column] > target){
					column--;
				} else if(array[row][column] < target){
					row++;
				} else if(array[row][column] == target){
					flag = true;
					break;
				}
			}
		}

		return flag;
	}
}

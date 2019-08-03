package 稀疏数组;

public class Test {

	public static void main(String[] args) {
		int[][] arr = {{0,0,0,1},{0,0,1,0},{0,1,0,1},{0,1,1,0}};
		
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		int[][] newArray = getArray(arr);
		for(int i = 0;i< newArray.length;i++) {
			for(int j = 0;j<newArray[i].length;j++) {
				System.out.print(newArray[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static int[][] getArray(int[][] arr){
		if(arr != null && arr.length != 0) {
			int count = 0;
			
			for(int i = 0;i<arr.length;i++){
				for(int j = 0;j<arr[i].length;j++) {
					if(arr[i][j] !=0) {
						count++;
					}
				}
			}
			
			int[][] newArray = new int[count+1][3];
			
			newArray[0][0] = arr.length;
			newArray[0][1] = arr[0].length;
			newArray[0][2] = count;
			
			count = 1;
			for(int i = 0;i<arr.length;i++){
				for(int j =0;j<arr[i].length;j++){
					if(arr[i][j] !=0) {
						newArray[count][0] = i;
						newArray[count][1] = j;
						newArray[count][2] = arr[i][j];
						count++;
					}
				}
			}
			
			return newArray;
		}
		
		return null;
	}
}

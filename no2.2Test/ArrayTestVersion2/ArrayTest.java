public class ArrayTest{
	
	public static void main(String[] args){
		int[] numbers = {2,3,5,4,3,2,6,7};
		int length = 8;
		System.out.println(getDoubleNumber(numbers,length));

	}
	
	public static int getDoubleNumber(int[] numbers,int length){
		if(numbers == null || length < 0){
			return -1;
		} 

		for(int i = 0; i < length;i++){
			if(numbers[i] < 1 || numbers[i] > length - 1){
				return -1;
			}
		}
		
		int start = 1;
		int end = length - 1;
		while(start <= end){
			int middle = (end - start) / 2 + start;
			int count = countRange(numbers,length,start,middle);
			if(end == start){
				if(count > 1){
					return start;
				} else {
					break;	
				}
			}
			
			if(count >(middle - start + 1)){
				end = middle;
			} else {
				start = middle + 1;
			}
		}

		return -1;
	}

	private static int countRange(int[] numbers,int length,int start,int end){
		
		if(numbers == null){
			return 0;
		}
		
 		int count = 0;
		for(int i = 0;i < length;i++){
			if(numbers[i] >= start && numbers[i] <= end){
				count++;	
			}
		}
		return count;
	}
}

public class ReplaceTest{
	public static void main(String[] args){
		StringBuffer str = new StringBuffer();
		str.append("Hello world");
		System.out.println(replaceSpace(str));
	}
	
	public static String replaceSpace(StringBuffer str){
		if(str == null){
			return "";
		} else if(str.length() == 0){
			return "";
		} else {
			int spaceNumber = 0;
			for(int i = 0;i < str.length();i++){
				if(str.charAt(i)==' '){
					spaceNumber++;
				}
			}
			
			StringBuffer newStr = new StringBuffer(str.length() + spaceNumber * 2);
			for(int i = 0;i < newStr.capacity();i++){
				newStr.append('\0');
			}

			int originalStart = str.length() - 1;
			int newStrStart = newStr.capacity() - 1;		
			while(originalStart >= 0 && originalStart <= newStrStart){
				if(str.charAt(originalStart) == ' '){
					newStr.setCharAt(newStrStart--,'0');
					newStr.setCharAt(newStrStart--,'2');
					newStr.setCharAt(newStrStart--,'%');
				} else {
					newStr.setCharAt(newStrStart--,str.charAt(originalStart));
				}
				
				originalStart--;
			}
			
			return newStr.toString();	
		}
		
	}
}


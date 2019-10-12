package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Vidhya";
		char[] charArray = str.toCharArray();
		int length = str.length();
		for(int index=length-1;index>=0;index--) {
			
			System.out.print(charArray[index]);
	}
		

	}

}

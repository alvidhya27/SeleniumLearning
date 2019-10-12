package week1.day2;

public class SumOfAllDigits {

	public static void main(String[] args) {

		String str = "1546";
		int sum =0;
		char[] charArray = str.toCharArray();
		int length = str.length();
		for(int index=0;index<length;index++) {
			int digit=Character.getNumericValue(charArray[index]);
			sum = sum+digit;
						
		}
		System.out.println("Sum of the Input" +" 1546 " + "is " +sum);
	}
}

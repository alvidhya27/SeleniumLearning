package week1.day1;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		
		int sum=0;
		for(int a=1;a<=100;a++) {
			
			int num = a%2;
			if (num > 0) {
				sum=sum+a;
			}
			
			}
		System.out.println(sum);

	}

}

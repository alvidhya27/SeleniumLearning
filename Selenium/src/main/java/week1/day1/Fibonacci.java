package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		int a = 0;
		int b = 1;
		for (int i=0;i<20;i++) {
			
			System.out.print( a + ",");
			int Sum = a+b;
			a=b;
			b=Sum;

			
			
		}

	}

}

package week1.day1;

public class CallCalculater {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		//Create Object for Calculator class
		Calculater cal =new Calculater();
		
		int Add = cal.add(a,b);
		int Sub = cal.subtraction(a, b);
		int Mul = cal.multiplication(a, b);
		int Div = cal.division(a, b);
		System.out.println("Addition value is "+(Add));
		System.out.println("Subtraction value is "+(Sub));
		System.out.println("Multiplication value is "+(Mul));
		System.out.println("Division value is "+(Div));
	
		
	}

}

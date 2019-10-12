package week1.day2;

public class CalculatorSwitch {

	public static void main(String[] args) {
		
		CallSwitchCalc calc = new CallSwitchCalc();
		int choice =1;
		int a =20;
		int b =20;
		switch(choice) {
		case 1:
			System.out.println(calc.Addition(a,b));
		break;
		case 2:
			System.out.println(calc.Subtraction(a,b));
		break;
		case 3:
			System.out.println(calc.Multiplication(a,b));
		break;
		default:
			System.out.println(calc.Division(a,b));
			
		}
			
		
	}
	
}

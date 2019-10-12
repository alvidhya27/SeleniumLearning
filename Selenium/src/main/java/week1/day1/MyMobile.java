package week1.day1;

public class MyMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating Object 
		Mobile mob = new Mobile();
		
		//Getting variable1 
		String printmodel=mob.model;
		System.out.println(printmodel); 
		
		//Getting Variable 2
		boolean radio =mob.radio;
		System.out.println(radio);
		
		//Getting Method1
		String phonemodel =mob.ModelOfPhone();
		System.out.println(phonemodel);
		
		//Getting Method2
		int mobnum = mob.MyPhoneNumber();
		System.out.println(mobnum);
		

	}

}

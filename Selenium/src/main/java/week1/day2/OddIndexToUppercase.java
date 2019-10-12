package week1.day2;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		
		String str = "changeme";
		System.out.println("Original String:" +str);
		char[] model = str.toCharArray();
		int length = str.length();
		for(int index=0;index<=length-1;index++) {
			
			int count = index%2;
			if(count==0) {
				char b = model[index];
				System.out.print(b);
			}
			if(count!=0) {
				char c = model[index];
				char d=Character.toUpperCase(c);
					System.out.print(d);
			}
	}

}
}

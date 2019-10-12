package week1.day2;

public class ReverseEvenString {

	public static void main(String[] args) {
		
		String str = "I am a Software Tester";
		String[] split = str.split(" ");
		int length = split.length;
		//System.out.println(length);
		
		for(int index=0;index<length;index++) {
			
			int count = index%2;
			if(count ==0) {
				System.out.println(split[index]);
			}
			
			if (count!= 0) {
		StringBuffer sb = new StringBuffer(split[index]);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
			}
			
		}
	}

}

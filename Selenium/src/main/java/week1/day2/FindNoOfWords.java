package week1.day2;

public class FindNoOfWords {

	public static void main(String[] args) {
		int count=0;
		String str1="India";
		String str="Amazon India development center has been established in year 2004 and has presence in 24 cities within India";
		String[] split = str.split(" ");
		for(String eachword:split) {
			
			if(eachword.contains(str1)) {
				count=count+1;
			}
			
		}
		System.out.println(count);
		
			
		
}
}
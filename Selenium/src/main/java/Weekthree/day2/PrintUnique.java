package Weekthree.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PrintUnique {

	public static void main(String[] args) {
		String MyName="PayPal India";
		char[] charArray = MyName.toCharArray();
		//Create an empty map
		Map<Character, Integer> obj = new HashMap<Character,Integer>();
				
		
		for (char checkchar : charArray) {
			
			if(obj.containsKey(checkchar)) {
				//System.out.println(obj.get(checkchar));
				obj.put(checkchar, obj.get(checkchar)+1);
			}
			else {
				obj.put(checkchar, 1);
				
			}
		}
		Set<Character> unique = obj.keySet();
		for(Character print:unique) {
			if(obj.get(print)==1) {
				System.out.print(print);
				
			}
			
		}
	}
}
			
					
	
	
	



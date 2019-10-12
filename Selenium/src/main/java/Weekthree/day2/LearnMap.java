package Weekthree.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		
		String MyName="neena";
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
		
		System.out.println(obj);
		
		
	}

}

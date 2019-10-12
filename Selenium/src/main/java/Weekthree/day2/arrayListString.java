package Weekthree.day2;

import java.util.ArrayList;
import java.util.List;

public class arrayListString {

	public static void main(String[] args) {
		List<String> reverseString = new ArrayList<String>();
		reverseString.add("Name1");
		reverseString.add("Name2");
		reverseString.add("Name3");
		reverseString.add("Name4");
		reverseString.add("Name5");
		int size = reverseString.size();
		
		for(int index=size-1;index>=0;index--) {
			System.out.println(reverseString.get(index));
		}
		
	}

}

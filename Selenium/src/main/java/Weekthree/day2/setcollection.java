package Weekthree.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setcollection {

	public static void main(String[] args) {
		
		Set<String> obj = new HashSet<String>();
		obj.add("sName1");
		obj.add("Name2");
		obj.add("Name3");
		obj.add("sName4");
		obj.add("sName5");
				
		for(String eachitem: obj) {
			boolean startsWith = eachitem.startsWith("s");
			if (startsWith) {
				System.out.println(eachitem);
			}
					
			}
		
					
	}

}

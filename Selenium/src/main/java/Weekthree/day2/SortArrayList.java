package Weekthree.day2;

import java.util.ArrayList;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		
		List<String> obj = new ArrayList<String>();
		obj.add("HCL");
		obj.add("CTS");
		obj.add("Aspire Systems");
		int ArraySize = obj.size();
		for(int index=ArraySize-1;index >=0;index--) {
			System.out.println(obj.get(index));
		}

	}

}

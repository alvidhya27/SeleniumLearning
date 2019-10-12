package week1.day2;

import java.util.Arrays;

public class EliminateDuplicateArray {

	public static void main(String[] args) {
		
		int[] num = new int[] {1,2,1,22,23,34,44,33,34,22,1,34};
		int length = num.length;
		int i =0 ;
		int len1=length-1;
		Arrays.sort(num);
		for(int index=0;index<=len1;index++) {
			
			 i = num[index];
			 if (num[index]==num[len1]) {
				 System.out.println(num[index]);
			 }
			 else if(i!=num[index+1]) {
				  
				 System.out.println(num[index]);	  
			 }
				 		
					
			 
		}
	}
	
}
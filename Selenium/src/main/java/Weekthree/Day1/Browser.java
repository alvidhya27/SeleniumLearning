package Weekthree.Day1;

public class Browser {

	public void url() {

			System.out.println("www.amazon.in");
	}
	
	public void title() {
		System.out.println("Browser class");
	}
	
	public void name() {
		System.out.println("Amazon Online Retail");
	}
	
	public void name(String WhichTitle) {
	
		if(WhichTitle.equals("Amazon Homepage"))
		{
			System.out.println("Yes");
		}
			else
			System.out.println("No");
		}
			
	}
	


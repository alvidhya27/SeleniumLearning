package Weekthree.Day1;

public class ChromeClass extends Browser {
	
public void title() {
	
	System.out.println("Chrome child title is printing ");
	
}

public static void main(String args[]) {
	ChromeClass child = new ChromeClass();
	child.title();
	child.name("Amazon");
	
}

	
}

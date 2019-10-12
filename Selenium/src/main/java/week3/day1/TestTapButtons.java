package week3.day1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTapButtons {

	public static void main(String[] args) {
		// Launching the Browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/drivers/Chromedriver/chromedriver76.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launching the URL
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		
		//Click to Navigate to Home Page
		driver.findElementById("home").click();
		
		//Get position of the Button
		Point location = driver.findElementById("position").getLocation();
		System.out.println(location);


	}

}
	
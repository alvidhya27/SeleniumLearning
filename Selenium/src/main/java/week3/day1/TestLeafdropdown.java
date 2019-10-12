package week3.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafdropdown {

	public static void main(String[] args) {
		
		// Launching the Browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/drivers/Chromedriver/chromedriver76.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launching the URL
		driver.get("https://testleaf.herokuapp.com/pages/Dropdown.html");
		List<WebElement> NumberofDropdown = driver.findElementsByTagName("select");
		int size = NumberofDropdown.size();
		System.out.println(size);
		WebElement FirstDropDown = NumberofDropdown.get(0);
		System.out.println(FirstDropDown);
		
		
	}

}

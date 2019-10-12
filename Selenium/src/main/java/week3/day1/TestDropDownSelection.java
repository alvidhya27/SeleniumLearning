package week3.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDownSelection {

	public static void main(String[] args) {
		
		// Launching the Browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/drivers/Chromedriver/chromedriver76.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launching the URL
		driver.get("https://testleaf.herokuapp.com/pages/Dropdown.html");
		WebElement dropdown1 = driver.findElementById("dropdown1");
		Select sc = new Select(dropdown1);
		List<WebElement> options = sc.getOptions();
		int size = options.size();
		System.out.println(size);
		sc.selectByIndex(size-1);
		
	}

}

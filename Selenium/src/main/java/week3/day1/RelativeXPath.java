package week3.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RelativeXPath {

	public static void main(String[] args) {
		
		// Launching the Browser
				System.setProperty("webdriver.chrome.driver", "./Drivers/drivers/Chromedriver/chromedriver76.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				//Launching the URL
				driver.get("https://www.amazon.in/");
				
				//Select Electronic Category from Dropdown
				WebElement dropdown1 = driver.findElementByXPath("//select[@id='searchDropdownBox']");
				Select sel = new Select(dropdown1);
				sel.selectByVisibleText("Electronics");
				
				//Enter Redmi in the Search
				driver.findElementById("twotabsearchtextbox").sendKeys("RedMI",Keys.ENTER);
				
				//Print the Price of the second item
				WebElement price = driver.findElementByXPath("(//span[@class='a-price-whole'])[2]");
				String text = price.getText();
				System.out.println(text);
				

	}

}

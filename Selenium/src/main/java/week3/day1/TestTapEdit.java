package week3.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTapEdit {

	public static void main(String[] args) {
		
		// Launching the Browser
				System.setProperty("webdriver.chrome.driver", "./Drivers/drivers/Chromedriver/chromedriver76.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				//Launching the URL
				driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
				
				//Enter the email
				driver.findElementById("email").sendKeys("alvidhya27@gmail.com");
				
				//Append Text
				WebElement eleAppend = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input");
				String text = eleAppend.getText();
				eleAppend.sendKeys("Vidhya"+text);
				eleAppend.sendKeys(Keys.TAB);
				
				//Get the Default Text
				
				String ExistingText = driver.findElementByName("username").getAttribute("value");
				System.out.println(ExistingText);
				
				//Clear the Text in Text Box
				driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input").clear();
				
				//Identify the disabled field
				boolean enabled = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input").isEnabled();
				System.out.println(enabled);
				
	
	}

}

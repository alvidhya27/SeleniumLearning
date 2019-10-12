package week3.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// Launching the Browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/drivers/Chromedriver/chromedriver76.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launching the URL
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		
		//Action builder class
		Actions builder = new Actions(driver);
		WebElement dragpath = driver.findElementByXPath("//p[text()='Drag me to my target']");
		WebElement droppath = driver.findElementById("droppable");
		builder.dragAndDrop(dragpath, droppath).perform();
		
	}

}

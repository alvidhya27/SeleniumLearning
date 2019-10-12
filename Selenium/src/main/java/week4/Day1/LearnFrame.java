package week4.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		
		// Launching the Browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/drivers/Chromedriver/chromedriver76.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Launching the URL
		driver.get("https:www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		
		//Switching to the Frame
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Thread.sleep(1000);
		//Accepting the prompt alert
		driver.switchTo().alert().sendKeys("Vidhya");
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		//driver.switchTo().frame("iframeResult");
		WebElement VerifyName = driver.findElementByXPath("//p[text()='Hello Vidhya! How are you today?']");
		String text = VerifyName.getText();
		System.out.println(text);
		boolean contains = text.contains("Vidhya");
		System.out.println(contains);
		

	}

}

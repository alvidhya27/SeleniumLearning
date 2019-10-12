package week3.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class erailxpath {

	public static void main(String[] args) throws InterruptedException {

		// Launching the Browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/drivers/Chromedriver/chromedriver76.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launching the URL
		driver.get("https://erail.in/");
		
		//Input MAS in From Station
		WebElement fromstation = driver.findElementById("txtStationFrom");
		fromstation.clear();
		fromstation.sendKeys("MAS",Keys.TAB);
		
		//Clear and Input SBC in ToStation
		WebElement Tostation = driver.findElementById("txtStationTo");
		Tostation.clear();
		Tostation.sendKeys("SBC",Keys.TAB);
		Thread.sleep(3000);
		
		//Print the Train Number of Mysuru Express
		WebElement trainnumber = driver.findElementByXPath("//tr[@data-id='2214']/td/a");
		String trainnum = trainnumber.getText();
		System.out.println(trainnum);
		
		Thread.sleep(3000);
		
		//print the departure time of train 12007
		WebElement deptime = driver.findElementByXPath("(//tr[@data-id='1447']/td)[4]");
		String time = deptime.getText();
		System.out.println(time);
	}

}

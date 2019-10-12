package week4.Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		// Launching the Browser
				System.setProperty("webdriver.chrome.driver", "./Drivers/drivers/Chromedriver/chromedriver76.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//Launching the URL
				driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
				
				//click on Contact Us
				driver.findElementByLinkText("Contact Us").click();
				
				//Windows Handling
				Set<String> windowHandles = driver.getWindowHandles();
				List<String> lst = new ArrayList<String>(windowHandles);
				String windowref = lst.get(1);
				driver.switchTo().window(windowref);
				System.out.println(windowref);
				
				String title = driver.getTitle();
				System.out.println(title);
				String currentUrl = driver.getCurrentUrl();
				System.out.println(currentUrl);
				
				//Switch back to window 
				String windowref1 = lst.get(0);
				driver.switchTo().window(windowref1);
				driver.close();
	}

}

package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeaftapsAutomation {

	public static void main(String[] args) {
		// Launching the Browser
				System.setProperty("webdriver.chrome.driver", "./Drivers/drivers/Chromedriver/chromedriver76.exe");
				
				ChromeOptions ops = new ChromeOptions();
				ops.addArguments("--disable-notifications");
				ChromeDriver driver=new ChromeDriver(ops);
				
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				
				//Launching the URL
				driver.get("http://leaftaps.com/crmsfa/control/main");
				
				//Enter username and password
				driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("demosalesmanager");
				driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
				
				//click on Login
				driver.findElementByClassName("loginButton").click();
				
				//click on Leads link
				driver.findElementByLinkText("Leads").click();
				
				//Click on Merge leads link
				driver.findElementByLinkText("Merge Leads").click();
				
				//Click on from lead icon
				driver.findElementByXPath("(//img[@alt='Lookup'])["+1+"]").click();
				
				//Switch to other window - Window Handling
				
				Set<String> windowHandles = driver.getWindowHandles();
				List<String> lst = new ArrayList<String>(windowHandles);
				String windowref = lst.get(1);
				driver.switchTo().window(windowref);
				driver.manage().window().maximize();
				//String title = driver.getTitle();
				//System.out.println(title);
				
				//Enter the Lead ID  
				driver.findElementByXPath("//div[@id='x-form-el-ext-gen25']/input").sendKeys("10077");
				
				//Click on find leads
				driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
				
				//Click on the first resulting link 
				driver.findElementByLinkText("10077").click();
				//Switch back to primary window 
			
				String windowref1 = lst.get(0);
				driver.switchTo().window(windowref1);
				
				//Enter to Lead
				driver.findElementByXPath("(//input[@class='XdijitInputField dijitInputFieldValidationNormal'])["+2+"]").sendKeys("10080");
				
				//click on Merge Lead
				driver.findElementByLinkText("Merge").click();
				
				//Switch and accept the alert
				driver.switchTo().alert().accept();
				
				//click on find leads link
				driver.findElementByLinkText("Find Leads").click();
				
				//Enter From leads ID
				driver.findElementByXPath("//div[@id='x-form-el-ext-gen246']/input").sendKeys("10077");
				
								
				//Click on Find leads Button
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				
				//Verify the Message
				String text = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
				System.out.println(text);
				
				//close the browser
				driver.close();

		
	}

}

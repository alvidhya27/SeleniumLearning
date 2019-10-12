package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafTaps {

	public static void main(String[] args) {
		
		// Launching the Browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/drivers/Chromedriver/chromedriver76.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launching the URL
		driver.get("http:leaftaps.com/opentaps");
		
		//Login with Username & Password
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Open CRMSFA
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Create Lead
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TVSNEXT");
		driver.findElementById("createLeadForm_firstName").sendKeys("Vidhya");
		driver.findElementById("createLeadForm_lastName").sendKeys("Alagappan");
		driver.findElementByClassName("smallSubmit").click();
		
		//Print the Title of the Page
		String title = driver.getTitle();
		System.out.println(title);
	}

}

package tc001_ACME;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC001_FirstFlow {

	public  static ChromeDriver driver;
	@Parameters({"url"})
	@Test
	public void EndToEndFlow(String url ) throws InterruptedException {
		
		// Launching the Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver76.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Launching the URL
		driver.get(url);
		
		//Enter the Username 
		WebElement Username = driver.findElementById("email");
		Username.sendKeys("kumar.testleaf@gmail.com");
		
		//Enter the password
		driver.findElementById("password").sendKeys("leaf@12");
		
		//Click Login
		driver.findElementById("buttonLogin").click();
		
					
		//Mouse hover on Vendor 
		Actions builder = new Actions(driver);
		WebElement VendorButton = driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])["+4+"]");
		builder.moveToElement(VendorButton).perform();
		
		
		//Click on Search Vendor
		driver.findElementByLinkText("Search for Vendor").click();
		
		//Enter vendor Name 
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		
		//Click on Search
		driver.findElementById("buttonSearch").click();
		
		Thread.sleep(2000);
		
		//Find the Country Name
		WebElement VendorTable = driver.findElementByXPath("//table[@class='table']");
		List<WebElement> Rows = VendorTable.findElements(By.tagName("tr"));
		int countofrow = Rows.size();
		System.out.println(countofrow);
		
		for(int index=1;index<countofrow;index++) {
			
		WebElement numrow = Rows.get(index);
		
		//Fetch the Columns under the table with tag <td>
		List<WebElement> numcolumn = numrow.findElements(By.tagName("td"));
		String text = numcolumn.get(4).getText();
		System.out.println(text); 
		}
		
		//Click on LogOut
		driver.findElementByLinkText("Log Out").click();
		
		//Close the Browser
		driver.close();
		
		
	}
	
	
}

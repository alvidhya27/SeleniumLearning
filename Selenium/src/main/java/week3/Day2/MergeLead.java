package week3.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MergeLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName = "MergeLeadData";
	}
	@Test(dataProvider="getdata")
	public void RunMergeLead(String FirstName) throws InterruptedException {
		
				
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
				
				//Enter the Firstname
				driver.findElementByXPath("//input[@name='firstName']").sendKeys(FirstName);
							
				//Click on find leads
				 driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
				 Thread.sleep(3000);
				 
				//Fetching the table to select the first row of the table(first resulting lead)
				WebElement TablePath = driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]");
				List<WebElement> Rows = TablePath.findElements(By.tagName("tr"));
				WebElement RowOne = Rows.get(0);
				List<WebElement> Columns = RowOne.findElements(By.tagName("td"));
				WebElement Columnone = Columns.get(0);
				Columnone.findElement(By.className("linktext")).click();
						
				String windowref1 = lst.get(0);
				driver.switchTo().window(windowref1);
				driver.manage().window().maximize();
				
				//Enter To lead Link icon
				driver.findElementByXPath("(//img[@alt='Lookup'])["+2+"]").click();
				
				//Switch to other window - Window Handling
				
				Set<String> windowHandles1 = driver.getWindowHandles();
				List<String> lst1 = new ArrayList<String>(windowHandles1);
				
				String windowref11 = lst1.get(1);
				System.out.println(windowref11);
				driver.switchTo().window(windowref11);
				driver.manage().window().maximize();
				
				String windowref111 = lst1.get(1);
				driver.switchTo().window(windowref111);
				driver.manage().window().maximize();
				
				//Enter the Firstname
				driver.findElementByXPath("//input[@name='firstName']").sendKeys(FirstName);
				
				//Click on find leads
				driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
								
				 Thread.sleep(3000);
				 //Enter To Lead 
				 driver.findElementByXPath("(//a[@class='linktext'])["+6+"]").click();
								
				
				Thread.sleep(3000);

				 
				String windowref1111 = lst.get(0);
					driver.switchTo().window(windowref1111);
				
				//click on Merge Lead
				driver.findElementByLinkText("Merge").click();
				
				//Switch and accept the alert
				driver.switchTo().alert().accept();
				
				//click on find leads link
				driver.findElementByLinkText("Find Leads").click();
				
				//Enter From leads ID
				//driver.findElementByXPath("//div[@id='x-form-el-ext-gen246']/input").sendKeys("10077");
				
								
				//Click on Find leads Button
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				
				//Verify the Message
				String text = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
				System.out.println(text);
				
				
		
	}

}

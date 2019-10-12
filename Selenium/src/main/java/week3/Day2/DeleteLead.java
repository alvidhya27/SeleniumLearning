package week3.Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName = "DeleteLeadData";
	}
	@Test(dataProvider = "getdata")
	public void RunDeleteLead(String PhoneAreaCode,String PhoneNumber) throws InterruptedException {
				
		//Click Leads Button
		driver.findElementByLinkText("Leads").click();
		
		Thread.sleep(3000);
		
		//Click on find leads button
		driver.findElementByLinkText("Find Leads").click();
		
		//Click on Phone tab
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
		
		//enter Phone number
		driver.findElementByName("phoneAreaCode").sendKeys(PhoneAreaCode,Keys.TAB);
		driver.findElementByName("phoneNumber").sendKeys(PhoneNumber);
		
		//Click on Find lead button 
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);
		
		//Capture first lead ID
		WebElement Table = driver.findElementByXPath("//table[@class='x-grid3-row-table']");
		List<WebElement> Rows = Table.findElements(By.tagName("tr"));
		WebElement NumRow = Rows.get(0);
		List<WebElement> Column = NumRow.findElements(By.tagName("td"));
		String text = Column.get(0).getText();
		System.out.println(text);
		
		//Click on the first resulting lead
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		
		Thread.sleep(3000);
		//Click on delete lead
		driver.findElementByLinkText("Delete").click();
		
		Thread.sleep(3000);
		
		//Click on Find lead button 
		driver.findElementByLinkText("Find Leads").click();
		
		Thread.sleep(3000);
		//Enter the Captured lead ID
		driver.findElementByXPath("//input[@name='id']").sendKeys(text);
		
		//Click on Find lead button 	
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);
		
		//Verify the message 
		String Message = driver.findElementByXPath("//div[text()='No records to display']").getText();
		System.out.println(Message);
		
	}

}

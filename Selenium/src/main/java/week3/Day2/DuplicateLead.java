package week3.Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DuplicateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {
		excelFileName = "DuplicateLeadData";
	}
	@Test(dataProvider = "getdata")
	public void RunDuplicateLead(String Email) throws InterruptedException {
		
				//Click Leads Button
				driver.findElementByLinkText("Leads").click();
				
				Thread.sleep(3000);
				
				//Click on find leads button
				driver.findElementByLinkText("Find Leads").click();
				
				//click on Email Tab
				driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
				
				Thread.sleep(2000);
				
				//Enter the Email Id
				driver.findElementByXPath("//input[@name='emailAddress']").sendKeys(Email);
				
				//Click on Find lead button 
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				
				Thread.sleep(3000);
				
				//Capture first lead ID
				WebElement Table = driver.findElementByXPath("//table[@class='x-grid3-row-table']");
				List<WebElement> Rows = Table.findElements(By.tagName("tr"));
				WebElement NumRow = Rows.get(0);
				List<WebElement> Column = NumRow.findElements(By.tagName("td"));
				String text = Column.get(2).getText();
				System.out.println("Captured Lead "+text);
				
				//Click on the first resulting lead
				driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
				
				Thread.sleep(3000);
				
				//click on Duplicate lead button
				driver.findElementByLinkText("Duplicate Lead").click();
				
				Thread.sleep(3000);
				
				String DuplicateLead = driver.getTitle();
				System.out.println(DuplicateLead);
				
				//Click on CreateLead
				driver.findElementByXPath("//input[@class='smallSubmit']").click();
				
				//Find Duplicate Lead
				String DuplicateLeadName = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
				System.out.println("Captured Lead "+DuplicateLeadName);
				
				//Compare Captured and Duplicate Lead Names 
				if(text.equals(DuplicateLeadName)) {
					System.out.println("Matches");
				}
	}

}

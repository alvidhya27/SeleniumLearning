package week3.Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {
		excelFileName = "EditLeadData";
	}
	
		
	@Test(dataProvider="getdata")
	
	public void RunEditLead(String fname,String cname) throws InterruptedException {
		
							
				//Click Leads Button
				driver.findElementByLinkText("Leads").click();
				
								
				//Click on find leads button
				driver.findElementByLinkText("Find Leads").click();
				
				
				//Enter first name 
				driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(fname);
				
				//click on find leads button
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				
				Thread.sleep(3000);
				//Fetching the table to select the first row of the table(first resulting lead)
				WebElement TablePath = driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]");
				List<WebElement> Rows = TablePath.findElements(By.tagName("tr"));
				WebElement RowOne = Rows.get(0);
				List<WebElement> Columns = RowOne.findElements(By.tagName("td"));
				WebElement Columnone = Columns.get(0);
				Columnone.findElement(By.className("linktext")).click();
					
				//Verify title of the page
				String EditLeadTitle = driver.getTitle();
				System.out.println(EditLeadTitle);
				
				//Click on Edit button
				driver.findElementByLinkText("Edit").click();
				
				
				
				//Change the Company Name 
				driver.findElementById("updateLeadForm_companyName").clear();
				driver.findElementById("updateLeadForm_companyName").sendKeys(cname);
				
				//Click on Update
				driver.findElementByXPath("//input[@value='Update']").click();
				
				Thread.sleep(3000);
				
				//Verify the changes
				WebElement Compname = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']");
				String ChangedComp = Compname.getText();
				System.out.println(ChangedComp);
				
		}

}

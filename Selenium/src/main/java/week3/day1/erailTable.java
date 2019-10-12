package week3.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class erailTable {

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
				
				//Uncheck the check box
				driver.findElementById("chkSelectDateOnly").click();
				
				
						
				
				//Fetch the Table & identify the table 
				WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
				
				//Fetch the Rows under the table with tagname <tr>
				List<WebElement> rows = table.findElements(By.tagName("tr"));
				
				System.out.println(rows.size());
				int countofrow = rows.size();
				
				
				for(int index=0;index<=countofrow-1;index++) {
				
				WebElement numrow = rows.get(index);
				
				//Fetch the Columns under the table with tag <td>
				List<WebElement> numcolumn = numrow.findElements(By.tagName("td"));
				//System.out.println(numcolumn.size());
				String text = numcolumn.get(1).getText();
				System.out.println(text); 
				}
				
				//Close the browser
				driver.close();
			
					}

}

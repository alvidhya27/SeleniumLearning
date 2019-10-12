package week3.Day2;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	
	public String excelFileName;
	public  static ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void startapp(String url, String username,String password ) {
	
	// Launching the Browser
			System.setProperty("webdriver.chrome.driver", "./Drivers/drivers/Chromedriver/chromedriver76.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//Launching the URL
			driver.get(url);
			
			//Login with Username & Password
			
			driver.findElementById("username").sendKeys(username);
			driver.findElementById("password").sendKeys(password);
			driver.findElementByClassName("decorativeSubmit").click();
			
			//Open CRMSFA
			
			driver.findElementByLinkText("CRM/SFA").click();

}
	
	@AfterMethod()
	public void teardown()
	{
		driver.close();
	}
	
	@DataProvider (name="getdata")
	public Object[][] fetchData() throws IOException{
		
		return	ReadExcel.ReadExcelData(excelFileName);
	 			
					

	}
}

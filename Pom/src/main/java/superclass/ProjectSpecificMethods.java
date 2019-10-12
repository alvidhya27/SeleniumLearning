package superclass;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class ProjectSpecificMethods {
	
	public String excelFileName;
	public  static ChromeDriver driver;
	@Parameters({"url"})
	@BeforeMethod
	public void startapp(String url ) {
	
	// Launching the Browser
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver76.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//Launching the URL
			driver.get(url);
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

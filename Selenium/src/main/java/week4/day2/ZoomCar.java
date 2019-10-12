package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) {
		
				// Launching the Browser
				System.setProperty("webdriver.chrome.driver", "./Drivers/drivers/Chromedriver/chromedriver76.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				
				//Launching the URL
				driver.get("https://www.zoomcar.com/chennai/");
				
				//Click on Start your journey 
				
				driver.findElementByLinkText("Start your wonderful journey").click();
				
				//Click on kodampakkam 
				driver.findElementByXPath("//div[contains(text(),'Kodambakkam')]").click();
				
				//Click on Next Button
				driver.findElementByXPath("//button[text()=\"Next\"]").click();
				
				//Click on Next Day to Book car
				driver.findElementByXPath("//div[contains(text(),'Mon')]").click();
				
				//Click on Next Button
				driver.findElementByXPath("//button[text()=\"Next\"]").click();
				
				//Click on Date Again
				//driver.findElementByXPath("//div[contains(text(),'Mon')]").click();
								
				//Click on Done Button
				driver.findElementByXPath("//button[text()='Done']").click();
				
				//Getting the list of low priced Items 
				List<WebElement> price = driver.findElements(By.className("price"));
				List<Integer> FinalPrice = new ArrayList<Integer>();
				int NoofCars = price.size();
				System.out.println(NoofCars);
				
				for(int index=1;index<=NoofCars;index++) {
										
					String priceofcars = driver.findElementByXPath("(//div[@class='price'])["+index+"]").getText();
					String replacestring = priceofcars.replaceAll("\\D", "");
					int parseInt = Integer.parseInt(replacestring);
					System.out.println(parseInt);
					FinalPrice.add(parseInt);
					
				}
				
				Integer FinalMinPrice = Collections.min(FinalPrice);
				System.out.println("Minimum fare of car is "+ FinalMinPrice);
				
				
				
							

	}

}

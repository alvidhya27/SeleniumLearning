package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FaceBook_TestLeaf {

	public static void main(String[] args) {
		
		// Launching the Browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/drivers/Chromedriver/chromedriver76.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ops);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Launching the URL
		driver.get("https://www.facebook.com/");
		
		//Enter UserName
		driver.findElementById("email").sendKeys("alvidhya27@gmail.com");
		
		//Enter Password
		driver.findElementById("pass").sendKeys("Jiya@2015");
		
		//Click on Login 
		driver.findElementByXPath("//input[@value='Log In']").click();
		
		//Click on Search 
		driver.findElementByXPath("//input[@class='_1frb']").click();
		
		//Enter Test leaf in Search
		driver.findElementByXPath("//input[@class='_1frb']").sendKeys("Testleaf");
		
		//Click on Search option (Magnifier)
		driver.findElementByXPath("//i[@class='_585_']").click();
		
		//Click on Places
		driver.findElementByPartialLinkText("Places").click();
		
		//Whether the Name is present as Testleaf
		boolean CheckName = driver.findElementByLinkText("TestLeaf").isDisplayed();
		System.out.println(CheckName);
		
		//Print Text of like button
		String TextOfLikeButton = driver.findElementByXPath("(//button[@class='likeButton _4jy0 _4jy3 _517h _51sy _42ft'])[1]").getText();
		System.out.println(TextOfLikeButton);
		
		//verify if the link is clicked already 
		
		if(TextOfLikeButton.equalsIgnoreCase("Like")) {
			
			driver.findElementByXPath("(//button[@class='likeButton _4jy0 _4jy3 _517h _51sy _42ft'])["+1+"]").click();
			
		}
		else {
			System.out.println("The page is already liked");
		}
		
		//click on the testleaf link
		driver.findElementByLinkText("TestLeaf").click();
		
		//get the title of the page
		String titleofthepage = driver.getTitle();
		System.out.println(titleofthepage);
		boolean contains = titleofthepage.contains("testleaf");
		System.out.println(contains);
		
		//Print the number of likes in the testleaf page
		WebElement likes = driver.findElementByXPath("(//div[@class='_4bl9'])["+3+"]/div");
		String NumberOfLikes = likes.getText();
		System.out.println(NumberOfLikes);
		
		//close the browser
		
		driver.close();
			
		
								

	}

}

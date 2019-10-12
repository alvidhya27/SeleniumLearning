package Implementation;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class createLead_implementation {
	public ChromeDriver driver;
	@Given("Open the Chrome browser")
	public void open_the_Chrome_browser() {
		// Launching the Browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/drivers/Chromedriver/chromedriver76.exe");
		driver = new ChromeDriver();
	   	}

	@Given("Maximize the browser")
	public void maximize_the_browser() {
		driver.manage().window().maximize();
	   
	}

	@Given("Launch the URL")
	public void launch_the_URL() {
		driver.get("http:leaftaps.com/opentaps");
	    
	}

	@Given("Enter the UserName as (.*)")
	public void enter_the_UserName(String Username) {
		driver.findElementById("username").sendKeys(Username);
	    
	}

	@Given("Enter the Password as (.*)")
	public void enter_the_Password(String Password) {
		driver.findElementById("password").sendKeys(Password);
	    
	}

	@When("Click on the Login")
	public void click_on_the_Login() {
		driver.findElementByClassName("decorativeSubmit").click();
	    
	}

	@Then("Login Poistive result")
	public void login_Poistive_result() {
	    System.out.println("Successful");
	    
	}

	@Given("Click on CRM/SFA Link")
	public void click_on_CRM_SFA_Link() {
		driver.findElementByLinkText("CRM/SFA").click();
	    
	}
	
	@Given("Click On CreateLead")
	public void ClickCreateLead() {
		//Create Lead
		driver.findElementByLinkText("Create Lead").click();
	   
	}
	
	@Given("Enter the FirstName as (.*)")
	public void enter_the_FirstName(String FirstName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(FirstName);
	    
	}

	@Given("Enter the LastName as (.*)")
	public void enter_the_LastName(String LastName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(LastName);
	   
	}

	@Given("Enter the CompanyName as (.*)")
	public void enter_the_CompanyName(String CompanyName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(CompanyName);
	    
	}

	@When("Click on CreateLead")
	public void click_on_CreateLead() {
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
	   
	}

	@Then("CreateLead positive Result")
	public void createlead_positive_Result() {
	    
		System.out.println("CreateLead done Successfully");
	    
	}
	@But("CreateLead Negative Result")
	public void createlead_Negative_Result(){
		System.out.println("CreateLead Failed");
		
	}


	
}

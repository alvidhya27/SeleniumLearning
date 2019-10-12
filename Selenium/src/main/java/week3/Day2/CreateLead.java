package week3.Day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {
		excelFileName = "CreateLeadData";
	}
	
	@Test(dataProvider="getdata")
	
	
	public void RunCreateLead(String cname,String fname,String lname,String email,String fnameLocal,String lnameLocal,String Title,String ptitle,String Leadfdescription,String ARenevue,String siccode,String impnote,String countcode,String areacode,String postcode,String deptname,String NoOfEmp,String tickerSymbol,String primaryname,String PrimaryWebUrl,String GeneralToName,String Addr1,String City,String PostalCode,String PostExt,String PrimaryPhoneNumber)  {
				
		//Create Lead
		driver.findElementByLinkText("Create Lead").click();
		
		//Name & Personal Title
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys(fnameLocal);
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys(lnameLocal);
		driver.findElementById("createLeadForm_personalTitle").sendKeys(Title);
		driver.findElementById("createLeadForm_primaryEmail").sendKeys(email);
		
		
		// Dropdowns
		WebElement SourceDropdown = driver.findElementByXPath("//select[@name='dataSourceId']");
		Select SourceOption = new Select(SourceDropdown);
		SourceOption.selectByVisibleText("Direct Mail");
		
		WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
		Select IndustryOption = new Select(Industry);
		IndustryOption.selectByVisibleText("Computer Software");
		
		WebElement Ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select OwnershipOption = new Select(Ownership);
		OwnershipOption.selectByValue("OWN_PARTNERSHIP");
		
		WebElement PrefCurrency = driver.findElementById("createLeadForm_currencyUomId");
		Select PrefCurrencyOption = new Select(PrefCurrency);
		PrefCurrencyOption.selectByIndex(2);
		
		WebElement StateProvince = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select StateProvinceOptions = new Select(StateProvince);
		StateProvinceOptions.selectByIndex(1);
		
		WebElement Country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select CountryOptions = new Select(Country);
		CountryOptions.selectByIndex(3);
		
		WebElement MarCampaingn = driver.findElementById("createLeadForm_marketingCampaignId");
		Select MarCampaingnOpn = new Select(MarCampaingn);
		MarCampaingnOpn.selectByIndex(3);
		
		//Other Text Input
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys(ptitle);
		driver.findElementById("createLeadForm_annualRevenue").sendKeys(ARenevue);
		driver.findElementByName("sicCode").sendKeys(siccode);
		driver.findElementById("createLeadForm_description").sendKeys(Leadfdescription);
		driver.findElementById("createLeadForm_importantNote").sendKeys(impnote);
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys(countcode);
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys(areacode);
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys(postcode);
		driver.findElementById("createLeadForm_departmentName").sendKeys(deptname);
		driver.findElementById("createLeadForm_numberEmployees").sendKeys(NoOfEmp);
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys(tickerSymbol);
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys(primaryname);
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys(PrimaryWebUrl);
		driver.findElementById("createLeadForm_generalToName").sendKeys(GeneralToName);
		driver.findElementById("createLeadForm_generalAddress1").sendKeys(Addr1);
		driver.findElementById("createLeadForm_generalCity").sendKeys(City);
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys(PostalCode);
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys(PostExt);
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(PrimaryPhoneNumber);
		
		
		
		//Click Create Lead
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		//Verify the First name
		//String FirstNameCom = driver.findElementById("viewLead_firstName_sp").getText();
		//boolean equals = FirstNameCom.equals("Vidhya");
		//System.out.println(equals);
		
	}



}

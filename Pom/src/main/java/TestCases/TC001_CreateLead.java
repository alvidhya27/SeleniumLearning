package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import superclass.ProjectSpecificMethods;

public class TC001_CreateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {
		excelFileName = "inputlogin";
	}
	
	@Test(dataProvider="getdata")
	public void createLead(String Username,String Password,String firstname,String lastname,String cname) {
		
		new LoginPage()
		.enterUsername(Username)
		.enterPassword(Password)
		.clickLogin()
		.clickCRMSFALink()
		.clickLeads()
		.ClickCreateLead()
		.EnterFirstName(firstname)
		.EnterLastName(lastname)
		.EnterCompanyName(cname)
		.ClickCreate()
		.verifyName();	
		
		
		
	}
}



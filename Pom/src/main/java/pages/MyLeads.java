package pages;

import superclass.ProjectSpecificMethods;

public class MyLeads extends ProjectSpecificMethods {
	
	public MyLeads EnterFirstName(String firstname) {
		
		driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
		return this;
		
	}
	public MyLeads EnterLastName(String lastname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lastname);	
		return this;
	}
	public MyLeads EnterCompanyName(String cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		return this;
	}
	public viewLeads ClickCreate() {
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		return new viewLeads();
		
	}

}

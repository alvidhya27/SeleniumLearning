package pages;

import superclass.ProjectSpecificMethods;

public class findleadsPage extends ProjectSpecificMethods{
	

	
	public findleadsPage EnterFirstName() {
		
		//Enter FirstName 
		driver.findElementById("createLeadForm_firstName").sendKeys("vidhya");
		return this;
		
	}
	
	public findleadsPage findLeads() {
		
		//Click on FindLeads
		driver.findElementByLinkText("Find Leads").click();
		return this;
		
	}

}

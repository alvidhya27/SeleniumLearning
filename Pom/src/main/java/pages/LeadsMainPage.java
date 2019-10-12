package pages;

import superclass.ProjectSpecificMethods;

public class LeadsMainPage extends ProjectSpecificMethods {
	
	public LeadsMainPage clickLeads() {
		
		//Click on Leads Button 
		driver.findElementByLinkText("Leads").click();
		return this;
		
		
	}
	
	public MyLeads ClickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new MyLeads();
	}

}

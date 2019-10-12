package pages;

import superclass.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyLeads clickLeads() {
		
		//click Leads
		driver.findElementByLinkText("Create Lead").click();
		return new MyLeads();
	}

}

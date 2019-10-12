package pages;

import superclass.ProjectSpecificMethods;

public class viewLeads extends ProjectSpecificMethods {
	
	public viewLeads verifyName() {
		String FirstNameCom = driver.findElementById("viewLead_firstName_sp").getText();
		boolean equals = FirstNameCom.equals("Vidhya");
		System.out.println(equals);
		return this;
	}

}

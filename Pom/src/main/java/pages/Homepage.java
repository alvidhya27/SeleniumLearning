package pages;

import superclass.ProjectSpecificMethods;

public class Homepage extends ProjectSpecificMethods{

	public LeadsMainPage clickCRMSFALink() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new LeadsMainPage();
	}
}

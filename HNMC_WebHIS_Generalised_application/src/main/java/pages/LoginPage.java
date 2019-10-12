package pages;

import superclass.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage EnterPassNumber() {
		
		driver.findElementById("passnbr").sendKeys("57896");
		return this;
			
	}
	
	public LoginPage EnterSecretCode() {
		driver.findElementByName("secretcd").sendKeys("WELCOME1");
		return this;
	}
	
	public void ClickLogin() {
		
	}
	
	

}

package pages;

import superclass.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	
	
	public LoginPage enterUsername(String Username) {
		
		driver.findElementById("username").sendKeys(Username);
		return this;
	}
	public LoginPage enterPassword(String Password) {
		driver.findElementById("password").sendKeys(Password);	
		return this;
	}
	public Homepage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new Homepage();
	}

}

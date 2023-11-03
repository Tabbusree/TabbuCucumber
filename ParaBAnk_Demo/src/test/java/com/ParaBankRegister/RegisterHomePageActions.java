package com.ParaBankRegister;

import org.openqa.selenium.support.PageFactory;

public class RegisterHomePageActions {
	RegisterHomePageLocators registerHomePageLocators = null;

	
	public  RegisterHomePageActions() {  
		this.registerHomePageLocators = new RegisterHomePageLocators();
		PageFactory.initElements(RegisterHelperClass.getDriver(),registerHomePageLocators);
	}
	public String getVerifyText() {
		return registerHomePageLocators.AssertContain.getText();
	}

}

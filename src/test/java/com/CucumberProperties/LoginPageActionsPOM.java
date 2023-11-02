package com.CucumberProperties;

import org.openqa.selenium.support.PageFactory;


public class LoginPageActionsPOM {
	LoginPageLocatorsPOM loginPageLocators = null;
	String strUserName, strPassword;
	
	public  LoginPageActionsPOM() {  //constructor
		this.loginPageLocators = new LoginPageLocatorsPOM();
		PageFactory.initElements(HelperClass.getDriver(),loginPageLocators);
	}
	
	//set username in textbox
	public void setUserName(String strUserName) {
		loginPageLocators.userName.sendKeys(strUserName);
	}
	
	public void setPassword(String strPassword) {
		loginPageLocators.passWord.sendKeys(strPassword);
	}
	
	public void clickLogin() {
		loginPageLocators.login.click();
	}
	
	public void login(String strUsername, String strPassWord) {
		this.setUserName(strUsername);
		this.setPassword(strPassWord);
	}

}

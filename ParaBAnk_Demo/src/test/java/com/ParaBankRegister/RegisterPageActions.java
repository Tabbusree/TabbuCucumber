package com.ParaBankRegister;

import org.openqa.selenium.support.PageFactory;


public class RegisterPageActions {
	RegisterPageLocators registerPageLocators = null;
	String strFirstName, strLastName, strAddress, strCity, strState, strZipCode, strPhoneNumber, strSsn, strUserName, strPassWord, strConfirmPassword;
	
	public  RegisterPageActions() {  //constructor
		this.registerPageLocators = new RegisterPageLocators();
		PageFactory.initElements(RegisterHelperClass.getDriver(),registerPageLocators);
	}
	
	public void setFirstName(String strFirstName) {
		registerPageLocators.firstName.sendKeys(strFirstName);
	}
	
	public void setLastName(String strLastName) {
		registerPageLocators.lastName.sendKeys(strLastName);
	}
	public void setAddress(String strAddress) {
		registerPageLocators.address.sendKeys(strAddress);
	}
	
	public void setCity(String strCity) {
		registerPageLocators.city.sendKeys(strCity);
	}
	public void setState(String strState) {
		registerPageLocators.state.sendKeys(strState);
	}
	
	public void setZipCode(String strZipCode) {
		registerPageLocators.zipCode.sendKeys(strZipCode);
	}
	public void setPhoneNumber(String strPhoneNumber) {
		registerPageLocators.phoneNumber.sendKeys(strPhoneNumber);
	}
	public void setSsn(String strSsn) {
		registerPageLocators.ssn.sendKeys(strSsn);
	}
	public void setUserName(String strUserName) {
		registerPageLocators.userName.sendKeys(strUserName);
	}
	
	public void setPassWord(String strPassWord) {
		registerPageLocators.passWord.sendKeys(strPassWord);
	}
	public void setConfirmPassword(String strConfirmPassword) {
		registerPageLocators.confirmPassword.sendKeys(strConfirmPassword);
	}
		
	public void clickLogin() {
		registerPageLocators.RegisterBtn.click();
	}
	
	public void register(String strFirstName, String strLastName, String strAddress, String strCity, String strState, String strZipCode, String strPhoneNumber, String strSsn, String strUsername, String strPassWord, String strConfirmPassword) {
		this.setFirstName(strFirstName);
		this.setLastName(strLastName);
		this.setAddress(strAddress);
		this.setCity(strCity);
		this.setState(strState);
		this.setZipCode(strZipCode);
		this.setPhoneNumber(strPhoneNumber);
		this.setSsn(strSsn);
		this.setUserName(strUsername);
		this.setPassWord(strPassWord);
		this.setConfirmPassword(strConfirmPassword);

	}


}

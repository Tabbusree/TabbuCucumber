package com.ParaBankRegister;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators {
	
	@FindBy(id="customer.firstName")
	public WebElement firstName;
	
	@FindBy(id="customer.lastName")
	public WebElement lastName;
	
	@FindBy(id="customer.address.street")
	public WebElement address;
	
	@FindBy(id="customer.address.city")
	public WebElement city;
	
	@FindBy(id="customer.address.state")
	public WebElement state;
	
	@FindBy(id="customer.address.zipCode")
	public WebElement zipCode;
	
	@FindBy(id="customer.phoneNumber")
	public WebElement phoneNumber;
	
	@FindBy(id="customer.ssn")
	public WebElement ssn;
	
	@FindBy(name="customer.username")
	public WebElement userName;
	
	@FindBy(name="customer.password")
	public WebElement passWord;
	
	@FindBy(id="repeatedPassword")
	public WebElement confirmPassword;
	
	@FindBy(xpath="//input[@value='Register']")
	public WebElement RegisterBtn;

}

package com.CucumberProperties;

import org.openqa.selenium.support.PageFactory;

public class HomePageActionPOM {
	HomePageLocatorsPOM homePageLocators = null;

	
	public  HomePageActionPOM() {  //constructor
		this.homePageLocators = new HomePageLocatorsPOM();
		PageFactory.initElements(HelperClass.getDriver(),homePageLocators);
	}
	public String getVerifyText() {
		return homePageLocators.nextPage.getText();
	}
	
	

}

package com.ParaBankRegister;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	RegisterUtilityClass data = new RegisterUtilityClass();
	RegisterPageActions ojbRegister = new RegisterPageActions();
	RegisterHomePageActions objHome = new RegisterHomePageActions();
	
	@Given("User is on register page")
	public void user_is_on_register_page() {
		RegisterHelperClass.openPage(data.url);
	    System.out.println("login page");
	}

	@When("User enters valid credentials for register the application")
	public void user_enters_valid_credentials_for_register_the_application() {
		ojbRegister.register(data.FirstName, data.LastName, data.Address, data.City, data.State, data.ZipCode, data.PhoneNumber, data.Ssn, data.UserName, data.PassWord, data.ConfirmPassword);
		System.out.println("User Details");
	}

	@When("User Clicks the Register")
	public void user_clicks_the_register() {
		ojbRegister.clickLogin();
		System.out.println("Click Register");
	}

	@Then("User logged out the application successfully")
	public void user_logged_out_the_application_successfully() {
		Assert.assertTrue(objHome.getVerifyText().contains("This username already exists."));
		System.out.println("User has already registered");

	}
}

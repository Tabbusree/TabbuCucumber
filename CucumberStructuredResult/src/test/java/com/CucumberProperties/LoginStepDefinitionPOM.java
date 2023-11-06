//package com.CucumberProperties;
//
//
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginStepDefinitionPOM {
//
//	UtilityClass data = new UtilityClass();
//	LoginPageActionsPOM objLogin = new LoginPageActionsPOM();
//	HomePageActionPOM objHome = new HomePageActionPOM();
//	
//	//Snippets from the login feature file
//	@Given("User launches the website")
//	public void user_launches_the_website() {
//		HelperClass.openPage(data.url);
//	    System.out.println("login page");
//	}
//
//	@When("User enters the valid username and password")
//	public void user_enters_the_valid_username_and_password() {
//		objLogin.login(data.username, data.password);
//		System.out.println("Username and password");
//	}
//
//	@Then("User successfully loged in the application")
//	public void user_successfully_loged_in_the_application() {
//		objLogin.clickLogin();
//		System.out.println("login button");
//		Assert.assertTrue(objHome.getVerifyText().contains("Dashboard"));
//		System.out.println("sucessfull login");
//	}
//
//}

package com.ParaBankRegister;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class RegisterUtilityClass {
	String url;
	String FirstName;
	String LastName;
	String Address;
	String City;
	String State;
	String ZipCode;
	String PhoneNumber;
	String Ssn;
	String UserName;
	String PassWord;
	String ConfirmPassword;
	
	public RegisterUtilityClass(){
		data();
	}
	public void data() {
		File file = new File("C:\\Users\\tsridhar\\eclipse-workspace\\ParaBAnk_Demo\\src\\test\\resources\\RegisterDetails.properties");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		url = prop.getProperty("url");
		FirstName = prop.getProperty("Firstname");
		LastName = prop.getProperty("Lastname");
		Address = prop.getProperty("Address");
		City = prop.getProperty("City");
		State = prop.getProperty("State");
		ZipCode = prop.getProperty("Zipcode");
		PhoneNumber = prop.getProperty("PhoneNumber");
		Ssn =  prop.getProperty("SSN");
		UserName = prop.getProperty("Username");
		PassWord = prop.getProperty("Password");
		ConfirmPassword = prop.getProperty("Confirm");
		
		
	}

}

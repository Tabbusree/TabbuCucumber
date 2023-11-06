package com.extentReportDemo;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class OrangeHRMHookClass {
	@Before
	public static void setUp() {
		OrangeHRMHelperClass.setUpDriver();
	}
	@After
	public static void tearDown(Scenario scenario) {  //Parameter reference
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) OrangeHRMHelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
		OrangeHRMHelperClass.tearDown();
	}

}

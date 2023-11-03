package com.ParaBankRegister;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class RegisterHooksClass {
	@Before
	public static void setUp() {
		RegisterHelperClass.setUpDriver();
	}
	@After
	public static void tearDown() {
		RegisterHelperClass.tearDown();
	}

}

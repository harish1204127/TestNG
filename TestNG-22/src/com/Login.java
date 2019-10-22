package com;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Login {

	
	@Test
	public void login_google()
	{
		SoftAssert softAssert = new SoftAssert();

		String Expected="Firefox";
		String Actual="firefox";
		softAssert.assertEquals(Actual, Expected, "First soft assert failed");
		softAssert.assertEquals("Firefox", Expected, "Second soft assert Passed");

		softAssert.assertEquals("Chrome", Expected, "Third soft assert failed");

		System.out.println("Test Case failed and rest of the code is running");
		softAssert.assertAll();

	}
	
	
	
	
	
}

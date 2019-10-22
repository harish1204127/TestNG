package com;

import org.testng.annotations.Test;

public class Signup {

	
	@Test(groups={"Regression"})
	public void signup_google()
	{
		System.out.println("signup_google");
	}
	
	
	@Test(groups={"Sanity"})
	public void signup_facebook()
	{
		System.out.println("signup_facebook");
	}
}

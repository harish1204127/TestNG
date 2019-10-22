package com;

import org.testng.annotations.Test;

public class Login {

	
	@Test(groups={"Regression","Sanity"})
	public void login_google()
	{
		System.out.println("login_google");
	}
	
	
	@Test(groups={"Regression"})
	public void login_facebook()
	{
		System.out.println("login_facebook");
	}
	@Test(groups={"UI"})
	public void login_email()
	{
		System.out.println("Login email");
	}
}

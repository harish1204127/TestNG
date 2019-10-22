package com;

import org.testng.annotations.Test;

public class Login {
	
	@Test(groups={"Regression","Sanity"})
	public void login_google()
	{
		System.out.println("login_google");
	}
	
	@Test(groups={"Sanity"})
	public void Login_facebook()
	{
		System.out.println("Login_facebook");
	}
	
	@Test(groups={"UI"})
	public void Login_UI()
	{
		System.out.println("Login_UI");
	}
	

}

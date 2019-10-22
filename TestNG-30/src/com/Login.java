package com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	
	@Test(groups={"Regression","Sanity"}, retryAnalyzer =Util.RetryAnalyzer.class)
	public void login_google()
	{
		System.out.println("login_google");
		Assert.assertEquals("login_google", "fail");
	}
	
	@Test(groups={"Sanity"}, retryAnalyzer =Util.RetryAnalyzer.class)
	public void Login_facebook()
	{
		System.out.println("Login_facebook");
	}
	
	@Test(groups={"UI"}, retryAnalyzer =Util.RetryAnalyzer.class)
	public void Login_UI()
	{
		System.out.println("Login_UI");
		Assert.assertEquals("Login_UI", "fail");
	}
	

}

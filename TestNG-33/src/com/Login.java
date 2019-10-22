package com;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Util.MyTestListenerAdapter.class)
public class Login {
	
	
	@Test(groups={"Regression","Sanity"})
	public void login_google()
	{
		System.out.println("login_google");
		Assert.assertEquals("login_google", "fail");
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
		Assert.assertEquals("Login_UI", "fail");
	}
	

}

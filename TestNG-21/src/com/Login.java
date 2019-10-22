package com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {

	
	@Test
	public void login_google()
	{
		String Expected="Firefox";
		String Actual="Firefox";
		Assert.assertEquals(Expected, Actual);
		System.out.println("Test Case passed and rest of the code is running");
	}
	
	
	@Test
	public void login_facebook()
	{
		String Expected="Firefox";
		String Actual="firefox";
		Assert.assertEquals(Expected, Actual);
		System.out.println("Test Case passed and rest of the code is running");

	}
	@Test
	public void login_email()
	{
		String Expected="Firefox";
		String Actual="firefox";
		Assert.assertEquals(Actual,Expected,"test cases passed...");
		System.out.println("Test Case passed and rest of the code is running");

	}
	
	@Test
	public void login_email2()
	{
		String Expected="Firefox";
		String Actual="Firefox";
		Assert.assertEquals(Actual,Expected,"test cases passed...");
		System.out.println("Test Case passed and rest of the code is running");

	}
	@Test
	public void login_email3()
	{
		
		Assert.assertTrue(1==1);
		System.out.println(" login_email3--Test Case passed and rest of the code is running");

	}
	
	
	
	
}

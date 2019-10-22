package com;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basetestcases {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("========Before Suite========");

	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("========After Suite========");

	}
	
	@AfterTest

	public void aftertest()
	{
		System.out.println("======After Test======");
	}
	
	@BeforeTest

	public void beforetest()
	{
		System.out.println("======Before Test======");
	}
	
	@AfterMethod

	public void aftermethod()
	{
		System.out.println("==After Method==");
	}
	@BeforeMethod

	public void beforemethod()
	{
		System.out.println("==Before Method==");
	}
	
	@AfterClass

	public void afterclass()
	{
		System.out.println("====After Class====");
	}
	@BeforeClass

	public void beforeclass()
	{
		System.out.println("====Before Class====");
	}
	
	

}

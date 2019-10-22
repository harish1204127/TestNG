package com;

import org.testng.annotations.Test;

public class Signup{
	
	@Test(groups={"Regression"})
	public void Signup_google()
	{
		System.out.println("Signup_google");
	}
	@Test(groups={"Sanity"})
	public void Signup_Facebook()
	{
		System.out.println("Signup_Facebook");
	}
	@Test(groups={"UI"})
	public void Signup_UI()
	{
		System.out.println("Signup_UI");
	}

}

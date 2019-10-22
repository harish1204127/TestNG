package com;


import org.testng.annotations.Test;

public class testcases {
	
	// -2,-1, 0 or default, 1, 2, 3
@Test(priority=1)
	
	public void changePassword()
	{
		System.out.println(" Change Password Test Cases");
	}
	@Test(priority=2)
	
	public void loginTest2()
	{
		//throw new SkipException("Any reason");

		System.out.println(" Login Test Cases");
	}
@Test(priority=3)
	
	public void HomePage()
	{
		//throw new SkipException("Any reason");

		System.out.println(" Login Test Cases222");
	}
	
	

@Test(priority=4)

public void loginTest3()
{
	System.out.println(" Logout Test Cases");
}

}

package com;

import org.testng.annotations.Test;

public class dependonmetheods {

	
	@Test
	public void dividedByZero1()
	{
		System.out.println("pass test cases");
	}
	
	
	@Test
	public void dividedByZero2()
	{
		int e = 1/0;
	}
	
	@Test(dependsOnMethods={"dividedByZero2"})
	public void testcases2()
	{
		System.out.println("I should not execute.");
	}
}

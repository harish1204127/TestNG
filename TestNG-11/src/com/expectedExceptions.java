package com;

import org.testng.annotations.Test;

public class expectedExceptions {

	
	@Test(expectedExceptions=ArithmeticException.class)
	public void dividedByZero1()
	{
		int e = 1/0;
	}
	
	
	@Test
	public void dividedByZero2()
	{
		int e = 1/0;
	}
}

package com;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class expectedExceptions {

	
	
	@Test
	public void testCaseSkipException(){
			System.out.println("Im in skip exception");
			throw new SkipException("Skipping this exception");
		}

	@Test
	public void testCaseConditionalSkipException(){
		System.out.println("Im in Conditional Skip");
		Boolean DataAvailable= false;
		if(!DataAvailable)
		throw new SkipException("Skipping this exception");
		System.out.println("Executed Successfully");
	}

}

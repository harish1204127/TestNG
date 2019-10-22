package com;

import org.testng.annotations.Test;

public class timeout {

	
	
	@Test
	public void sampleTestCase(){
			System.out.println("Im ready to execute");
		}
	@Test(timeOut=1000) // specify time in milliseconds
	public void executetimeOut() throws InterruptedException{
		Thread.sleep(3000);
             // Thread.sleep(500);
	}
}

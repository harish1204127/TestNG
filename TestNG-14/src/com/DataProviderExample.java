package com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample{
	
	
	@Test(dataProvider="getData")
	public void setData(String username, String password)
	{
		System.out.println("you have provided username as::"+username);
		System.out.println("you have provided password as::"+password);
	}

	@DataProvider
	public Object[][] getData()
	{
	
	Object[][] data = new Object[3][2];

	// 1st row
	data[0][0] ="Username1";
	data[0][1] = "password1";

	// 2nd row
	data[1][0] ="Username2";
	data[1][1] = "password2";
	
	// 3rd row
	data[2][0] ="Username3";
	data[2][1] = "password3";

	return data;
	}
}

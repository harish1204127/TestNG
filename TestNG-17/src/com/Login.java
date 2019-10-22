package com;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {

	@Parameters({ "browser" })
	@Test
	public void login_google(String browser)
	{
		System.out.println("login_google--"+browser);
	}
	
	@Parameters({ "username", "password" })
	@Test
	public void login_facebook(String username, String password)
	{
		System.out.println("Parameter for User Name passed as :- " + username);
		System.out.println("Parameter for Password passed as :- " + password);
	}
}

package com.selenium.testng;

import org.testng.annotations.Test;

public class PracticeAllAnnotationArgs 
{
	@Test(priority = 1)
	public void login() 
	{
		System.out.println("login");
	}

	@Test(priority = 3 , invocationCount = 3)
	public void product()
	{
		System.out.println("product");
	}

	@Test(priority = 2)
	public void home() 
	{
		System.out.println("home");
	}

	@Test(priority = 5)
	public void logout()
	{
		System.out.println("logout");
	}

	@Test(priority = 5)
	public void payment()
	{
		System.out.println("payment");
	}

}

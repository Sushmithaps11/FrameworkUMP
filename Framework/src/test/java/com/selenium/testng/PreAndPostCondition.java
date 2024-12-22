package com.selenium.testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class PreAndPostCondition 
{
	WebDriver driver;
	@BeforeMethod
	public void preCondition()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterMethod
	public void postCondition()
	{
		driver.manage().window().minimize();
		driver.quit();
	}
	@Test
	public void loginToVtiger()
	{
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
	}
	
	public void loginToFacebook()
	{
		
	}
	

}


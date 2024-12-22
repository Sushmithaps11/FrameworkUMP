package com.selenium.actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethod 
{

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		Actions actions = new Actions(driver);
		WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgotten password?"));
		actions.click(forgotPasswordLink).perform();
// WebElement loginButton = driver.findElement(By.name("login"));
 //actions.click().perform();
  
}
}

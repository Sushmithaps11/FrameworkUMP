package com.selenium.actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysMethod
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		WebElement passwordTextfield = driver.findElement(By.id("pass"));
		Actions actions = new Actions(driver);
		actions.sendKeys(driver.switchTo().activeElement()).sendKeys("abc@gmail.com").pause(2000).sendKeys(passwordTextfield, "123456").perform();
}
}

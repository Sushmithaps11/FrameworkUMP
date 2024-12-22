package com.selenium.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrames 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/frames/multiple?sublist=2");
		WebElement signupFrame = driver.findElement(By.xpath("//iframe[@src='../signup.html']"));
		driver.switchTo().frame(signupFrame);
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.sendKeys("1234568");
		driver.switchTo().defaultContent();
		WebElement signinFrame = driver.findElement(By.xpath("//iframe[@src='../signin.html']"));
		driver.switchTo().frame(signinFrame);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
}
}
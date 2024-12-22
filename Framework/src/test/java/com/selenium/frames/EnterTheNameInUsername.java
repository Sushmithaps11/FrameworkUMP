package com.selenium.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTheNameInUsername 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/frames?sublist=0");
		WebElement loginFrame = driver.findElement(By.xpath("//iframe[@title='Login Form']"));
		driver.switchTo().frame(loginFrame);
		//this line is optimization for above 2 lines 
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Login Form']")));
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys("Ump");

}
}
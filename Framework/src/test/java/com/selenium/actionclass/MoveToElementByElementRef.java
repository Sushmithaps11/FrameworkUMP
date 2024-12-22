package com.selenium.actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementByElementRef
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		WebElement menOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Men']"));
		WebElement womenOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Women']"));
		WebElement kidsOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Kids']"));
		WebElement homeandlivingOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Home & Living']"));
		WebElement beautyOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Beauty']"));
		WebElement studioOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Studio']"));
		Actions actions = new Actions(driver);
		//actions.moveToElement(menOption).pause(2000).moveToElement(womenOption).pause(2000).moveToElement(kidsOption).pause(2000).moveToElement(homeandlivingOption).pause(2000).moveToElement(beautyOption).pause(2000).moveToElement(studioOption).build().perform();
		
		//actions.moveToElement(menOption, 0, 0).pause(2000).moveToElement(menOption, 73, 0).pause(2000).moveToElement(womenOption, 74, 0).pause(2000).moveToElement(kidsOption, 97, 0).pause(2000).moveToElement(homeandlivingOption, 107, 0).pause(2000).moveToElement(beautyOption, 83, 0).build().perform();
		actions.moveToElement(menOption, 0, 0).pause(2000).moveToElement(menOption, 73, 0).pause(2000).moveToElement(menOption, 147, 0).pause(2000).moveToElement(menOption, 244, 0).pause(2000).moveToElement(menOption, 352, 0).pause(2000).moveToElement(menOption, 435, 0).build().perform();
}
}
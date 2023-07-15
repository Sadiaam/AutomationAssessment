package com.testcases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePageIsVisible {
	@Test
	public void verifyHomePageVisibility()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.automationexercise.com/");
		Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Home']")).isDisplayed());
		driver.quit();

}
}

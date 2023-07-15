package com.testcases;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class AddProductToCart {
	@Test
	public void verifyHomePageVisibility()
	{
		
      
		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.automationexercise.com/");
		driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
		driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
		
		//Cart page displayed
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='breadcrumbs']")).isDisplayed());
		driver.quit();
		
}
}


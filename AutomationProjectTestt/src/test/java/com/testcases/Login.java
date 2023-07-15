package com.testcases;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Base;

public class Login extends Base {
	
	WebDriver driver;
	
	
	@Test
	public void verifyLoginWithValidCredentials()
	{
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--disable-notification");
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		 driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\Users\\Sadia Afrin\\Music\\selenium path\\extension_5_8_0_0 (1).crx"));
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
       options.merge(capabilities);
        driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
		driver.get("https://www.automationexercise.com/");
		driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
		driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click();
		
		driver.findElement(By.xpath("//u[normalize-space()='Register / Login']")).click();
		 
		
		driver.findElement(By.name("email")).sendKeys("masudarahman12@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//verify as logged in 
		String actualSuccessMessage=driver.findElement(By.xpath("//li[10]//a[1]")).getText();
		
		//System.out.println(actualSuccessMessage);
		Assert.assertEquals(actualSuccessMessage,("Logged in as Sadia"));
		driver.quit();
		
		
		
	}

}

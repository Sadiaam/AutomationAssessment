package com.testcases;

import java.time.Duration;
import java.util.Arrays;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Register {
	
	@Test
	public void verifyRegistration()
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
		driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click();
		
		driver.findElement(By.xpath("//u[normalize-space()='Register / Login']")).click();
		 driver.findElement(By.name("name")).sendKeys("Sadia");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("masudarahman128988@gmail.com");
		driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("password")).sendKeys("12345");
		WebElement dayselect = driver.findElement(By.id("days"));
		Select select=new Select(dayselect);
		dayselect.sendKeys("16");
		WebElement monthselect = driver.findElement(By.id("months"));
		Select s1=new Select(monthselect);
		monthselect.sendKeys("April");
		WebElement yearselect = driver.findElement(By.id("years"));
		Select s2=new Select(yearselect);
		yearselect.sendKeys("2003");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("first_name")).sendKeys("Sadia");
		driver.findElement(By.id("last_name")).sendKeys("mish");
		driver.findElement(By.id("company")).sendKeys("Kinetix");
		
		
		driver.findElement(By.id("address1")).sendKeys("Building 3,Apartment 5,Santosh main road");
		driver.findElement(By.id("address2")).sendKeys("Building 6,Apartment 2,Rajshahi");
		WebElement countryselect = driver.findElement(By.id("country"));
		Select s4=new Select(countryselect);
		countryselect.sendKeys("Canada");
		driver.findElement(By.id("state")).sendKeys("California");
		driver.findElement(By.id("city")).sendKeys("Toronto");
		
		driver.findElement(By.id("zipcode")).sendKeys("90001");
		driver.findElement(By.id("mobile_number")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();
		
		//Verify Account created
		String actualSuccessMessage=driver.findElement(By.xpath("//b[normalize-space()='Account Created!']")).getText();
		Assert.assertTrue(actualSuccessMessage.contains("ACCOUNT CREATED!"));
		
		driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
		driver.quit();
		
		
		

}
}

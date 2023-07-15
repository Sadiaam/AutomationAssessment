package com.testcases;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Payment {
	WebDriver driver;
	/*@BeforeMethod
	//public void setup()
	//{
		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		 driver=new ChromeDriver(opt);*/
		
		//System.setProperty("wedriver.chrome.driver","C:\\Users\\Sadia Afrin\\Music\\selenium path\\chromedriver.exe");
		
		/*ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\\\Users\\\\Sadia Afrin\\\\Music\\\\selenium path\\extension_5_8_0_0 (1).crx"));
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);
        driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.get("https://www.automationexercise.com/");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}*/
	@Test
	public void makePayment()
	{
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--disable-notification");
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		 driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.automationexercise.com/");


driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")).click();

driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click();

driver.findElement(By.xpath("//u[normalize-space()='Register / Login']")).click();
 

driver.findElement(By.name("email")).sendKeys("masudarahman12@gmail.com");
driver.findElement(By.name("password")).sendKeys("12345");
driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

//
driver.findElement(By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")).click();
driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click();

//Comment on textbox
//JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("document.getfindElementBy.name('message').setAtribute('value','abcde')");
driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("abc dhre ukhfs ");
driver.findElement(By.xpath("//a[normalize-space()='Place Order']")).click();

//payment
driver.findElement(By.xpath("//input[@name='name_on_card']")).sendKeys("Credit Card");
//JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("document.getfindElementBy.name('card_number').setAtribute('value','4111111111111111')");

driver.findElement(By.name("card_number")).sendKeys("4111111111111111");
//driver.findElement(By.xpath("(//input[@name='card_number'])").sendKeys("4111111111111");
driver.findElement(By.xpath("//input[@placeholder='ex. 311']")).sendKeys("111");
driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("8");
driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("2023");
driver.findElement(By.xpath("//button[@id='submit']")).click();
//driver.navigate().back();

/*String orderSuccess=driver.findElement(By.xpath("//div[contains(text(),'Your order has been placed successfully!')]")).getText();
String actual="Your order has been placed successfully!";
//System.out.println(orderSuccess);
Assert.assertEquals(orderSuccess,actual);*/

String orderSuccess1=driver.findElement(By.xpath("//p[normalize-space()='Congratulations! Your order has been confirmed!']")).getText();
Assert.assertEquals(orderSuccess1,"Congratulations! Your order has been confirmed!");

driver.quit();
}
}

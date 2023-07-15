package com.testcases;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WriteCommentInTextBox {
	@Test
	public void addComment()
	{


ChromeOptions opt=new ChromeOptions();
opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
WebDriver driver=new ChromeDriver(opt);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
//js.executeScript("document.getfindElementBy.name('message').setAtribute('value','qac')");
driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("abc dhre ukhfs ");
driver.findElement(By.xpath("//a[normalize-space()='Place Order']")).click();
driver.quit();
}
}
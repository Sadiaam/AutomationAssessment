package com.testcases;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;





public class VerifyAddressDetailsAndReviewOrder {
	WebDriver driver;

	@Test
	public void verifyAddress()
	{


ChromeOptions opt=new ChromeOptions();
opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
 driver=new ChromeDriver(opt);
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

//verify address details
//driver.findElement(By.xpath(("//h2[normalize-space()='Address Details'])[1]")).isDisplayed();
String addressDetail=driver.findElement(By.xpath("//h2[normalize-space()='Address Details']")).getText();
Assert.assertEquals(addressDetail,("Address Details"));

String deliveryAddress=driver.findElement(By.xpath("//h3[normalize-space()='Your delivery address']")).getText();
Assert.assertEquals(deliveryAddress,("YOUR DELIVERY ADDRESS"));

String billingAddress=driver.findElement(By.xpath("(//h3[normalize-space()='Your billing address'])[1]")).getText();
Assert.assertEquals(billingAddress,("YOUR BILLING ADDRESS"));

String actualfullname=driver.findElement(By.xpath("//ul[@id='address_delivery']//li[@class='address_firstname address_lastname'][normalize-space()='Mrs. Sadia mish']")).getText();
Assert.assertEquals(actualfullname, "Mrs. Sadia mish");

String companyName=driver.findElement(By.xpath("//ul[@id='address_delivery']//li[@class='address_address1 address_address2'][normalize-space()='Kinetix']")).getText();
Assert.assertEquals(companyName, "Kinetix");


//String addressA=driver.findElement(By.xpath("//ul[@id='address_delivery']//li[@class='address_address1 address_address2'][normalize-space()='Building 3,Apartment 5,Santosh main road']")).getText().
//Assert.assertEquals(addressA, "Building 6,Apartment 2,Rajshahi");


String address2=driver.findElement(By.xpath("//ul[@id='address_delivery']//li[@class='address_address1 address_address2'][normalize-space()='Building 6,Apartment 2,Rajshahi']")).getText();
Assert.assertEquals(address2, "Building 6,Apartment 2,Rajshahi");


String stateCity=driver.findElement(By.xpath("//ul[@id='address_delivery']//li[@class='address_city address_state_name address_postcode'][contains(text(),'Toronto California')]")).getText();
Assert.assertEquals(stateCity, "Toronto California 90001");

String country=driver.findElement(By.xpath("//ul[@id='address_delivery']//li[@class='address_country_name'][normalize-space()='Canada']")).getText();
Assert.assertEquals(country, "Canada");


String addressPhone=driver.findElement(By.xpath("//ul[@id='address_delivery']//li[@class='address_phone'][normalize-space()='123456789']")).getText();
Assert.assertEquals(addressPhone, "123456789");



//String reviewOrder=driver.findElement(By.xpath("//h2[normalize-space()='Review Your Order']")).getText();
//Assert.assertEquals(addressPhone, "Review Your Order");


//String itemReview=driver.findElement(By.xpath("//td[@class='image']")).getText();
//Assert.assertEquals(itemReview, "Item");

//String descriptionReview=driver.findElement(By.xpath("//td[@class='description']")).getText();
//Assert.assertEquals(itemReview, "	Description");





//Assert.assertTrue(driver.findElement(By.xpath(("//h2[normalize-space()='Address Details'])[1]"))).isDisplayed());
//Assert.assertTrue(driver.findElement(By.xpath("//h3[normalize-space()='Your delivery address']")).isDisplayed());
driver.quit();
	}
}

	

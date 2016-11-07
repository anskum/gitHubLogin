package com.shippable.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;


public class NewTest {
	
		 
		
		private WebDriver driver;
		@Test
		 
		public void valid() throws Exception {
		 
		driver = new FirefoxDriver();
		 
		driver.get("https://github.com/login");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
		
		driver.findElement(By.id("login_field")).sendKeys("anshu9539@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("anshu9539");
		 
		driver.findElement(By.id("login")).click();
		 
		}
		@Test(priority=2)
		 
		public void invalid_BlankPassword() {
		 
		driver = new FirefoxDriver();
		 
		driver.get("https://github.com/login");
		 
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		

		driver.findElement(By.id("login_field")).sendKeys("abc");
		 
		driver.findElement(By.id("password")).sendKeys("");
		 
		driver.findElement(By.id("login")).click();
	 
	WebElement Ele=	driver.findElement(By.id("js-flash-container"));
		 String msg = Ele.getText();
		 System.out.println(msg);
		 
		 
		}
	@AfterTest
		 
		public void tearDown() throws Exception {
		 
		driver.close();
		
		
			
		}
		
		 
		}
package com.obp.maven.Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException{

		WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
	//	driver.get("https://classic.crmpro.com");
		
		Thread.sleep(6000);
		
		//1st locator id = Method 1 = Straightforward method 
		//Create WebElement & then perform action using sendkeys.iT WILL ALWAYS BE UNIQUE 
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("ss12");
		driver.findElement(By.id("loginBtn")).click();         //button is click
		
		//Method 2 
		WebElement email    = driver.findElement(By.id("username")); //Webelement variable is email ;Import webelement from selenium
		WebElement password = driver.findElement(By.id("password"));
		WebElement login    = driver.findElement(By.id("loginBtn"));
		
		email.sendKeys("test@gmail.com");
		password.sendKeys("ss123");
		login.click();     
		
		
		//2.name
		driver.findElement(By.name("username")).sendKeys("ss@gmail.com");
		//WebElement emai = 	driver.findElement(By.name("username"));
		
		//3.classname: classic.crmpro.com  - Not compulsory to have id and name  =
		//m-bottom=2 = Unique one ...1 of 1
		driver.findElement(By.className("login-mail")).sendKeys("ss@gmail.com");
		driver.findElement(By.className("m-bottom-3")).sendKeys("test23");
	//	driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
	//	driver.findElement(By.className("login-password")).sendKeys("test@gmail.com");

	
		//4.xpath: is a locator ,but not an attribute(DOM)
		//this is the address of the element .Xpath is a string"".
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ss@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ss321");
		driver.findElement(By.xpath("//button['loginBtn']")).click();
		
		//5.cssselector:is a locator ,but not an attribute(DOM)
		driver.findElement(By.cssSelector("#username")).sendKeys("ss@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("ss321");

		//6.linkText: only for links // LINK WILL HAVE A TAG
		driver.findElement(By.linkText("Sign up"));
		
		//partial link text
		driver.findElement(By.partialLinkText("Sign")).click();
		
		//tagname = freshworks.com .gET TEXT METHOD WILL RETURN STRING..Freshworks.com
	String 	header = driver.findElement(By.tagName("h1")).getText();
	System.out.println(header);
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

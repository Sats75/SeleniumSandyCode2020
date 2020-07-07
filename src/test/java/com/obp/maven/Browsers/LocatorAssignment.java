package com.obp.maven.Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorAssignment {

	public static void main(String[] args) {

WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/signup/sales/step/user-info");
		
		//1st locator id = Method 1
		//Create Element + then perform action using sendkeys -- VVIMP
		
		/*driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("ss12");
		driver.findElement(By.id("loginBtn")).click();
		*/
		driver.findElement(By.xpath("//[@id='signup-app/div/div/div[1]/div[1]/div[1]/span/a/i18n-string']")).click();
		driver.findElement(By.id("uid-firstName-5")).sendKeys("Santhiya");
		driver.findElement(By.id("uid-lastName-6")).sendKeys("Satishkumar");
		driver.findElement(By.id("uid-email-7")).sendKeys("santhiyasatishkumar@gmail.com");
		driver.findElement(By.id("signup-app")).click();
		
		/*WebElement email = 	driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("loginBtn"));
		
		email.sendKeys("test@gmail.com");
		password.sendKeys("ss123");
		login.click();
		*/
	/*	WebElement Firstname = 	driver.findElement(By.id("uid-firstName-1"));
		WebElement Lastname = 	driver.findElement(By.id("uid-lastName-2"));
		WebElement emailid = 	driver.findElement(By.id("uid-email-3"));
		WebElement next = driver.findElement(By.id("signup-app"));
		
		Firstname.sendKeys("Santhiya");
		Lastname.sendKeys("Satishkumar");
		emailid.sendKeys("santhiyasatishkumar@gmail.com");
		next.click();
	*/	
		
		
		
		
	}

}

package com.obp.maven.Browsers;

//Not necessary for all elements you need to apply. Eg For user id you can apply but for password you need not apply .
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com");// launch url
		// Create object of webdriver wait .Import from selenium
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleIs("HubSpot Login"));
		wait.until(ExpectedConditions.titleContains("Login"));
		wait.until(ExpectedConditions.titleIs(title))
		
	//tried for 3 seconds with 500 milliseconds interval 
		
 	//	System.out.println(driver.getTitle());

		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));

		WebElement emailid = driver.findElement(By.id("username"));
		emailid.sendKeys("test");

		WebElement pw = driver.findElement(By.id("password"));
		pw.sendKeys("test321");

		WebElement loginbutton = driver.findElement(By.id("loginBtn"));
		loginbutton.click();

	

		// WebElement emailid = driver.findElement(By.id("username"));
		// WebElement pw = driver.findElement(By.id("password"));
		// WebElement loginbutton = driver.findElement(By.id("loginBtn"));

	}

}

package com.obp.maven.Browsers;
//This is incomplete and few things unable to understand
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hubspot.com/login");
		
		Thread.sleep(5000);
		WebElement emailid = driver.findElement(By.id("username"));
		WebElement pw = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.id("loginBtn"));
		
		Actions action = new Actions(driver);   //Action classes 
		action.sendKeys(emailid,"ss.com").perform();
		action.sendKeys(pw,"ss12").perform();
		action.sendKeys(loginbutton).perform();

		
	
	}
		
		
	}



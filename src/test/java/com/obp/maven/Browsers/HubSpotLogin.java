package com.obp.maven.Browsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLogin {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();

		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    ElementUtil elementUtil = new ElementUtil(driver);
	       
		By emailId = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		By signUp = By.id("Sign up");
		
		driver.get("https://app.hubspot.com");// launch url
	    String title =	elementUtil.waitForTitleToBePresent("Login", 6);
		System.out.println("title");
		
		elementUtil.waitForElementToBePresent(emailId,15).sendKeys("ss@gmail.com");
		elementUtil.doSendKeys(password,"ss4");
		
		elementUtil.waitForElementToBePresent(loginButton, 5).click();
		
		
		
		


		
		
	}

}

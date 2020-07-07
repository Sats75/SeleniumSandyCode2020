package com.obp.maven.Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginClassUsingWaitCustomMethod {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com");// launch url
		By emailid =  By.id("username");
		By pw =  By.id("password");
		By loginButton = By.id("loginBtn");
		
		UtilityMethod elementUtil = new UtilityMethod(driver);
		elementUtil.waitForElementToBePresent(emailid, 15).sendKeys("sandy@gmail.com");
		

		
		
		
		
		
		
		
	}

}

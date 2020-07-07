package com.obp.maven.Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://app.hubspot.com/login");

		driver.manage().deleteAllCookies();
		// Open facebook
		driver.get("http://www.facebook.com");
		String title = driver.getTitle();
		System.out.println("Page title is " + title);
		
		

	}

}

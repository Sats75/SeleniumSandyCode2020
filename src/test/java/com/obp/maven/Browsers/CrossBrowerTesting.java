package com.obp.maven.Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowerTesting {

	public static void main(String[] args) {

		String browser = "chrome";
		WebDriver driver = null;

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\MavenWorkspace\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Internet Explorer")) {
			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("Browser is not found" + browser);

			driver.get("http://www.facebook.com");
			String title = driver.getTitle();
			System.out.println("Page title is " + title);

			// Validation point is important
			if (title.equals("Facebook – log in or sign up")) {
				System.out.println("Correct title");
			} else {
				System.out.println("Incorrect title");
	
				
			}

		}
	}
}

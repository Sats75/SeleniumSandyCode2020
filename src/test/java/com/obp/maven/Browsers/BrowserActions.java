package com.obp.maven.Browsers;
//Launch the browser on the basis of driver
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions {

	WebDriver driver;

	public WebDriver launchbrowser(String browser) {

	switch (browser) {
		case "chrome":
			WebDriverManager.chromiumdriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new WebDriver();
			break;

		case "Safari":
			WebDriverManager.chromiumdriver().setup();
			driver = new ChromeDriver();
			break;

		case "IE":
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new ChromeDriver();
			break;

		default:
			System.out.println("Please pass the browser" + browser);
			break;
		}
*/
	}
	  public void launchUrl(String url) {
		  driver.getCurrentUrl();
		  
	 public String doGetTitle() {
		 return driver.getTitle();
	 }
	  
	
}

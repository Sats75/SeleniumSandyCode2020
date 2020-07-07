package com.obp.maven.Browsers;
//41st minute in the video  = Selenium_13_FluentWait_CustomWaitUtils.mp4

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com");

		By emailid = By.id("username");
		By pw = By.id("password");
		By loginButton = By.id("loginBtn");

		getElementWithWait(driver, emailid, 6).sendKeys("sandy@gmail.com");
		driver.findElement(pw).sendKeys("ss123");
		driver.findElement(loginButton).click();
		
	}

	public static WebElement getElementWithWait(WebDriver driver, By locator, int timeout) {
		WebElement element = null;
		for (int i = 0; i < timeout; i++) {
			try {
			element =	driver.findElement(locator);
				break;
			} 
			catch (Exception e) {
				System.out.println("Waiting for element to be present on the page -->" + i + "secs");
				try {

					Thread.sleep(1000);
				} catch (InterruptedException e1) {
				}
			}

		}

			return element;
	}
	

	
	
}

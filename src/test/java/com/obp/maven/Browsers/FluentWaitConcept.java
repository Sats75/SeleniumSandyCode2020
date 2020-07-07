package com.obp.maven.Browsers;

//a)U can give timeout b)Polling period c) IgnoreException = Webdriver wait with few syntax 
//For handling AJAX components Eg Cricscore /  Corona virus -- Every minute data should get updated in 1 part of UI (Without refresing the entire page)
//Watch the video for proper explanation 
import java.time.Duration;

import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		//Created by locators
		final By username = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//input[@value='Login']");

		waitForElementWithFluentWait(driver,username).sendKeys("batchautomation");
		driver.findElement(password).sendKeys("ss@12345");
		driver.findElement(login).click();
	}

public static WebElement waitForElementWithFluentWait(WebDriver driver ,final By locator) {
			
			Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(15))
					.pollingEvery(Duration.ofSeconds(3))  //Every 3 seconds it will chk(Interval).We can decide 
					.ignoring(NoSuchElementException.class);
			
		
		}
WebElement element = wait.until(new Function<WebDriver, WebElement>(){

	
	public WebElement apply(WebDriver driver) {
		return driver.findElement(locator);
	}
}

return element;

}
}




			
	
	
			
			
		
			

package com.obp.maven.Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityMethod {

	WebDriver driver;
	
	public UtilityMethod(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public WebElement getElement(By locator) {

		WebElement element =	driver.findElement(locator);
		return element;		
		
	}	

 //Wait custom utility method

public WebElement waitForElementToBePresent(By locator ,int timeout) {
	WebElement element = getElement(locator);
	WebDriverWait wait  = new WebDriverWait(driver , timeout);
	wait.until(ExpectedConditions.visibilityOf(element));
	return element;
}

public WebElement waitForElementVisibilityLocated(By locator ,int timeout) {
	WebDriverWait wait  = new WebDriverWait(driver , timeout);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	return getElement(locator);
}
	public String waitForUrl(String url ,int timeout) {
		WebDriverWait wait  = new WebDriverWait(driver , timeout);
		wait.until(ExpectedConditions.urlContains(url));
		return driver.getCurrentUrl();
	}
	
	public String waitForTitleToBePresent(String title ,int timeout) {
		WebDriverWait wait  = new WebDriverWait(driver , timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	public boolean waitForAlertToBePresent(int timeout) {
		WebDriverWait wait  = new WebDriverWait(driver , timeout);
		wait.until(ExpectedConditions.alertIsPresent());
		return true;
	}


public void clickWhenReady(By locator ,int timeout) {
	WebDriverWait wait  = new WebDriverWait(driver , timeout);
	wait.until(ExpectedConditions.elementToBeClickable(locator));
	 getElement(locator).click();
}


}


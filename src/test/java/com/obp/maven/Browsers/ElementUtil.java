package com.obp.maven.Browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	WebDriver driver;
	private WebElement elements;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;

	}

	// Own custom method
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

	public void doActionsClick(By locator) {
		Actions	 action = new Actions(driver);
		WebElement element = getElement(locator);
		action.click(element).perform();
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();

	}

	//wait for custom methods 
	
	public void visiblityOfAllElements(List<WebElement> element , int timeout) {
	WebDriverWait wait = new WebDriverWait(driver , timeout);
	wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	
	
	public WebElement waitForElementToBePresent(By locator, int timeout) {
	WebDriverWait wait = new WebDriverWait(driver , timeout);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	return getElement(locator);
	}
	
	public WebElement waitForElementToBeClickabale(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver , timeout);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return getElement(locator);
		}
		
	public WebElement waitForElementToBeVisible(By locator, int timeout) {
		WebElement element = getElement(locator);		
		WebDriverWait wait = new WebDriverWait(driver , timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
		}
	
	public WebElement waitForElementToBeVisible1(By locator, int timeout) {
		WebElement element = getElement(locator);		
		WebDriverWait wait = new WebDriverWait(driver , timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
		}
	
	public WebElement waitForElementVisibilityLocated(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver , timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return getElement(locator);
		}

	
	public String waitForurl(String url, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver , timeout);
		wait.until(ExpectedConditions.urlContains(url));
		return driver.getCurrentUrl();
		}
//Only for java script pop ups/alert
	public boolean waitAlertToBePresent(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver , timeout);
		wait.until(ExpectedConditions.alertIsPresent());
		return true;
		}
	
	public void clickWhenReady(By locator , int timeout) {
		WebDriverWait wait = new WebDriverWait(driver , timeout);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		getElement(locator).click();
 		}
	
	
	
	
	
	
	public String waitForTitleToBePresent(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver , timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
		
	
	}
	
	
	
}

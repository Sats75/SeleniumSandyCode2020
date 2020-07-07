package com.obp.maven.Browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownusingxpathcss {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		String dob = "20-Jul-1975";
		
		/*String dayOptionsxpath = "//select[@id='day']/option";
		String monthOptionsxpath = "//select[@id='month']/option";
		String yearOptionsxpath = "//select[@id='year']/option";
		*/
		  String dayOptionCSS = "select#day option";
		  String monthOptionCSS = "select#month option";
		  String yearOptionCSS = "select#year option";
		  
		    doSelectValueFromDropdownWithoutSelect(driver, "css", dayOptionCSS, dob.split("-")[0]);
			doSelectValueFromDropdownWithoutSelect(driver, "css", monthOptionCSS, dob.split("-")[1]);
			doSelectValueFromDropdownWithoutSelect(driver, "css", yearOptionCSS, dob.split("-")[2]);
	}
		  
		/*doSelectValueFromDropdownWithoutSelect(driver, "xpath", dayOptionsxpath, dob.split("-")[0]);
		doSelectValueFromDropdownWithoutSelect(driver, "xpath", monthOptionsxpath, dob.split("-")[1]);
		doSelectValueFromDropdownWithoutSelect(driver, "xpath", yearOptionsxpath, dob.split("-")[2]);
*/	

	public static void doSelectValueFromDropdownWithoutSelect(WebDriver driver, String locator, String locatorValue,String value) {
		List<WebElement> valuesList = null;

		if (locatorValue.equals("xpath")) {
			valuesList = driver.findElements(By.xpath(locator));

		} else if (locatorValue.equals("css")) {
			valuesList = driver.findElements(By.cssSelector(locator));
		}
		System.out.println(valuesList.size());

		for (int i = 0; i < valuesList.size(); i++) {
			if (valuesList.get(i).getText().equals(value)) {
				valuesList.get(i).click();
				break;
			}
		}

	}

}

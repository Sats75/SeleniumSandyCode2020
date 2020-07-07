package com.obp.maven.Browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		String dob = "20-Jul-1975";
		
		String dayOptionsxpath = "//select[@id='day']/option";
		String monthOptionsxpath = "//select[@id='month']/option";
		String yearOptionsxpath = "//select[@id='year']/option";
		
	doSelectValueFromDropdownWithoutSelect(driver,dayOptionsxpath,dob.split("-")[0]);
	doSelectValueFromDropdownWithoutSelect(driver,monthOptionsxpath,dob.split("-")[1]);
	doSelectValueFromDropdownWithoutSelect(driver,yearOptionsxpath,dob.split("-")[2]);
	
	}
	
	public static void doSelectValueFromDropdownWithoutSelect(WebDriver driver,String xpath,String value) {
			
		List<WebElement> valuesList = driver.findElements(By.xpath(xpath));
		
		System.out.println(valuesList.size());

		for (int i = 0; i < valuesList.size(); i++) {
			if (valuesList.get(i).getText().equals(value)) {
				valuesList.get(i).click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	}

}

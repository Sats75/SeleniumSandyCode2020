package com.obp.maven.Browsers;
//7th video 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling_2 {


	public static void main(String[] args ) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		String dob = "20-Jul-1975";
		
		//Using the methods to get the values
		selectDropDownValue(day,dob.split("-")[0]);
		selectDropDownValue(month,dob.split("-")[1]);
		selectDropDownValue(year,dob.split("-")[2]);

	}

	//Generic method without using select option
	public static void selectDropDownValue(WebElement element, String value) {
		Select select = new Select(element);

		List<WebElement> valuesList = select.getOptions();

		System.out.println(valuesList.size());

		for (int i = 0; i < valuesList.size(); i++) {
			if (valuesList.get(i).getText().equals(value)) {
				valuesList.get(i).click();
				break;

			}

		}

	}

}

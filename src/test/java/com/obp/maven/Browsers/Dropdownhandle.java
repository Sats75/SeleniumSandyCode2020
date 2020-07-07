package com.obp.maven.Browsers;
//Show 55th minute video but it starts with 42nd minute 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownhandle {

	public static void main(String[] args) {
		// HTML based dropdown facebook
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		// 3 webelements created using id concept ..
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
	}

	Select select = new Select(day);
	
	select.selectByVisibleText("15"); // This method is recommended
	select.selectByValue("9");//Not compulsory 
	select.deselectByIndex(20); //Eg India index got changed.....

	Select select1 = new Select(month);
	select1.selectByVisibleText("Apr"); 
	// This method is recommended

	Select select2 = new Select(year);select2.selectByVisibleText("1990"); //
	// This method is recommended

		SelectDropDownbyText(day, "15");
		SelectDropDownbyText(month, "Jul");
		SelectDropDownbyText(year, "1990");
	}

	// Above method is verbose & hence create a generic method and given below is
	// for month

	public static void GetDropDownValues(WebElement element) {
		
	//	Select select = new Select(element);//Select class will always ask for webelement
	
	Select selectMonth = new Select(month);
	List<WebElement> monthList = select.getOptions();
	System.out.println("total values in month dropdown"+monthList.size());
	for(int i = 0;i<monthList.size();i++)
	{
		System.out.println(monthList.get(i).getText());
	}

	// 2nd improved method
	public static void SelectDropDownbyText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);

	}

	public static void SelectDropDownbyIndex(WebElement element, String index) {
		Select select = new Select(element);
		select.selectByVisibleText(index);

	}
	//Best method
	public static void getDropdownValues(WebElement element) {
		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();
		System.out.println("total values in month dropdown" + optionsList.size());
		for (int i = 0; i < optionsList.size(); i++) {
			System.out.println(optionsList.get(i).getText());

		}

	}
}

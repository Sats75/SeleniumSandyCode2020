package com.obp.maven.Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//Famous IQ 
//First show the stale element exception and then u run it
//Debug and show 2 different versions V1 and V2. For every element it will be a unique webelement.
public class StaleElementException {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("sandy");
		
	driver.navigate().refresh();//Stale element exception
		
		username = driver.findElement(By.name("username"));
		username.sendKeys("Seleniumuser");
		
		
	}

}

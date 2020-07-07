package com.obp.maven.Browsers;

//This is last part of totallinks 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//2nd part of tag name 
public class GoogleLanguageLinks {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		java.util.List<WebElement> linkslist1 = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(linkslist1.size());

		for (int i = 0; i < linkslist1.size(); i++) {
			String text = linkslist1.get(i).getText();
			System.out.println(text);
			linkslist1.get(i).click();
			linkslist1 = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		}

	}

}

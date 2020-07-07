package com.obp.maven.Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcept {

	public static void main(String[] args) {


		WebDriverManager.chromiumdriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");//holding your driver .it will fully wait for the page to load.Preferred for fresh url
		
		driver.navigate().to("http:rediff.com"); //immediate
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		String title = driver.getTitle();
		System.out.println("Page title is " + title);
		
		
		
	}

}

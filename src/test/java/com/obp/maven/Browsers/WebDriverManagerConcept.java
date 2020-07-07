package com.obp.maven.Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");// launch url

		String title = driver.getTitle();
		System.out.println("Page title is " + title);

		if (title.equals("Facebook – log in or sign up")) {

			System.out.println("Correct Title");
		} else {
			System.out.println("Incorrect Title");
		}

		String url = driver.getCurrentUrl();
		if (url.contains("facebook")) {
			System.out.println("Correct URL");
		} else {
			System.out.println("Incorrect URL");
		}
	}

}

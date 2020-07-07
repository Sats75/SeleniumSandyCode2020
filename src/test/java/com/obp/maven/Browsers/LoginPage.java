package com.obp.maven.Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	// By locators --------page objects ..Create locators with any of the 8 learnt

	static By emailID = By.id("username");
	static By password = By.id("password");
	static By loginButton = By.id("loginBtn");
	static By SignUpLink = By.linkText("Sign up");
	static By homePageHeader = By.className("private-page-title");

	public static void main(String[] args) throws InterruptedException {

		BrowserActions br = new BrowserActions();
		WebDriver driver = br.launchbrowser("chrome");
		br.launchUrl("https://app.hubspot.com/login");
		Thread.sleep(5000);
		ElementUtil elementUtil = new ElementUtil(driver);

		elementUtil.doSendKeys(emailID, "ss@gmail.com");
		elementUtil.doSendKeys(password, "s12");
		elementUtil.doClick(loginButton);
		Thread.sleep(5000);

		String header = elementUtil.doGetText(homePageHeader);
		System.out.println("Homepage header is " + header);

		if (header.contains("Sales Dashboard")) {
			System.out.println("User has logged in successfully");

		} else {
			System.out.println("User has NOT logged in");

		}
		System.out.println(br.doGetTitle());
	}

}

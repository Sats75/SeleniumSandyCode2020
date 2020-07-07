package com.obp.maven.Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class JavaScriptUtilTest {

	public JavaScriptUtilTest(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		By emailid = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//input[@type='submit']");
		By menuLinks = By.cssSelector("ul.nav.navbar-nav.navbar-right");
		By forgotPwd = By.linkText("Forgot Password?");
		
		JavaScriptUtilTest jsUtil = new JavaScriptUtilTest(driver);
		System.out.println(jsUtil.getTitleByJS());
		
		String innerText = jsUtil.getPageInnerText();
		System.out.println(innerText);
	
		if(innerText.contains("Import & Export")){
			System.out.println("yes, this text is present");
		}
		
		
		System.out.println(jsUtil.getBrowserInfo());
		
		//jsUtil.refreshBrowserByJS();
//		driver.findElement(emailid).sendKeys("batchautomation");
//		driver.findElement(password).sendKeys("Test@12345");
//		//driver.findElement(login).click();
//		jsUtil.clickElementByJS(driver.findElement(login));
		
//		jsUtil.drawBorder(driver.findElement(login));
//		jsUtil.drawBorder(driver.findElement(menuLinks));

		//jsUtil.flash(driver.findElement(login));
		
		//jsUtil.generateAlert("login is done");
		
		//jsUtil.scrollPageDown();
	//	jsUtil.scrollIntoView(driver.findElement(forgotPwd));
	//	jsUtil.flash(driver.findElement(forgotPwd));

	//	jsUtil.sendKeysUsingJSWithId("username", "naveen");
		
		
	}

	private char[] getBrowserInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getPageInnerText() {
		// TODO Auto-generated method stub
		return null;
	}

	private char[] getTitleByJS() {
		// TODO Auto-generated method stub
		return null;
	}


}
		
		
		
		
		
		
		
	



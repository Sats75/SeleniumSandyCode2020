package com.obp.maven.Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Modum and router .Login page is not ready
//User name,pw on the pop up ...May be the site is not ready
//URL and User name and Password is the solution
//Internal or 3 rd party only due to login page not ready ....this is a rare case
public class AuthenticationPopUp {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String username = "admin";
		String password = "admin";
		
		driver.get("http://" + username +" : "+ password + "@" + "the-internet.herokuapp.com/basic_auth");

		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");//Username + PW provided along with the link
	
			}

}

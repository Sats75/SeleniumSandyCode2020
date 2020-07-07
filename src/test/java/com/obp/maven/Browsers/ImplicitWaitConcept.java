package com.obp.maven.Browsers;


//14th min in the video _Selenium 11 th session
//1st show no such element exception without wait
//timeouts methods ,implicitly wait -it will be applied for all the web elements by default as it is applied on driver 
//To be applied after driver .We should never use this implicit wait 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver= new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.hubspot.com/login");
		
		//Implicit wait will be applied for all elements by default & global wait...Dynamic wait ...Appiied only for web elements.
		
		//Rest of the seconds will be ignored
		
		WebElement emailid = driver.findElement(By.id("username")); //5 secs
		WebElement pw = driver.findElement(By.id("password"));//1 sec
		WebElement loginbutton = driver.findElement(By.id("loginBtn")); //0 sec
	
		emailid.sendKeys("sandy");
		pw.sendKeys("ss23");
		loginbutton.click();
		//Can be used anywhere and you can override 	
		//Homepage
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//nullify 
		 driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

		
		//Disadv -It will wait even if it is done and for each webelement 10 secs will be given
		 
		
	}

}

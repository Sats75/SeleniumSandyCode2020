package com.obp.maven.Browsers;
//Important concept 
//Spicejet assignment - 3 levels 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html/26146");
		Thread.sleep(5000);
		WebElement contentlink = driver.findElement(By.className("menulink"));
		
		Actions action = new Actions(driver) ;
		action.moveToElement(contentlink).build().perform();
		driver.findElement(By.linkText("COURSES")).click();
		

		
		
	}

}

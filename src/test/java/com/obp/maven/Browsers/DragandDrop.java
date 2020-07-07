package com.obp.maven.Browsers;

//Drag and drop between elements....very rare case ...only IQ not from practical purpose 
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(12000);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		
		Actions action = new Actions(driver) ;
	
		action.dragAndDrop(source, target).build().perform();//Build will collect all actions & then perform the action
		
	//	action.clickAndHold(source).moveToElement(target).release().build().perform();//Manually if u want to do
		
		
		
		
		
	}

}

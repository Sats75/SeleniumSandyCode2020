package com.obp.maven.Browsers;
//ERP apps 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickWebElement {

	public static void main(String[] args) {


		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	    
	WebElement rightclickMe =   driver.findElement(By.xpath("//span[text()='right click me']"));
	
List< WebElement> optionsList = driver.findElements(By.xpath("//ul/ui[contains(@class,'context-menu-icon')]/span"));
	   
	   doRightClick(driver , rightclickMe , optionsList,"Quit");
	
	}
		
	public static void doRightClick(WebDriver driver, WebElement rightClickElement,List<WebElement> optionsList ,String value) {
		
		 Actions action = new Actions(driver);
	   action.contextClick(rightClickElement).build().perform(); //contextClick is a method name
	  
	System.out.println("total right click options:" + optionsList.size());
			

	for(int i=0; i<optionsList.size();i++) {
		 String text = 	optionsList.get(i).getText();
		 System.out.println(i +"--->" + text);
		 
		 if(text.equals(value))
		optionsList.get(i).getText();
		 break;
			 }
			
		
	}
		
		
	}



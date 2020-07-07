package com.obp.maven.Browsers;

//new window ........separate ......new chrome browser pop up. Main and pop up window
//Set will not store in the value of 0 and 1. 
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowClass {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		//Set converted to list .Another method.Set no dup values but in array we can hv dup values  == IQ
		driver.findElement(By.linkText("Good PopUp #3")).click();//Pop up will be opened
		Set <String> handles =  driver.getWindowHandles();// window id method or concept(Collection of window id's ) .this is not indexbased loop.Iterator concept
	//	List <String> handlesList = new ArrayList <String> (handles);//List is the parent interface of arraylist class as window id is string (with generics)
		java.util.Iterator<String> it = handles.iterator();//Iterator method because it is not an array as  we cannot use for loop
		
	//	String parentWindID=handlesList.get(0);
	//	System.out.println(parentWindID);

	//	String childWindID=handlesList.get(1);
	//	System.out.println( childWindID);

		
		String parentWindowID = it.next();//this method is used to move iterator to the first window
		System.out.println("parent window id is "+ parentWindowID);
		
		String childWindowID = it.next(); //this method is used to move iterator to the popup window id/child window id
		System.out.println("child window id is "+ childWindowID);
		
		driver.switchTo().window(childWindowID); //to switch from parent window to child window id we shld use this 
		
		System.out.println("child window title is" + driver.getTitle());
		
		driver.close();  //child window gets closed 
		
		driver.switchTo().window(parentWindowID); //to switch from child window to parent window id we shld use this
		
		System.out.println("parent window title is" + driver.getTitle());
		
		
		
		
	}

}

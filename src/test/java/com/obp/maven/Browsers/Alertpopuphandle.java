package com.obp.maven.Browsers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//Do it in chrome
//Console -- Explain  the alert pop up in chrome = Console--Clear console(Cntl+L) == alert('This is my alert box')
//rediffmail.com - directly  click on sign in button 
public class Alertpopuphandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		String username = "admin";
		String password = "admin";
       driver.get("http://"+username + ":"  + password+"@"+"the-internet.herokuapp.com/basic_auth");//url
     //   driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");//Along with url provide credentials

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click(); //no id and hence ...name is used
		Thread.sleep(4000);
        Alert alert = driver.switchTo().alert();//Method asked driver to switch to pop up alert.Alert is an interface.Hence no object
        String text = alert.getText();
        System.out.println(text);
        
        if(text.equals("Please enter a valid user name")) {
        	System.out.println("Correct error message");
        }
        	else{
        		System.out.println("Incorrect error message");
        }

        alert.accept(); //to click on ok
       // alert.dismiss();// cancel the alert ...Esc keyword
	}
		
		
	}



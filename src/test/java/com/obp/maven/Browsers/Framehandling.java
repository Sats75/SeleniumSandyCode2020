
package com.obp.maven.Browsers;

//Element is present on frame ...Title page//Present in between 
//Switch to frame and then interact with the element.Frame is also hvg its own HTML
//You can create webelement for frame.Frame is also a webelement
//In few websites iframe will also be there.
//Modern applications - W3 standard - Frames are not right way to use it in web application
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Framehandling {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");

		// driver.switchTo().frame(2); //Indexing is risky ..
		// driver.switchTo().frame("main"); //Name present 
		// driver.switchTo().frame(arg0)
		driver.switchTo().frame(driver.findElement(By.name("main")));

		WebElement header = driver.findElement(By.xpath("/html/body/h2"));
		System.out.println(header.getText());

		driver.switchTo().defaultContent();/// Switching to mainpage & it is applicable only for frames
	}

}


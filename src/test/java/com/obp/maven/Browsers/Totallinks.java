package com.obp.maven.Browsers;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Total links and Google language links 
public class Totallinks {

	// get total links on the page & print text of each link
	// print the text for each link
	// html tag for links is a tag & for image it is img
	// links = <a href = " "sign up/>
	// findelements for multiple elements .Every link has a tag
	// List is parent of arraylist. Object will store webelement (Links)
	// Last explain google - Where u want to inspect only some part (Languages) --
	// div

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		java.util.List<WebElement> linklist = driver.findElements(By.tagName("a"));
		int totallink = linklist.size();
		System.out.println("Total links on the page " + totallink);
		// Print all links.Get text will capture the text & store it in string variable

		for (int i = 0; i < totallink; i++) {
			String linkText = linklist.get(i).getText();
			System.out.println(linkText);
			System.out.println("Total links on the page " + totallink);

		//	Blank spaces will not be printed in isempty method
			 if (!linkText.isEmpty()) {
			 System.out.println(i + "------->" + linkText + "------>");
			 System.out.println(linklist.get(i).getAttribute("href"));

			// images img tag to get total images on the page
			// java.util.List<WebElement> imagelist =
			// driver.findElements(By.tagName("img"));
			// int imglist = imagelist.size();
			// System.out.println("Total images : " + imagelist.size());

			// for (int j = 0; j < imagelist.size(); j++) {
			// System.out.println(imagelist.get(j).getAttribute("src"));
		}
	}

}

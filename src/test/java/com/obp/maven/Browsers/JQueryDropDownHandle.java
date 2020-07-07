package com.obp.maven.Browsers;

//... dot parameter...choice 2 and 3 will be given to value (Array)
//In Python and in C sharp it is the same .

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDownHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		Thread.sleep(3000);
		driver.findElement(By.id("justAnInputBox")).click();

		//Single selection
	//	selectChoiceValues(driver, "choice 2");

		//Multi selection
		selectChoiceValues(driver, "choice 2", "choice 2 3", "choice 7");
		
		//Selecting all values
	//  selectChoiceValues(driver, "ALL");
	}

	public static void selectChoiceValues(WebDriver driver, String... value) {

		List<WebElement> choiceList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));

		if (!value[0].equalsIgnoreCase("ALL")) {

			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				System.out.println(text);

				for (int k = 0; k < value.length; k++) {
					if (text.equals("value[k]")) {
						choiceList.get(i).getText();
						break;
					}
				}
			}
//select all the values
	} else {
			try {
				for (int ALL = 0; ALL < choiceList.size(); ALL++) {
					choiceList.get(ALL).click();
				}
			} catch (Exception e) {

			}

		}
	}
}

package org.iit.mmpiit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Totalqa_SoftAssert {

	ChromeDriver driver;
	@Test
	public void verifyTitle() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://total-qa.com/");
		SoftAssert sa = new SoftAssert();
		
		String expectedTitle = "Selenium QA";
		String actualTitle =   driver.getTitle();
		//First Assertion actual is matching as expected
		//Assertion is failed, continue with the execution
		sa.assertEquals(actualTitle, expectedTitle);
		
		String expectedText ="Advanced Selenium"; 
		String actualText = driver.findElement(By.linkText("Advanced Selenium")).getText();
		sa.assertEquals(actualText, expectedText);
		
		//Its mandatory to call this statement
		//If any of the assertions are failed the Test case will fail
		sa.assertAll();
	}
}

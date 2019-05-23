package org.iit.mmpiit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MMPHomePage {

	WebDriver driver;
	By idValue=By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension");

	public MMPHomePage(WebDriver driver) {
		  this.driver = driver;
	}

	public void clickonMenuItem(String menuName)
	{

		driver.findElement(By.xpath("//span[contains(text(),'"+menuName+"')]")).click();
		driver.findElement(idValue).click();


	}
	public void clickonMenuItem1(String menuName)
	{

		driver.findElement(By.xpath("//span[contains(text(),'"+menuName+"')]")).click();
		driver.findElement(idValue).click();


	}
}

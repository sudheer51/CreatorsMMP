package org.iit.mmpiit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	public void invokeBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/binaries/geckodriver.exe");
	}
	public void logout()
	{
		
	}
	public void login(String url,String u1,String p1)
	{
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(u1);
		driver.findElement(By.id("password")).sendKeys(p1);
		driver.findElement(By.id("Inpatient Ward")).click();
		driver.findElement(By.id("loginButton")).click();
	}

}

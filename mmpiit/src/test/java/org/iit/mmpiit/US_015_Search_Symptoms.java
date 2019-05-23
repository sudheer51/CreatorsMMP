package org.iit.mmpiit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class US_015_Search_Symptoms extends BaseClass {


	@Parameters({"url","u1","p1"})
	@Test
	public void TC_001_validateLogin_Parameters(String url,String u1,String p1)
	{
		invokeBrowser();
		login(url,u1,p1);
		String actual = driver.findElement(By.xpath("//h4[contains(text(),'Logged in as Super User () at Inpatient Ward.')]")).getText();
		String expected ="Logged in as Super User () at Inpatient Ward.";
	    MMPHomePage hPage = new MMPHomePage(driver);
		hPage.clickonMenuItem("Schedule Appointment");
		hPage.clickonMenuItem1("Schedule Appointment");
		Assert.assertEquals(actual, expected);

	}
	@Parameters({"url","u1","p1"})
	@Test
	public void TC_002_validate_FindAPatientRecord(String url,String u1,String p1)
	{
		invokeBrowser();
		login(url,u1,p1);
		 
	}

 



}
















//
//@Test(enabled=false)
//public void validateLogin()
//{
//	WebDriverManager.chromedriver().setup();
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://demo.openmrs.org/openmrs/login.htm");
//	driver.findElement(By.id("username")).sendKeys("Admin");
//	driver.findElement(By.id("password")).sendKeys("Admin123");
//	driver.findElement(By.id("Inpatient Ward")).click();
//	driver.findElement(By.id("loginButton")).click();
//	String actual = driver.findElement(By.xpath("//h4[contains(text(),'Logged in as Super User () at Inpatient Ward.')]")).getText();
//	String expected ="Logged in as Super User () at Inpatient Ward.";
//	Assert.assertEquals(actual, expected);
//	
//}
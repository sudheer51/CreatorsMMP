package org.iit.mmpiit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class US_015_Search_Symptoms_MMP extends BaseClass {


	@Parameters({"url"})
	@Test
	public void TC_001_validateLogin_Parameters(String url)
	{
		invokeBrowser();
		driver.get(url);
		boolean result = clickonMenuItem("Fees","Fees");
	    Assert.assertTrue(result);
	}
	 

	public boolean clickonMenuItem(String menuName,String expected )
	{
		driver.findElement(By.xpath("//span[contains(text(),'"+menuName+"')]")).click();
		String actual = driver.findElement(By.xpath("//h3[@class='panel-title']")).getText();
		return expected.equals(actual);
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
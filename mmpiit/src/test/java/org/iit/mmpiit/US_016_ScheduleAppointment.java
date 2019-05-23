package org.iit.mmpiit;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class US_016_ScheduleAppointment{ //extends BaseClass {
	//	@Parameters({"url","u1","p1"})
	//	@Test
	//	public void validate_schedule_Appointment(String url,String u1,String p1)
	//	{
	//		invokeBrowser();
	//		login(url,u1,p1);
	//	}

	@Test
	public void clickLogin()
	{

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.macys.com/");
		
		driver.findElement(By.xpath("//li[@id='header-wishlist-label']//a[contains(text(),'LISTS')]")).click();
		String actual = driver.findElement(By.xpath("//h3[contains(text(),'Guest List')]")).getText();

		String expected ="Guest List";
		Assert.assertEquals(actual, expected);
		//driver.findElement(By.xpath("//div/a[@class='button button-alt'][contains(text(),'Login')]")).click ();

	}


}

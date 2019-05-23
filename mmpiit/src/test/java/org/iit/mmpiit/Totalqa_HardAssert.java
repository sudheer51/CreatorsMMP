package org.iit.mmpiit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Totalqa_HardAssert {
	
	ChromeDriver driver;
	@Test
	public void verifyTitle() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://total-qa.com/");
		String expected = "Total-QA - Future of Software Testing";
		String actual =   driver.getTitle();
		Assert.assertEquals(actual, expected);
		Assert.assertNotNull(driver);
	}
}

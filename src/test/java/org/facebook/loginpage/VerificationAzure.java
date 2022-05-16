package org.facebook.loginpage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Facebook.Testing.LaunchBrowser;

public class VerificationAzure extends LaunchBrowser {

	public WebDriver driver;
	@BeforeTest
	public void initialFlow() {
	driver = Browserselection();
	}
	@Test
	public void testAzure() {
		driver.get("https://mayankdemo.azurewebsites.net/webapp/");
		String urldata = driver.getCurrentUrl();
		System.out.println(urldata);
		Assert.assertEquals(urldata, "https://mayankdemo.azurewebsites.net/webapp/");
		
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
}
	
		
	

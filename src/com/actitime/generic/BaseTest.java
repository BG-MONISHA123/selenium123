package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	public WebDriver driver;
  @BeforeMethod
public void precondition()
{
	
	System.setProperty("webdriver.gecko.driver","C:\\cigniti\\automation\\drivers\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver","C:\\cigniti\\automation\\drivers\\chromedriver.exe");
	driver = new FirefoxDriver();
	// driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
}
 @AfterMethod
 public void postcondition()
 {
	 driver.close();
 }

}




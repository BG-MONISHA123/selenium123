package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage
{
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void VerifyTitle(String eTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.titleContains(eTitle));
			Reporter.log("title is mathing.. "+eTitle ,true);
		}
		catch(Exception e)
		{
			Reporter.log("title is not mathing..",true);
			Assert.fail();
		}
	}
   public void verifyElement(WebElement element)
   {
	   WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element is present..",true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not present..",true);
			Assert.fail();
		}
   }
}

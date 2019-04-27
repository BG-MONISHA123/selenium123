package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;

public class LoginPage extends BasePage
{
	
	@FindBy (id = "username") 
	private WebElement unTB;
	@FindBy(name = "pwd")
	private WebElement pwTB;
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement loginBTN ;
	@FindBy(xpath = "//nobr[contains(text(),'actiTIME')]")
	private WebElement version;


	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	

public void enterusername(String un )
{
	unTB.sendKeys(un);
}
public void enterpassword(String pw)
{
	pwTB.sendKeys(pw);
}
public void clickonlogin()
{
	loginBTN.click();
}
public void verifypage(String eTitle)
{
	VerifyTitle(eTitle);
}
public void verifyversion()

{
	verifyElement(version);
}
}

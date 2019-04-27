package com.actitime.tests;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
	@Test
	public void testvalidloginlogout()
	{
	String user = ExcelData.getData("./data/input.xlsx", "sheet2", 1, 0);
	String pass = ExcelData.getData("./data/input.xlsx", "sheet2", 1, 1);
	String LoginTitle = ExcelData.getData("./data/input.xlsx", "sheet2", 1, 2);
	String enterTimeTrack = ExcelData.getData("./data/input.xlsx", "sheet2", 1, 3);
	LoginPage lp = new LoginPage(driver);
	EnterTimeTrackPage ep = new EnterTimeTrackPage(driver);
	lp.verifypage(LoginTitle);
	lp.enterusername(user);
	lp.enterpassword(pass);
	lp.clickonlogin();
	lp.verifypage(enterTimeTrack);
	ep.clickonlogout();
	lp.verifypage(LoginTitle);
	}
}

	
	
	



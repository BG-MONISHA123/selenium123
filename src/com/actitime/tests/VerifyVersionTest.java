package com.actitime.tests;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.LoginPage;

public class VerifyVersionTest extends BaseTest
{
	@Test
	public void testVerifyVersionTest()
	{
		String loginTitle = ExcelData.getData("C:\\cigniti\\Actitime\\data\\input.xlsx", "sheet2", 1, 4);
		LoginPage lp = new LoginPage(driver);
		lp.verifypage(loginTitle);
		lp.verifyversion();
	}
	

}

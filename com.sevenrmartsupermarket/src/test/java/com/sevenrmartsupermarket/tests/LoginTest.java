package com.sevenrmartsupermarket.tests;

import org.testng.Assert;

import org.testng.annotations.Test;
import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.dataprovider.TestDataProvider;
import com.sevenrmartsupermarket.listeners.RetryAnalyzer;
import com.sevenrmartsupermarket.pages.DashBoardPage;
import com.sevenrmartsupermarket.pages.LoginPage;

import com.sevenrmartsupermarket.utilities.ExcelReader;
import com.sevenrmartsupermarket.utilities.GeneralUtility;

public class LoginTest extends Base {

	LoginPage loginpage;
	DashBoardPage dashboardpage;
	ExcelReader excelreader = new ExcelReader();

	@Test(retryAnalyzer = RetryAnalyzer.class, groups="smoke")
	public void verifyValidLogin() {
		loginpage = new LoginPage(driver);
		dashboardpage = new DashBoardPage(driver);

		excelreader.setExcelFile("LoginPage");
		String st = excelreader.getCellData(0, 1);
		System.out.println(st);
		String st1 = GeneralUtility.getRandomName();
		System.out.println(st1);

		loginpage.login("admin", "admin");
		String actualProfileName = dashboardpage.getProfileName();
		String expectedProfileName = "Admin";
		Assert.assertEquals(actualProfileName, expectedProfileName);

	}

	@Test(dataProvider = "loginData", dataProviderClass = TestDataProvider.class, groups="smoke")
	public void testLogin(String username, String password) {
		loginpage = new LoginPage(driver);
		loginpage.login(username, password);
	}

}

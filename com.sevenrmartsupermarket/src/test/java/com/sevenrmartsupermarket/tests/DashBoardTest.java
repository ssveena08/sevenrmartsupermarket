package com.sevenrmartsupermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.DashBoardPage;
import com.sevenrmartsupermarket.pages.LoginPage;

public class DashBoardTest extends Base {

	DashBoardPage dashboardpage;
	LoginPage loginpage;

    @Test (groups={"smoke","regression"})
    public void verifyDashboardTitleIsDisplayed() {
    	
    	loginpage = new LoginPage(driver);
    	dashboardpage = new DashBoardPage(driver);
        loginpage.login("admin", "admin");
        String actualtitle=dashboardpage.getPageTitle();
        System.out.println(actualtitle);
		String expectedtitle="Dashboard | 7rmart supermarket";
		Assert.assertEquals(actualtitle,expectedtitle);
		
    }
	
	
}

package com.sevenrmartsupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	WebDriver driver;
	@FindBy(xpath="//a[@class='d-block']")
	private WebElement profileNameElement;
	@FindBy(xpath="//div[@class='small-box bg-info']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")
	private WebElement adminMoreinfo;
	public DashBoardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); 		
	}
	public String getProfileName()
	{
		return profileNameElement.getText();
	}
	  public String getPageTitle() 
	  {
	        return driver.getTitle();
	   }  
	  public void clickOnAdminMoreInfo1()
		{
			
			adminMoreinfo.click();
		}
	  
	  
	
}

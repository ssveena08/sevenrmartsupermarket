package com.sevenrmartsupermarket.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;


import com.sevenrmartsupermarket.utilities.PageUtility;

public class AdminUsersMoreInfoPage {

	WebDriver driver;
	DashBoardPage dashboardpage;
	@FindBy(xpath="(//a[@class='small-box-footer'])[1]")
	private WebElement MoreInfobutton;
	@FindBy(xpath="(//span[text()='Active'])[1]")
	private WebElement ActiveStatus;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	private WebElement AddUser;
	@FindBy(xpath="//input[@id='username']")
	private WebElement NewUserName;
	@FindBy(xpath="//input[@id='password']")
	private WebElement NewPassword;
	@FindBy(xpath="//select[@id='user_type']")
	private WebElement SelectType;
	@FindBy(xpath="//button[@name='Create']")
	private WebElement Save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successfulUserCreationAlert;
	
	
	
	public AdminUsersMoreInfoPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); 
		
	}
	
	public String clickMoreInfobuttonbackgroundcolor()
	{
		MoreInfobutton.click();
		return ActiveStatus.getCssValue("background-color");
		
	}
	
	public String createNewUser(String userName,String passWord,String type)
	{
		
		PageUtility pageutility=new PageUtility(driver);
		Select select=new Select(SelectType);
		dashboardpage=new DashBoardPage(driver);
		
		AddUser.click();
		NewUserName.click();
		NewUserName.sendKeys(userName);
		NewPassword.sendKeys(passWord);
		pageutility.selectByVissibleText(SelectType,type);
		Save.click();
		return successfulUserCreationAlert.getText();
		
	}
	
	
}


package com.sevenrmartsupermarket.utilities;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

public class GeneralUtility {
	
	public String get_Attribute(WebElement element, String attribute)
	{
		return element.getAttribute(attribute);
	}
	
	public String get_Cssvalue(WebElement element, String cssvalue)
	{
		return element.getCssValue(cssvalue);
	}
	
	public void enterDate(WebElement element, String date) 
	{
	    element.sendKeys(date);
	}
	
	public List<String> listAllHeaders(List<WebElement> elements)
	{
	    List<String> headers = new ArrayList<>();
	    for (WebElement element : elements) 
	    {
	        headers.add(element.getText());
	    }
	    return headers;
	}
	public static String getRandomName()
	{
		Faker faker=new Faker();
		return faker.name().firstName();
	}
	
	public static String get_TimeStamp()
	{
		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
		return timeStamp;
	}
	}
	



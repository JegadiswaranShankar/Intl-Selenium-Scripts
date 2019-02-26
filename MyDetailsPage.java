package com.hc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.hc.functionlibrary.Commanmethod;

public class MyDetailsPage {
	
	
	WebDriver driver;
	Commanmethod cm = new Commanmethod();
	String homeURL = "https://mtest.hotcoursesabroad.com/";
	By ChangePwd = By.xpath("//A[@class='fright'][text()='Change password']");
   
	public MyDetailsPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void clickChangePwd()
	{
		driver.findElement(ChangePwd).click();
	}
	
    
}

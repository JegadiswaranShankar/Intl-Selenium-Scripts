package com.hc.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.hc.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class CourseDetailsPage {
	
static WebDriver driver;
static Commanmethod cm = new Commanmethod();
	
    By topNavlogIcn = By.xpath("//li[@id='topNavLlogLi']");
    By topNavlogLink = By.xpath("html/body/header/div/nav/ul/li[2]/div/div[2]/ul/li[1]/a");
    By favlink = By.xpath("//span[@class='fa fa-heart-o']");
	
	public CourseDetailsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void verifyFavLinkCD()
	{
		
		if(driver.findElement(favlink).isDisplayed())
		{
			Commanmethod.logger.log(LogStatus.PASS,"Verified..Favourite link is presence in CD page");
		}
		else
		{
			Commanmethod.logger.log(LogStatus.FAIL,"Verified..Favourite link is Not presence in CD page");
		}
	}
	
	public void  verifyShortListLinkCD() throws InterruptedException 
	{
		
		
		if(driver.findElement(favlink).isEnabled())
		{
		driver.findElement(favlink).click();
		cm.logger.log(LogStatus.PASS,"Verified..Shortlist icon clicked successfully!!");
		Thread.sleep(5000);
		
		
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Shortlist icon is Not Enabled");
		}
		
		
	 		
	}
	
	public void clickTopNavLogIcn()
	{
		if(driver.findElement(topNavlogIcn).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Top Navigation Login Icon Available in Home Page");
			driver.findElement(topNavlogIcn).click();
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Verified..Top Navigation Login Icon Not Available in Home Page");
		}
	}
	
	
	public void clickTopNavLoginLink()
	{
		if(driver.findElement(topNavlogLink).isDisplayed())
		{
			System.out.println("dfdf");
		}
	}
	

}

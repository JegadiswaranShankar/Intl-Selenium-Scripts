package com.hc.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.hc.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class ProviderResultsPage {
	
	
	WebDriver driver;
	Commanmethod cm = new Commanmethod();
	
	By favlink = By.xpath("//span[@class='fa fa-heart-o']");
	By favpod = By.xpath("//div[@id='shrVwFavPopId']");
	By Myfavlink = By.xpath("//a[@class='fav_btn caps']");
	By ContactUniv = By.xpath("//*[@id='contInst']/a");
	By ViewMyFavBtn = By.xpath("//*[@id='shrVwFavPopId']/a");
	By InstitutionLogo = By.xpath("//*[@id='cdBannerWrapId']/div[2]/div[2]/div/div[2]/p[1]/span/img");
	
	public ProviderResultsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void verifyFavLinkPR()
	{
		if(driver.findElement(favlink).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Shortlist icon is presence in PR Page!!");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Shortlist icon is Not presence in PR Page!!");
		}
	}
	
	
	
	public void verifyShortListLinkPR() throws InterruptedException
	{
		driver.findElement(favlink).click();
		cm.logger.log(LogStatus.INFO,"Verified..Shortlist icon clicked successfully!!");
		   Thread.sleep(5000);
	 		
	}
	
	public void verifyAddtoFavPod()
	{
		
		if(driver.findElement(favpod).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Add to favourites pod is presence!!");
			String actualtxt = driver.findElement(favpod).getText();
			
		    Assert.assertTrue(actualtxt.contains("Added to favourites"));
		    cm.logger.log(LogStatus.PASS,"Verified..Added to favourites text present");
		    
		    Assert.assertTrue(actualtxt.contains("VIEW MY FAVOURITES"));
		    cm.logger.log(LogStatus.PASS,"Verified..VIEW MY FAVOURITES text present");
	     	//*****Need to check view my fav is link or not 
		    
		}
		
	}
	
//	public void verifyViewMyFavlink()
//		{
//			if(driver.findElement(Myfavlink).isEnabled())
//			{
//				cm.logger.log(LogStatus.PASS,"Verified..VIEW MY FAVOURITES button is clickable");
//			}
//		}
	
	public void verifyMyFavBtn()
	{
			driver.findElement(ViewMyFavBtn).click();
			cm.logger.log(LogStatus.PASS, "Verified..VIEW MY FAVOURITES BUTTON is displayed & clickable");
		
	}
	
	public void verifyContactUnivBtn() throws InterruptedException
	{
		if(driver.findElement(ContactUniv).isEnabled())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Contact University Button presence");
			Thread.sleep(5000);
			driver.findElement(ContactUniv).click();
			
			
		}
	}
	
	
	public void verifyPagetitle()
	{
		String expected_title = "My Favourites";
		String actual_title = driver.findElement(By.xpath("//*[@id='middle_cnt']/div/div[2]/h1")).getText();
		System.out.println(actual_title);
		if(expected_title.equals(actual_title))
		{
			cm.logger.log(LogStatus.PASS,"Verified..Expected and Actual Page titles are same");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Expected and Actual Page titles are not same");
		}
//		Assert.assertEquals(str, "Hotcourses Abroad");
//		cm.logger.log(LogStatus.INFO,"Verified..Expected and Actual Page titles are same");
//		cm.logger.log(LogStatus.PASS,"Test case Passed");
	}
	
	
	public void verifyUniversityName()
	{
		String expected_name = "University of Hertfordshire";
		String actual_name = driver.findElement(By.xpath("//*[@id='collContent']/div/div[2]/h2/a")).getText();
		System.out.println(actual_name);
		
		if(expected_name.equals(actual_name))
		{
			cm.logger.log(LogStatus.PASS, "Verified..Expected and Actual University Names are same");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Verified..Expected and Actual University Names are Not same");
		}
	}
	
}
	
	        


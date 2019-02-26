package com.hc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.hc.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class SearchResultsPage {
	
	
	WebDriver driver;
	Commanmethod cm = new Commanmethod();
	By SRfavlink = By.xpath("//span[@class='fa pr fa-heart-o']");
	
	
	public SearchResultsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void verifyFavLinkSR()
	{
		if(driver.findElement(SRfavlink).isDisplayed())
		{
			
			cm.logger.log(LogStatus.INFO,"Verified..Favourite link is presence in SR Page!!");
		}
	}
	
	public void verifyShortListLinkSR() throws InterruptedException
	{
		driver.findElement(SRfavlink).click();
		cm.logger.log(LogStatus.INFO,"Verified..Shortlist icon clicked successfully!!");
		
	 		
	}

}

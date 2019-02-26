package com.hc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.hc.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class RegionLandingPage {
	
	By RegionSearchPod = By.xpath("//*[@id='tab1']");
	By RegionPageHeaderName = By.xpath("//SPAN[@class='lst'][text()='North America']");
	By CountryPod1 = By.xpath("(//DIV[@class='ctry_rgt des'])[1]");
	By CountryPod2 = By.xpath("(//DIV[@class='ctry_rgt des'])[2]");
	By MoreInfoBtn = By.xpath("(//DIV[@class='blu_btn'][text()='MORE INFO'][text()='MORE INFO'])[1]");
	By Banner = By.xpath("//IMG[@src='https://tpc.googlesyndication.com/simgad/8922252233145428480']/self::IMG");
    WebDriver driver;
	
    Commanmethod cm = new Commanmethod();
    
    
    public RegionLandingPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
    
    
    public void verifySearchpod()
    {
    	if(driver.findElement(RegionSearchPod).isDisplayed())
    	{
    		cm.logger.log(LogStatus.PASS, "Search Pod is Available in Region Landing Page");
    	}
    	else
    	{
    		cm.logger.log(LogStatus.FAIL, "Search Pod is Not Available in Region Landing Page");
    	}
    }
    
    
    public void verifyRegionHeader()
    {
    	if(driver.findElement(RegionPageHeaderName).getText().contains("North America"))
		{
	    cm.logger.log(LogStatus.PASS,"Navigated to Region Landing Page");
		}
    	else
    	{
    		cm.logger.log(LogStatus.FAIL,"Not navigated to Region Landing Page");
    	}
    }
    
    
    public void verifyCountryPod1()
    {
    	if(driver.findElement(CountryPod1).getText().contains("STUDY IN USA"))
    	{
    		cm.logger.log(LogStatus.PASS, "Study in Country1 pod available");
    	}
    	else
    	{
    		cm.logger.log(LogStatus.FAIL, "Study in Country1 pod Not available");
    	}
    }
    
    
    public void verifyCountryPod2()
    {
    	if(driver.findElement(CountryPod2).getText().contains("STUDY IN CANADA"))
    	{
    		cm.logger.log(LogStatus.PASS, "Study in Country2 pod available");
    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
  		    jse1.executeScript("window.scrollBy(0,1000)", "");
    	}
    	else
    	{
    		cm.logger.log(LogStatus.FAIL, "Study in Country2 pod Not available");
    	}
    }
    
    public void verifyBanner()
    {
    	int size = driver.findElements(By.tagName("iframe")).size();
    	if(size>1)
    	{
    		cm.logger.log(LogStatus.PASS, "Banner available in Region Landing Page");
    	}
    	else
    	{
    		cm.logger.log(LogStatus.FAIL, "Banner is Not available in Region Landing Page");
    	}
    }
    
    public void regiontoCountry()
    {
    	driver.findElement(MoreInfoBtn).click();
    	
    }

}

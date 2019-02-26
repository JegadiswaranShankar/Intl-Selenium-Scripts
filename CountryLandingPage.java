package com.hc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.hc.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class CountryLandingPage {
	
	By CountryPageHeader = By.xpath("//H1[@class='hc_hdr'][text()='Study in the USA']");
	By SearchPod = By.xpath("//DIV[@class='bnrr']");
	By EbookButton = By.xpath("//A[@id='regEbookBtnId']");
	By FeaturedInstitution = By.xpath("//*[@id='providerOnCountryLanding']/div[2]/a");
	
	
	
	By ArticleSection = By.xpath("//DIV[@class='hc_art rgt nw_dte']/preceding-sibling::DIV");
    WebDriver driver;
	
    Commanmethod cm = new Commanmethod();
    
    public CountryLandingPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
    
    
    public void verifyCountryHeader()
    {
    	if(driver.findElement(CountryPageHeader).getText().contains("Study in the USA"))
		{
	    cm.logger.log(LogStatus.PASS,"Navigated to Country Landing Page");
		}
    	else
    	{
    		cm.logger.log(LogStatus.FAIL,"Not navigated to Country Landing Page");
    	}
    }
    
    
    public void VerifySearchPod()
    {
    	if(driver.findElement(SearchPod).isDisplayed())
    	{
    		cm.logger.log(LogStatus.PASS, "Search Pod Available in Country Landing Page");
    	}
    	else
    	{
    		cm.logger.log(LogStatus.FAIL, "Search Pod is Not Available in Country Landing Page");
    	}
    }

    public void VerifyEbookButton() throws InterruptedException
    {
    	if(driver.findElement(EbookButton).isDisplayed())
    	{
    		cm.logger.log(LogStatus.PASS, "Ebook Button Available in Country Landing Page");
    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
    		  jse1.executeScript("window.scrollBy(0,2000)", "");
    		  Thread.sleep(2000);
    	}
    	else
    	{
    		cm.logger.log(LogStatus.FAIL, "Ebook Button is Not Available in Country Landing Page");
    	}
    }
    
    
    public void VerifyFeaturedInstitution() throws InterruptedException
    {
    	if(driver.findElement(FeaturedInstitution).isDisplayed())
    	{
    		cm.logger.log(LogStatus.PASS, "Featured Institution Available in Country Landing Page");
    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
  		  jse1.executeScript("window.scrollBy(0,1000)", "");
  		  Thread.sleep(1000);
    	}
    	else
    	{
    		cm.logger.log(LogStatus.FAIL, "Featured Institution is Not Available in Country Landing Page");
    	}
    }
    
    
    public void VerifyArticleSection()
    {
    	if(driver.findElement(ArticleSection).isDisplayed())
    	{
    		cm.logger.log(LogStatus.PASS, "Article Section Available in Country Landing Page");
    	}
    	else
    	{
    		cm.logger.log(LogStatus.FAIL, "Article Section is Not Available in Country Landing Page");
    	}
    }
    
    public void VerifyBanner()
    {
    	 int size = driver.findElements(By.tagName("iframe")).size();
         if(size>1)
         {
          cm.logger.log(LogStatus.PASS, "Banners available in Region Landing Page");
         }
         else
         {
          cm.logger.log(LogStatus.FAIL, "Banners Not available in Region Landing Page");
         }
    }
}

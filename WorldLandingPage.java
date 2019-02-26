package com.hc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.hc.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class WorldLandingPage {
	
	WebDriver driver;
	
    Commanmethod cm = new Commanmethod();
	By MoreInfoButton = By.xpath("//*[@id='ire']/div[2]/div");
    
	public WorldLandingPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void verifyButton()
	{
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		  jse1.executeScript("window.scrollBy(0,1000)", "");
		if(driver.findElement(MoreInfoButton).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..MoreInfoButton Presence in WorldLandingPage");
			  
		}
	}
	
	
	public void verifyWorldtoRegion()
	{   
		WebElement element = driver.findElement(MoreInfoButton);
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		
		
		
	}
}

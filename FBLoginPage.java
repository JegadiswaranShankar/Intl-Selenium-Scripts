package com.hc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.hc.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class FBLoginPage {

WebDriver driver;

Commanmethod cm = new Commanmethod();
	
    By fbbutton = By.xpath("//*[@id='facebookloginbutton']");
	By fbusername = By.xpath("//*[@id='email']");
	By fbpwd = By.xpath("//*[@id='pass']");
    By fblogbtn = By.xpath(".//*[@id='loginbutton']");
  
    
    public FBLoginPage(WebDriver driver)
    {
    	this.driver=driver;
    }
    
    public void clickFBbutton()
    {
    	if(driver.findElement(fbbutton).isEnabled())
    	{
    		cm.logger.log(LogStatus.PASS,"Verified..FB Login button is enabled!!");
    		driver.findElement(fbbutton).click();
    	}
    	else
    	{
    		cm.logger.log(LogStatus.FAIL,"Verified..FB Login button is not enabled!!");
    	}
    	
    	
    }
    
    public void typeUserName(String uid)
    {
    	if(driver.findElement(fbusername).isEnabled())
    	{
    	driver.findElement(fbusername).sendKeys(uid);
    	cm.logger.log(LogStatus.PASS,"Verified..FB username field is enabled");
    	}
    	else
    	{
    	cm.logger.log(LogStatus.FAIL,"Verified..FB username field is not enabled");
    	}
    }
    
    public void typePassword(String pwd1)
    {
    	if(driver.findElement(fbpwd).isEnabled())
    	{
    	driver.findElement(fbpwd).sendKeys(pwd1);
    	cm.logger.log(LogStatus.PASS,"Verified..FB password field is enabled");
    	}
    	else
    	{
    	cm.logger.log(LogStatus.FAIL,"Verified..FB password field is not enabled");
    	}
    	
    	
    }
    
    
    public void clickonloginbutton()
    {
    	if(driver.findElement(fblogbtn).isEnabled())
    	{
    	driver.findElement(fblogbtn).click();
    	cm.logger.log(LogStatus.PASS,"Verified..FB login button enabled");
    	}
    	else
    	{
    	cm.logger.log(LogStatus.FAIL,"Verified..FB login button not enabled");
    	}
    }
    
   public void verifypagetitle()
   {
    String actualTitle = driver.getTitle();
    String expectedTitle = "Study Abroad Consultants for Indian Students - Hotcourses India";
   	Assert.assertEquals(expectedTitle,actualTitle);
   	cm.logger.log(LogStatus.PASS,"Verified..Expected and Actual page names are same");
   	
   }
      
   

}

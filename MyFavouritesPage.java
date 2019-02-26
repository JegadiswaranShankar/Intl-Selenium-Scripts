package com.hc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.hc.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class MyFavouritesPage {
	
	WebDriver driver;
	Commanmethod cm = new Commanmethod();
	By topnavlogicn = By.xpath("//*[@id='topNavlogIcn']");  
	By Myfavlink = By.xpath("//*[@id='shrtLstClgId']/a");
	By coursestab = By.xpath("//div[@id='courseHead']");
	By univtab = By.xpath("//div[@id='collegeHead']");
	By non_logd_pod = By.xpath("//div[@class='non_logd']");
	By non_logd_pod_txt = By.xpath("//*[@id='middle_cnt']/div/div[1]/h2");
	By non_logd_pod_log_btn = By.xpath("//a[@class='org_btn']");
	By non_logd_pod_lnk = By.xpath("//a[@class='bld']");
	By shrtlistclgcnt = By.xpath("//span[@id='shrtLstClgCnt']");
	
	
	
	public MyFavouritesPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickTopNavIcn() throws InterruptedException
	{
		driver.findElement(topnavlogicn).click();
	}
	
	public void clickMyFavLink()
	{
		driver.findElement(Myfavlink).click();
	}
	
	public void verifyshrtlistclgcnt()
	{
		int count = Integer.parseInt(driver.findElement(shrtlistclgcnt).getText());
		if(count==1)
		{
			cm.logger.log(LogStatus.PASS, "Verified..Count incremented to 1");
			System.out.println("Verified..Count incremented to 1");
		}
	}
	
	public void non_logd_pod()
	{
		if(driver.findElement(non_logd_pod).isDisplayed()  )
		{
			cm.logger.log(LogStatus.PASS,"Verified..To save/view your comparison Pod presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..To save/view your comparison Pod Not presence");
		}
		
		if(driver.findElement(non_logd_pod_txt).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..To save/view your comparison Text presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..To save/view your comparison Text Not presence");
		}
		
		if(driver.findElement(non_logd_pod_log_btn).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Loggin button  presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Loggin button Not presence");
		}
		
		if(driver.findElement(non_logd_pod_lnk).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Don't have an account yet? link presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Don't have an account yet? link Not presence");
		}
	}
	
}

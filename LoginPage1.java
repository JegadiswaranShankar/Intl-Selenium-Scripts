package com.hc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.hc.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPage1 {
	
	WebDriver driver;
	Commanmethod cm = new Commanmethod();
	By emailid = By.id("emailadd");
	By yespwdradiobutton = By.id("passwordyes");
	By pwdno = By.id("passwordno");
	By pwd = By.id("regpassword");
	By remember = By.id("remember");
	By forgetpwd =  By.id("forgt");
	By loginbutton = By.id("loginbtn");
	By fbloginbutton = By.id("facebookloginbutton");
	
	
	public LoginPage1(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void verifyemailid()
	{
		if(driver.findElement(emailid).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Email id field presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Email id field Not presence");

		}
	}
	
	
	public void verifyyespwdradiobtn()
	{
		if(driver.findElement(yespwdradiobutton).isEnabled())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Yes, I have a password radio button enabled");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Yes, I have a password radio button Not enabled");
		}
	}
	
	public void verifypwdno()
	{
		if(driver.findElement(pwdno).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..No, I've not registered before radio button displayed");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..No, I've not registered before radio button Not displayed");
		}
	}
	
	public void verifypwd()
	{
		if(driver.findElement(pwd).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Password field presenece");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Password field Not presenece");
		}
	}
	public void verifyrememberme()
	{
		if(driver.findElement(remember).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Remember me field presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Remember me field Not presence");
		}
	}
	
	public void verifyforgetpwd()
	{
		if(driver.findElement(forgetpwd).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Forgotten your password? link presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Forgotten your password? link Not presence");
		}
	}
	
	public void verifyloginbutton()
	{
		if(driver.findElement(loginbutton).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Login button field presenece");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Login button field Not presenece");
		}
	}
	
	public void verifyfblogin()
	{
		if(driver.findElement(fbloginbutton).isDisplayed())
		{
		
			cm.logger.log(LogStatus.PASS,"Verified..FB Loginbutton presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..FB Loginbutton Not presence");
		}
	}
	
		
	}



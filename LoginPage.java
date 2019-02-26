/**
 * 
 */
package com.hc.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.hc.functionlibrary.Commanmethod;
import com.hc.testdata.DataDrivenUsingExcel;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author Jegadiswaran.S
 *
 */
public class LoginPage {
	
	//System.setProperty("webdriver.http.factory", "apache");
	WebDriver driver;
	Commanmethod cm = new Commanmethod();
	String currentURL = cm.driver.getCurrentUrl();
	    
    @FindBy(xpath="html/body/div[1]/div/div/div[1]/div[2]/form[1]/fieldset[1]/span/div/input")
    public static WebElement username;
    
    @FindBy(xpath="//*[@id='regpassword']")
    public static WebElement pwd;
    
    @FindBy(xpath="//*[@id='loginbtn']")
    public static WebElement logbtn;
    
    @FindBy(xpath="//*[@id='topNavlogIcn']")
    public static WebElement topNavLogIcn;
    
    @FindBy(xpath="//A[@href='/study/user/profile.html']")
    public static WebElement topNavMyDetails;
    
    @FindBy(xpath="//A[@id='logOutLnkId']")
    public static WebElement logout;
    
    @FindBy(xpath="//*[@id='userProfileForm']/div[1]/div/div[1]/div[2]/div/span/a")
    public static WebElement Upload;
    
    @FindBy(xpath="//*[@id='browseFile']")
    public static WebElement browse;
    
    @FindBy(xpath="//*[@id='uploadImageDiv']/div/div/input")
    public static WebElement save;
    
   
    
    
    public LoginPage(WebDriver driver)
    {
    	this.driver=driver;
    }
    
    public void typeUserName(String uid)
    {
    	cm.logger=cm.report.startTest("Login Verification", "Verify Login functionality with valid credentials");
    	username.sendKeys(uid);
    	cm.logger.log(LogStatus.PASS,"Verified..Username entered Successfully!!");
    }
    
    public void typePassword(String pwd1)
    {
    	
    	pwd.sendKeys(pwd1);
    	cm.logger.log(LogStatus.INFO,"Verified..Password entered Successfully!!");
    }
  
    public void clickonloginbutton() throws InterruptedException, IOException
    {
    	logbtn.click();
    	
     	cm.logger.log(LogStatus.PASS,"Verified..Login working fine with valid credentials!!");
     	if(currentURL!= cm.getProperty("url") )
		{
			cm.driver.get("https://mtest.hotcoursesabroad.com/?nr=true");
		}
  	
    }
    
    public void clicktopNavLogIcn() throws InterruptedException
    {
    	Thread.sleep(3000);
    	topNavLogIcn.click();
    	//cm.extendScreenshot();
    	cm.logger.log(LogStatus.PASS,"Verified..Top nav login icon clicked Successfully!!");
    }
    
    public void navMyDetails()
    {
    	
    	topNavMyDetails.click();
    	//cm.extendScreenshot();
    	cm.logger.log(LogStatus.PASS,"Verified..My details clicked Successfully!!");
    }
    
    
    public void uploadpic() throws AWTException, InterruptedException
    {
    	Upload.click();
    	browse.click();
    	StringSelection ss = new StringSelection("D:\\pic");
    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    	
    	
    	//native key strokes for CTRL, V and ENTER keys
    	Robot robot = new Robot();

    	robot.keyPress(KeyEvent.VK_CONTROL);
    	robot.keyPress(KeyEvent.VK_V);
    	robot.keyRelease(KeyEvent.VK_V);
    	robot.keyRelease(KeyEvent.VK_CONTROL);
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	
    	
    }
    
    public void clicksave()
    {
    	save.click();
    }
    
    public void clicklogout() throws IOException
    {
    	
    	logout.click();
    	cm.logger.log(LogStatus.PASS,"Verified..User logout successfully!!");
    }
    
   
    
}

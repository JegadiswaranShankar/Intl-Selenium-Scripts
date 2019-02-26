package com.hc.testcases;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hc.functionlibrary.Commanmethod;
import com.hc.pages.FBLoginPage;
import com.hc.pages.LoginPage;
import com.hc.testdata.DataDrivenUsingExcel;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyFBLogin {
	@BeforeTest
	public void initializeReport() {
		   
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/hc/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		   //Adding system info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", "CHROME");
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Intl");
		   
		  }

	@Test
	public void verifyFBLogin() throws IOException, InterruptedException
	{
		Commanmethod.logger=Commanmethod.report.startTest("Enquiry Test", "Test");
		Commanmethod cm = new Commanmethod();
		cm.logger.log(LogStatus.INFO,"Test case started");
		
		String user = cm.getProperty("fb_id");
		String pass = cm.getProperty("fb_pwd");
		String fbUserid = user.toString();
		String fbUserpwd = pass.toString();
		//p1.login(user, pass);
		Thread.sleep(5000);
		//CommonFunctions.captureScreenshot("testSuccessfulLogin_pass");

		String a1 ="D:\\Programs\\Datadriven\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", a1);
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.get("https://mtest.hotcoursesabroad.com/study/loginhome.html");
	    
	    FBLoginPage login = new FBLoginPage(driver);
	    login.clickFBbutton();
	    login.typeUserName(fbUserid);
	    login.typePassword(fbUserpwd);
	    login.clickonloginbutton();
	    login.verifypagetitle();
	    cm.logger.log(LogStatus.INFO,"Test case Ended");
	    //JOptionPane.showMessageDialog(null, "FB login verification succeed!!");
	    driver.quit();
	}
	
	@AfterTest
	public void closeReport()
	 {
		Commanmethod.report.endTest(Commanmethod.logger);
		Commanmethod.report.flush();
	  
	 }

}

package com.hc.testcases;

import java.io.File;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hc.functionlibrary.Commanmethod;
import com.hc.pages.LoginPage1;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyLoginPage {
	
	@BeforeTest
	public void initializeReport() {
		   
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/hc/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		   //Adding system info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", "CHROME");
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Intl");
		   
		  }
	@Test
	public void verifyLoginPage()
	{
		
		Commanmethod.logger=Commanmethod.report.startTest("LoginPage Test", "Test");
		Commanmethod cm = new Commanmethod();
		cm.logger.log(LogStatus.INFO,"Test case started");
        String a1 ="D:\\Programs\\Datadriven\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", a1);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mtest.hotcoursesabroad.com/study/loginhome.html?nr=true");
		
		LoginPage1 login1 = new LoginPage1(driver);
		login1.verifyfblogin();
		login1.verifyemailid();
		login1.verifyyespwdradiobtn();
		login1.verifypwdno();
		login1.verifypwd();
		login1.verifyrememberme();
		login1.verifyforgetpwd();
	    login1.verifyforgetpwd();
	    cm.logger.log(LogStatus.INFO,"Testcase Ended");
	    cm.logger.log(LogStatus.PASS,"Testcase Passed");
	    //JOptionPane.showMessageDialog(null, "Login page verification succeed!!");
	    driver.quit();
		
	}
	
	@AfterTest
	public void closeReport()
	 {
		Commanmethod.report.endTest(Commanmethod.logger);
		Commanmethod.report.flush();
	  
	 }

}

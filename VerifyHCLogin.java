package com.hc.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hc.functionlibrary.Commanmethod;
import com.hc.pages.LoginPage;
import com.hc.pages.MyDetailsPage;
import com.hc.testdata.DataDrivenUsingExcel;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyHCLogin {
	@BeforeTest
	public void initializeReport() throws IOException {
		   
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/hc/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		   //Adding system info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", "CHROME");
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Intl");
		
		   
		  }
	@Test
	public void verifyValidLogin() throws IOException, InterruptedException
	{
		Commanmethod.logger=Commanmethod.report.startTest("Login Verification Test", "Test");
		Commanmethod cm = new Commanmethod();
		Commanmethod.logger.log(LogStatus.INFO,"Test case started");
				
		String userid = cm.getProperty("Email");
		String pass = cm.getProperty("Pwd");
		String loginuserid = userid.toString();
		String loginpwd = pass.toString();
		
		Thread.sleep(5000);
		

		String a1 ="D:\\Programs\\Datadriven\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", a1);
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.get("https://mtest.hotcoursesabroad.com/study/loginhome.html?nr=true");
	    
	    LoginPage login = new LoginPage(driver);
	    login.typeUserName(loginuserid);
	    
	    login.typePassword(loginpwd);
	    Thread.sleep(1000);
	    login.clickonloginbutton();
	    
        Thread.sleep(3000);
       
	    
        String URL = driver.getCurrentUrl();

       if(URL != "https://mtest.hotcoursesabroad.com/")
	   {
		  
		   driver.get("https://mtest.hotcoursesabroad.com/?nr=true");
		   LoginPage login1 = new LoginPage(driver);
			
		   login1.clicktopNavLogIcn();
		   login1.navMyDetails();
		   
		  
		   
	   }
	  
       
	}
	
	@AfterTest
	public void closeReport()
	 {
		Commanmethod.report.endTest(Commanmethod.logger);
		Commanmethod.report.flush();
	  
	 }
	
}

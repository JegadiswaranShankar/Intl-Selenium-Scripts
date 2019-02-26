package com.hc.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hc.functionlibrary.Commanmethod;
import com.hc.pages.LoginPage;
import com.hc.pages.MyDetailsPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyMyDetailsPage {
	
	@BeforeTest
	public void initializeReport() {
		   
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/hc/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		   //Adding system info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", "CHROME");
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Intl");
		   
		  }
	
	@Test
	public void verifyMyDetailsPage() throws IOException, InterruptedException
	{
		
		Commanmethod.logger=Commanmethod.report.startTest("My Details Page Verification Test", "Test");
		Commanmethod cm = new Commanmethod();
		cm.logger.log(LogStatus.INFO,"Test case started");
		
		File file = new File("D:\\Programs\\Intl\\dataFile.properties");
		FileInputStream fileInput = null;

		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		String userid = prop.getProperty("Email");
		String pass = prop.getProperty("Pwd");
		//String userpwd = pass.toString();
		//p1.login(user, pass);
		Thread.sleep(5000);
        String a1 ="D:\\Programs\\Datadriven\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", a1);
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://mtest.hotcoursesabroad.com/study/loginhome.html?nr=true");
	    LoginPage login = new LoginPage(driver);
	    login.typeUserName(userid);
	    //System.out.println(pass);
	    login.typePassword(pass);
	    Thread.sleep(1000);
	    login.clickonloginbutton();
	    
        Thread.sleep(3000);
        //login.clicktopNavLogIcn();
	    
        String URL = driver.getCurrentUrl();
 // Assert.assertEquals(URL, "https://mtest.hotcoursesabroad.com/");
       if(URL != "https://mtest.hotcoursesabroad.com/")
	   {
		  
		   driver.get("https://mtest.hotcoursesabroad.com/?nr=true");
		   LoginPage login1 = new LoginPage(driver);
			
		   login1.clicktopNavLogIcn();
		   login1.navMyDetails();
		
		MyDetailsPage mp = new MyDetailsPage(driver);
		mp.clickChangePwd();
	   }
		
	}
	
	
	@AfterTest
	public void closeReport()
	 {
		Commanmethod.report.endTest(Commanmethod.logger);
		Commanmethod.report.flush();
	  
	 }

}

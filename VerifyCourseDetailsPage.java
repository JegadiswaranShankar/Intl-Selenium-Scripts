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
import com.hc.pages.CourseDetailsPage;
import com.hc.pages.LoginPage;
import com.hc.pages.ProviderResultsPage;
import com.hc.testdata.DataDrivenUsingExcel;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyCourseDetailsPage {
	
	@BeforeTest
	public void initializeReport() {
		   
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/hc/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		   //Adding system info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", "CHROME");
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Intl");
		   
		  }
	
		
		@Test
		public void verifyCDpage() throws Exception
		{
			
			Commanmethod.logger=Commanmethod.report.startTest("CD Page Test", "Test");
			Commanmethod cm = new Commanmethod();
			cm.logger.log(LogStatus.INFO,"Test case started");
		
			//String user = DataDrivenUsingExcel.getData("Sheet1", 1, 0);
			//String pass = DataDrivenUsingExcel.getData("Sheet1", 1, 1);
			//String pass = "123456";
			
			
			//String userid = user.toString();
			//String userpwd = pass.toString();
			//p1.login(user, pass);
			//Thread.sleep(5000);
		String url = "https://mtest.hotcoursesabroad.com/study/course/uk/information-technology-bsc-hons/54930944/program.html?nationCode=87&nationCntryCode=87&nr=true";
		String a1 ="D:\\Programs\\Datadriven\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", a1);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to(url);

		CourseDetailsPage probj = new CourseDetailsPage(driver);
		LoginPage lp = new LoginPage(driver);
		probj.verifyFavLinkCD();
        probj.verifyShortListLinkCD();
//		probj.clickTopNavLogIcn();
//		lp.typeUserName(userid);
//		lp.typePassword(pass);
//		Thread.sleep(1000);
//		lp.clickonloginbutton();
//        cm.logger.log(LogStatus.PASS,"Test case passed");
//        cm.logger.log(LogStatus.INFO,"Test case ended");
		//JOptionPane.showMessageDialog(null, "Course details page verification succeed!!");
		driver.quit();
		
		}
		
		@AfterTest
		public void closeReport()
		 {
			Commanmethod.report.endTest(Commanmethod.logger);
			Commanmethod.report.flush();
		  
		 }

}

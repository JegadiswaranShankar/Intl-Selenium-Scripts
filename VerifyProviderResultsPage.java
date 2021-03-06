package com.hc.testcases;

import java.io.File;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hc.functionlibrary.Commanmethod;
import com.hc.pages.ProviderResultsPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyProviderResultsPage {
	@BeforeTest
	public void initializeReport() {
		   
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/hc/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		   //Adding system info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", "CHROME");
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Intl");
		   
		  }
	@Test
	public void verifyPRpage() throws InterruptedException
	{
		
		Commanmethod.logger=Commanmethod.report.startTest("Provider Results Test", "Test");
		Commanmethod cm = new Commanmethod();
		cm.logger.log(LogStatus.INFO,"Test case started");
	
	String url = "https://mtest.hotcoursesabroad.com/study/provider-result.html?collegeId=1040&catCode=E2-3&nationCode=87&nationCntryCode=87&countryId=210&nr=true";
	String a1 ="D:\\Programs\\Datadriven\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", a1);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to(url);

	ProviderResultsPage probj = new ProviderResultsPage(driver);
	probj.verifyFavLinkPR();
	probj.verifyShortListLinkPR();
	probj.verifyAddtoFavPod();
	//probj.verifyViewMyFavlink();
	//probj.verifyContactUnivBtn();
	probj.verifyMyFavBtn();
	probj.verifyPagetitle();
	probj.verifyUniversityName();
	//JOptionPane.showMessageDialog(null, "Provider results page verification succeed!!");
	cm.logger.log(LogStatus.INFO,"Test case ended");
	driver.quit();
	
	}
	
	@AfterTest
	public void closeReport()
	 {
		Commanmethod.report.endTest(Commanmethod.logger);
		Commanmethod.report.flush();
	  
	 }
	

}

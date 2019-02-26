package com.hc.testcases;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hc.functionlibrary.Commanmethod;
import com.hc.pages.CountryLandingPage;
import com.hc.pages.HomePage;
import com.hc.pages.RegionLandingPage;
import com.hc.pages.WorldLandingPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyWorldLandingPage {
	
	@BeforeTest
	public void initializeReport() {
		   
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/hc/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		   //Adding system info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", "CHROME");
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Intl");
		 }
	
	@Test
	public void VerifyWorldLandingPage() throws InterruptedException
	{
		
		Commanmethod.logger=Commanmethod.report.startTest("WorldLandingPage Test", "Test");
		Commanmethod cm = new Commanmethod();
		cm.logger.log(LogStatus.INFO,"Test case started");
				
        String a1 ="D:\\Programs\\Datadriven\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", a1);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mtest.hotcoursesabroad.com/?nr=true");
		HomePage hobj2 = new HomePage(driver);
		WorldLandingPage wobj1 = new WorldLandingPage(driver);
		
		hobj2.hometoworld();
		wobj1.verifyButton();
		wobj1.verifyWorldtoRegion();
		RegionLandingPage rpobj = new RegionLandingPage(driver);
		rpobj.verifyRegionHeader();
		rpobj.verifySearchpod();
		rpobj.verifyCountryPod1();
		rpobj.verifyCountryPod2();
		rpobj.verifyBanner();
		rpobj.regiontoCountry();
		
		CountryLandingPage cobj = new CountryLandingPage(driver);
		cobj.verifyCountryHeader();
		cobj.VerifySearchPod();
		cobj.VerifyEbookButton();
		cobj.VerifyFeaturedInstitution();
		cobj.VerifyArticleSection();
		cobj.VerifyBanner();
	}

	
	@AfterTest
	public void closeReport()
	 {
		Commanmethod.report.endTest(Commanmethod.logger);
		Commanmethod.report.flush();
	  
	 }


}

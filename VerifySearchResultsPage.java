package com.hc.testcases;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hc.functionlibrary.Commanmethod;
import com.hc.pages.HomePage;
import com.hc.pages.MyFavouritesPage;
import com.hc.pages.ProviderResultsPage;
import com.hc.pages.SearchResultsPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifySearchResultsPage {
	
	@BeforeTest
	public void initializeReport() {
		   
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/hc/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		   //Adding system info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", "CHROME");
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Intl");
		   
		  }
	
	@Test
	public void verifySRpage() throws InterruptedException
	{
		
		Commanmethod.logger=Commanmethod.report.startTest("Search Results Test", "Test");
		Commanmethod cm = new Commanmethod();
		cm.logger.log(LogStatus.INFO,"Test case started");
		String a1 ="D:\\Programs\\Datadriven\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", a1);
		WebDriver driver = new ChromeDriver();
		driver.get("https://mtest.hotcoursesabroad.com?nr=true");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		HomePage hobj = new HomePage(driver);
		hobj.hometoSR();
		SearchResultsPage probj = new SearchResultsPage(driver);
		probj.verifyFavLinkSR();
		probj.verifyShortListLinkSR();
		Thread.sleep(1000);
		MyFavouritesPage myfavobj = new MyFavouritesPage(driver);
		myfavobj.clickTopNavIcn();
		myfavobj.verifyshrtlistclgcnt();
		myfavobj.clickMyFavLink();
		myfavobj.non_logd_pod();
		cm.logger.log(LogStatus.INFO,"Test case ended");
		

}
	
	@AfterTest
	public void closeReport()
	 {
		Commanmethod.report.endTest(Commanmethod.logger);
		Commanmethod.report.flush();
	  
	 }
}

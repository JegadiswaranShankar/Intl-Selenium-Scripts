package com.hc.testcases;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hc.functionlibrary.Commanmethod;
import com.hc.pages.LevelProfilePage;
import com.hc.pages.SubjectProfilePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyLevelProfilePage {
	
	@BeforeTest
	public void initializeReport() {
		   
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/hc/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		   //Adding system info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", "CHROME");
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Intl");
		   
		  }
	
	@Test
	public void verifySPpage() throws InterruptedException
	{
		Commanmethod.logger=Commanmethod.report.startTest("Level Profile Test", "Test");
		Commanmethod cm = new Commanmethod();
		cm.logger.log(LogStatus.INFO,"Test case started");
	
	String url = "https://mtest.hotcoursesabroad.com/study/profile/canada/undergraduate-school/overview/413978/61525/level.html";
	String a1 ="D:\\Programs\\Datadriven\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", a1);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to(url);

	LevelProfilePage lpobj = new LevelProfilePage(driver);
	lpobj.verifyFavLinkLP();
	lpobj.verifyLogo();
	lpobj.verifyBreadCrumb();
	lpobj.verifyInstName();
	lpobj.verifyCountryFlag();
	lpobj.verifyCountryName();
	//lpobj.verifyRating();
	//lpobj.verifyReviews();
	lpobj.verifyvieweye();
	lpobj.verifyNumberofViews();
	lpobj.verifyTHERanking();
	lpobj.verifyvisitWebsiteButton();
	lpobj.verifyDP();
	lpobj.verifyCU();
	//lpobj.verifytheStuTab();
	lpobj.verifyproVideo();
	//lpobj.verifytheUniTab();


	lpobj.verifyProSec1();
	lpobj.verifyProSec2();
	lpobj.verifyProSec3();
	lpobj.verifyProSec4();
	lpobj.verifyproSec5();
	lpobj.verifyproImg();
	  
	lpobj.verifyproMap();   
	lpobj.verifyengscrReq();
	//lpobj.verifyieltslogo();
	lpobj.verifyrankings();
	lpobj.verifystudentlife();
	//lpobj.verifystdreviews();
	//lpobj.verifyreviewbtn();
	lpobj.verifycoursesearchpod();
	lpobj.verifycoursesection();
	
	lpobj.verifyscholarshipsection();
	
	
	//JOptionPane.showMessageDialog(null, "Subject profile page verification succeed!!");
	driver.quit();
	
	}
	
	@AfterTest
	public void closeReport()
	 {
		Commanmethod.report.endTest(Commanmethod.logger);
		Commanmethod.report.flush();
	  
	 }

}

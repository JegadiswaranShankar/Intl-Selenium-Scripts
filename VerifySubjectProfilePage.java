package com.hc.testcases;

import java.io.File;

import javax.swing.JOptionPane;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hc.functionlibrary.Commanmethod;
import com.hc.pages.InstitutionProfilePage;
import com.hc.pages.SubjectProfilePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifySubjectProfilePage {
	
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
		Commanmethod.logger=Commanmethod.report.startTest("Subject Profile Test", "Test");
		Commanmethod cm = new Commanmethod();
		cm.logger.log(LogStatus.INFO,"Test case started");
	
	String url = "https://mtest.hotcoursesabroad.com/study/profile/australia/la-trobe-university/ict/overview/72220/64603/info.html";
	
	String a1 ="D:\\Programs\\Datadriven\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", a1);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to(url);

	SubjectProfilePage spobj = new SubjectProfilePage(driver);
	spobj.verifyFavLinkSP();
	spobj.verifyLogo();
	spobj.verifyBreadCrumb();
	spobj.verifyInstName();
	spobj.verifyCountryFlag();
	spobj.verifyCountryName();
	spobj.verifyRating();
	spobj.verifyReviews();
	spobj.verifyvieweye();
	spobj.verifyNumberofViews();
	spobj.verifyTHERanking();
	spobj.verifyvisitWebsiteButton();
	//spobj.verifyDP();
	spobj.verifyCU();
	//spobj.verifytheStuTab();
	spobj.verifyproImg();
	//spobj.verifyproVideo();  
	//spobj.verifytheUniTab();


//	spobj.verifyProSec1();
//	spobj.verifyProSec2();
//	spobj.verifyProSec3();
//	spobj.verifyProSec4();
//	spobj.verifyproSec5();
	

	spobj.verifyproMap();   
	spobj.verifyengscrReq();
	//spobj.verifyieltslogo();
	spobj.verifyrankings();
	spobj.verifystudentlife();
	spobj.verifystdreviews();
	spobj.verifyreviewbtn();
	spobj.verifycoursesearchpod();
	spobj.verifycoursesection();
	//spobj.verifyscholarshipsection();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,3500)","");
	spobj.verifyenqform();
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

package com.hc.testcases;

import java.io.File;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hc.functionlibrary.Commanmethod;
import com.hc.pages.InstitutionProfilePage;
import com.hc.pages.ProviderResultsPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyInstitutionProfilePage {
	
	@BeforeTest
	public void initializeReport() {
		   
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/hc/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		   //Adding system info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", "CHROME");
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Intl");
		   
		  }
	@Test
	public void verifyIPpage() throws InterruptedException
	{
		
		Commanmethod.logger=Commanmethod.report.startTest("IP Profile Test", "Test");
		Commanmethod cm = new Commanmethod();
		cm.logger.log(LogStatus.INFO,"Test case started");
	
	String url = "https://mtest.hotcoursesabroad.com/study/australia/school-college-university/university-of-south-australia/72237/international.html?frm=topnav&nr=true";
	String a1 ="D:\\Programs\\Datadriven\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", a1);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to(url);

	InstitutionProfilePage ipobj = new InstitutionProfilePage(driver);
	ipobj.verifyFavLinkIP();

ipobj.verifyLogo();
ipobj.verifyBreadCrumb();
ipobj.verifyInstName();
ipobj.verifyCountryFlag();
ipobj.verifyCountryName();
ipobj.verifyRating();
//ipobj.verifyReviews();
ipobj.verifyvieweye();
ipobj.verifyNumberofViews();
ipobj.verifyTHERanking();
ipobj.verifyvisitWebsiteButton();
ipobj.verifyDP();
ipobj.verifyCU();
ipobj.verifytheStuTab();
ipobj.verifyproVideo();
ipobj.verifytheUniTab();


ipobj.verifyProSec1();
ipobj.verifyProSec2();
ipobj.verifyProSec3();
ipobj.verifylocation();
ipobj.verifyproSec5();
ipobj.verifyproImg();

ipobj.verifyproMap();
ipobj.verifyengscrReq();
//ipobj.verifyieltslogo();
ipobj.verifyrankings();
ipobj.verifystudentlife();
ipobj.verifystdreviews();
ipobj.verifyreviewbtn();
ipobj.verifycoursesearchpod();
ipobj.verifycoursesection();
ipobj.verifyscholarshipsection();
	//ipobj.verifyReviews();
	cm.logger.log(LogStatus.INFO,"Test case ended");
	cm.logger.log(LogStatus.PASS,"Test case passed");
	//JOptionPane.showMessageDialog(null, "Institution profile page verification succeed!!");
	driver.quit();
	
	}
	
	@AfterTest
	public void closeReport()
	 {
		Commanmethod.report.endTest(Commanmethod.logger);
		Commanmethod.report.flush();
	  
	 }

}

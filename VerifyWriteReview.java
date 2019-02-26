package com.hc.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

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
import com.hc.pages.WriteReviewPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyWriteReview {
	
	@BeforeTest
	public void initializeReport() {
		   
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/hc/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		   //Adding system info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", "CHROME");
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Intl");
		 }

	@Test
	public void VerifyWriteReviewPage() throws InterruptedException
	{
		
		Commanmethod.logger=Commanmethod.report.startTest("Write Review Page Test", "Test");
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
				
        String a1 ="D:\\Programs\\Datadriven\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", a1);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mtest.hotcoursesabroad.com/study/australia/school-college-university/university-of-new-south-wales-unsw/72233/international.html?nr=true");
		
		WriteReviewPage wr = new WriteReviewPage(driver);
		wr.clickReviewBtn();
		wr.clickRatings();
		wr.EnterReviewTitle(prop.getProperty("ReviewTitle"));
		wr.EnterReviewExp(prop.getProperty("ReviewEXP"));
		wr.SelectStudyLevel();
		wr.EnterReviewSubject(prop.getProperty("ReviewSubject"));
		wr.EnterCourseName(prop.getProperty("ReviewCourseName"));
		wr.SelectGradYear();
		wr.ClickRecBtn();
		
		wr.EnterFirstName(prop.getProperty("Firstname"));
		wr.EnterLastName(prop.getProperty("Lastname"));
		wr.SelectCountry();
		wr.EnterEmail(prop.getProperty("Review_Email"));
		wr.EnterDOB(prop.getProperty("Day"),prop.getProperty("Month"),prop.getProperty("Year"));
		wr.CreatePwd();
		wr.enterPwd(prop.getProperty("ReviewPwd"));
		wr.clickSubmitBtn();
		
	}


	@AfterTest
	public void closeReport()
	 {
		Commanmethod.report.endTest(Commanmethod.logger);
		Commanmethod.report.flush();
	  
	 }
	
}

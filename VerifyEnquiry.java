package com.hc.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hc.functionlibrary.Commanmethod;
import com.hc.pages.EnquiryPage;
import com.hc.pages.ProviderResultsPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyEnquiry {
	
	@BeforeTest
	public void initializeReport() {
		   
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/hc/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		   //Adding system info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", "CHROME");
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Intl");
		   
		  }
	
	@Test
	public void verifyEnquiry() throws Exception
	{
		
		Commanmethod.logger=Commanmethod.report.startTest("Enquiry Test", "Test");
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
		driver.get("https://mtest.hotcoursesabroad.com/study/provider-result.html?collegeId=1040&catCode=E2-3&nationCode=87&nationCntryCode=87&countryId=210&nr=true");
		
		
		ProviderResultsPage probj = new ProviderResultsPage(driver);
		probj.verifyContactUnivBtn();
		EnquiryPage ep = new EnquiryPage();
		driver.findElement(ep.fstname).sendKeys(prop.getProperty("Firstname"));
		driver.findElement(ep.lstname).sendKeys(prop.getProperty("Lastname"));
		driver.findElement(ep.emailid).sendKeys(prop.getProperty("Email"));
		driver.findElement(ep.emailid).sendKeys(Keys.ENTER);
		driver.findElement(ep.citizenyes).click();
		driver.findElement(ep.Phonetype).click();
		driver.findElement(ep.Phonetype).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(ep.Phonetype).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(ep.Phonetype).sendKeys(Keys.ENTER);
		driver.findElement(ep.Phonenumber).sendKeys(prop.getProperty("EnqPhno"));
//		Select drpphonetype = new Select(driver.findElement(By.xpath("Phonetype")));
//		drpphonetype.selectByVisibleText("Mobile");
//		driver.findElement(ep.date).sendKeys(prop.getProperty("Day"));
//		driver.findElement(ep.month).sendKeys(prop.getProperty("Month"));
//		driver.findElement(ep.year).sendKeys(prop.getProperty("Year"));
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,450)", "");
		
		
		WebElement selectstdylevel = driver.findElement(ep.stylvl);
		selectstdylevel.click();
		

		Thread.sleep(8000);
        WebElement selectPG  = driver.findElement(ep.stdylvlPG); 
        selectPG.click();
       
        
        Thread.sleep(2000);
        WebElement selectsubject = driver.findElement(ep.subject);
        selectsubject.click();
       
        
        
        WebElement selectEnggSubject = driver.findElement(ep.enggsubject);
        selectEnggSubject.click();
       
        
        driver.findElement(ep.stdyyear).click();
        JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,250)", "");
        
        //driver.findElement(ep.pwdyes).click();
        WebElement pwdfield = driver.findElement(ep.pwdtxtarea);
       // pwdfield.click();
        pwdfield.sendKeys(prop.getProperty("Pwd"));
        
//        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
//		jse2.executeScript("window.scrollBy(0,450)", "");
       // driver.findElement(ep.proceedbut).click();
       
        
        String postenqpage =  driver.getTitle();
        Assert.assertEquals(postenqpage, "Hotcourses Abroad");
        cm.logger.log(LogStatus.INFO,"Verified..Enquiry done successfully");
        
        cm.logger.log(LogStatus.INFO,"Verified..Application successfully navigated to post enquiry page");
        cm.logger.log(LogStatus.PASS,"Test case passed");
        cm.logger.log(LogStatus.INFO,"Test case ended");
        driver.close();
       
	}
	
	
	@AfterTest
	public void closeReport()
	 {
		Commanmethod.report.endTest(Commanmethod.logger);
		Commanmethod.report.flush();
	  
	 }
	

}



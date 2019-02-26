package com.hc.testcases;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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

public class CopyOfVerifySearchResultsPage {
	
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
		driver.get("https://mtest.hotcoursesabroad.com/study/training-degrees/international/social-studies-and-communications-courses/cgory/l-2/sin/ct/programs.html/?nr=true");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		WebElement gotitbtn = driver.findElement(By.xpath("//*[@id='cookiePopUpId']/div/a[2]"));
		gotitbtn.click();
		WebElement filter = driver.findElement(By.xpath("//*[@id='btnFltr']"));
		filter.click();
		Thread.sleep(1000);
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='nationId']"));
		
		dropdown.click();
		Select selectdrop = new Select(dropdown);
		selectdrop.selectByValue("2");
		
		WebElement scroll = driver.findElement(By.xpath("//*[@id='Default_cont']/div[3]/div[1]"));
		Actions builder = new Actions(driver);

		Action dragAndDrop =

		builder.clickAndHold(scroll).moveByOffset(80,0).release().build();

		dragAndDrop.perform();
		

}
	
	@AfterTest
	public void closeReport()
	 {
		Commanmethod.report.endTest(Commanmethod.logger);
		Commanmethod.report.flush();
	  
	 }
}

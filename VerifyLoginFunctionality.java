//*This case only cover the Login functionality..we are not covering logout case here due to SocketException*//


package com.hc.testcases;

import java.awt.AWTException;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hc.functionlibrary.Commanmethod;
import com.hc.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;



public class VerifyLoginFunctionality {
	
	
	
	Commanmethod cm = new Commanmethod();
	
	@BeforeMethod
	public void openbrow() throws IOException
	{
		Commanmethod.report = new ExtentReports(new File("src/main/java/com/hc/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
		   //Adding system info
		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
		Commanmethod.report.addSystemInfo("BROWSER", "CHROME");
		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Intl");
		cm.openBrowser();
		String currentURL = cm.driver.getCurrentUrl();
		
		if(currentURL!= cm.getProperty("url") )
		{
			cm.driver.get("https://mtest.hotcoursesabroad.com/study/loginhome.html?nr=true");
		}
	}
	
	
	@Test
	public void verifyloginpage() throws IOException, InterruptedException, AWTException
	{
		LoginPage a1 = PageFactory.initElements(Commanmethod.driver,
				LoginPage.class);
		a1.typeUserName(cm.getProperty("Email"));
		a1.typePassword(cm.getProperty("Pwd"));
		
		a1.clickonloginbutton();
		
		
		 Thread.sleep(3000);
	        
		    
	        String URL = cm.driver.getCurrentUrl();
	 
	       if(URL != "https://mtest.hotcoursesabroad.com/")
		   {
			  
			   cm.driver.get("https://mtest.hotcoursesabroad.com/?nr=true");
		
			   a1.clicktopNavLogIcn();
			  // a1.navMyDetails();
			 
			   //a1.uploadpic();
			  // a1.clicksave();
			 //  a1.clicklogout();
	}
	
	


}
	@AfterMethod
	public void closebrow()
	{
	cm.closeApp();
	
	}
}

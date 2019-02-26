package com.hc.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hc.pages.HomePage;
import com.hc.pages.MyFavouritesPage;

public class VerifyMyFavourite {
	
	@Test
	public void verifyMyFavourite() throws IOException, InterruptedException
	{
        
       String a1 ="D:\\Programs\\Datadriven\\chromedriver.exe";
	
       System.setProperty("webdriver.chrome.driver", a1);
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://mtest.hotcoursesabroad.com/?nr=true");
	   
		
		HomePage hobj1 = new HomePage(driver);
		hobj1.hometoSR();
		MyFavouritesPage obj1 = new MyFavouritesPage(driver);
		
		obj1.clickMyFavLink();
		obj1.clickTopNavIcn();
       	//driver.quit();
		
	}

}

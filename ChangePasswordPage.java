package com.hc.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hc.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class ChangePasswordPage {
	
	
	By Existing_pwd = By.xpath("//INPUT[@id='regpassword']");
	By New_pwd = By.xpath("//INPUT[@id='regpassword1']");
	By Confirm_pwd = By.xpath("//INPUT[@id='regpassword2']");
	By Submit_btn = By.xpath("//INPUT[@id='fpwdBtn']");
	
	By username = By.xpath("html/body/div[1]/div/div/div[1]/div[2]/form[1]/fieldset[1]/span/div/input");
	
	    WebDriver driver;
		
	    Commanmethod cm = new Commanmethod();
	    
	    public ChangePasswordPage(WebDriver driver)
		{
			this.driver = driver;
			
		}
	    
	    
	    public void enterpasswords() throws InterruptedException, IOException
	    {
			Commanmethod.logger=Commanmethod.report.startTest("Change Password Verification Test", "Test");
			Commanmethod cm = new Commanmethod();
			Commanmethod.logger.log(LogStatus.INFO,"Test case started");
//			File file = new File("D:\\Programs\\Intl\\dataFile.properties");
//			FileInputStream fileInput = null;
//
//			try {
//				fileInput = new FileInputStream(file);
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			}
//			
//			Properties prop = new Properties();
//			
//			//load properties file
//			try {
//				prop.load(fileInput);
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}
			
			String userid = Commanmethod.getProperty("Email");
			String pass = Commanmethod.getProperty("Pwd");
			//String userpwd = pass.toString();
			//p1.login(user, pass);
			Thread.sleep(5000);
			//CommonFunctions.captureScreenshot("testSuccessfulLogin_pass");

			String a1 ="D:\\Programs\\Datadriven\\chromedriver.exe";
			
			System.setProperty("webdriver.chrome.driver", a1);
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		    driver.get("https://mtest.hotcoursesabroad.com/study/loginhome.html?nr=true");
		    
		    LoginPage login = new LoginPage(driver);
		    login.typeUserName(userid);
		    //System.out.println(pass);
		    login.typePassword(pass);
		    Thread.sleep(1000);
		    login.clickonloginbutton();
		    
	        Thread.sleep(3000);
	        //login.clicktopNavLogIcn();
		    
	        String URL = driver.getCurrentUrl();
	 // Assert.assertEquals(URL, "https://mtest.hotcoursesabroad.com/");
	       if(URL != "https://mtest.hotcoursesabroad.com/")
		   {
			  
			   driver.get("https://mtest.hotcoursesabroad.com/?nr=true");
			   LoginPage login1 = new LoginPage(driver);			
			   login1.clicktopNavLogIcn();
			   login1.navMyDetails();
			   MyDetailsPage mp = new MyDetailsPage(driver);
			   mp.clickChangePwd();
			driver.findElement(Existing_pwd).sendKeys(Commanmethod.getProperty("Pwd"));
			driver.findElement(New_pwd).sendKeys(Commanmethod.getProperty("new_pwd"));
			driver.findElement(Confirm_pwd).sendKeys(Commanmethod.getProperty("confirm_pwd"));
			driver.findElement(Submit_btn).click();
			
			driver.get("https://mtest.hotcoursesabroad.com/?nr=true");
			LoginPage login2 = new LoginPage(driver);
				
			   login2.clicktopNavLogIcn();
			   login2.clicklogout();
		   
			   driver.get("https://mtest.hotcoursesabroad.com/study/loginhome.html?nr=true");
			   login.typeUserName(userid);
			    //System.out.println(pass);
			    login.typePassword(Commanmethod.getProperty("confirm_pwd"));
			    Thread.sleep(1000);
			    login.clickonloginbutton();
			    
			    String URL1 = driver.getCurrentUrl();
			    // Assert.assertEquals(URL, "https://mtest.hotcoursesabroad.com/");
			          if(URL1.contains("https://mtest.hotcoursesabroad.com/")  || URL1.contains("https://www.hotcoursesabroad.com/india/")) 
			   	   {
			        	  Commanmethod.logger.log(LogStatus.PASS,"Change Password Verification Pass");
			        	  
			   	   }
			          
			          else
			          {
			        	  Commanmethod.logger.log(LogStatus.FAIL,"Change Password Verification Fail"); 
			          }
			
			
			  
	    }
}
}

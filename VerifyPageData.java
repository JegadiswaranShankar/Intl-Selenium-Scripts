package com.hc.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a1 ="D:\\Programs\\Datadriven\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", a1);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mtest.myhotcourses.com/");
		driver.findElement(By.xpath("/html/body/div[3]/div/header/div[2]/div[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='eid']")).sendKeys("jegadiswaran.shankar@hotcourses.co.in");
		driver.findElement(By.xpath("//*[@id='staticpassword']")).sendKeys("jega123");
		driver.findElement(By.xpath("//*[@id='loginBtn']")).click();
		
		//driver.get("https://mtest.myhotcourses.com/cmint/chub/manage-profile.html?action=editContSection&institutionId=142315&countryId=134&orderItemId=653411&interactivityId=308&networkId=&keyId=&edit=true&searchStatus=-1");
		
	    String textarea = driver.findElement(By.tagName("textarea")).getText();
	    
	    
		
		driver.get("https://mtest.hotcoursesabroad.com/study/newzealand/school-college-university/lincoln-university/142315/international.html");
		

	}

}

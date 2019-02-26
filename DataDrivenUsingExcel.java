package com.hc.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DataDrivenUsingExcel {
	
	

	public static void main(String args[])
	{
		By fname = By.xpath("//*[@id='email']");
		By password = By.xpath("//*[@id='pass']");
		By loginbtn = By.xpath(".//*[@id='loginbutton']");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Programs\\Datadriven\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Enter the URL
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
             File src = new File("D:\\Data.xls");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			
			HSSFSheet sh1 = wb.getSheetAt(0);
			
			String s1 = sh1.getRow(1).getCell(0).getStringCellValue();
			String s2 = sh1.getRow(1).getCell(1).getStringCellValue();
			driver.findElement(fname).sendKeys(s1);
			driver.findElement(password).sendKeys(s2);
			driver.findElement(loginbtn).click();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			 
			   System.out.println(e.getMessage());
			 
			  }
		//Set the path of the chrome driver
		
		
	}
    
}

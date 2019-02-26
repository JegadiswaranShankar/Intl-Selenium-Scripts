package com.hc.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.hc.functionlibrary.Commanmethod;
import com.hc.testcases.VerifyEnquiry;

public class EnquiryPage {
	
	WebDriver driver;
	
	public By fstname = By.id("fstname");
	public By lstname = By.id("lstname");
	public By emailid = By.id("confirmEmailId");
	public By Phonetype = By.xpath("//*[@id='phoneType']");
	public By Phonenumber = By.id("phoneNumber");
	public By date = By.id("date");
	public By month = By.id("month");
	public By year = By.id("year");
	public By nationality = By.id("yournationality");
	public By stylvl = By.id("styLvl");
	public By subject = By.xpath(".//*[@id='enquirySubjectId']");
	public By stdyyear = By.xpath("//*[@id='intk-2018']");
	public By txtarea = By.xpath(".//*[@id='enquiryid']");
	public By pwdyes = By.xpath("//input[@id='passwordyes']");
	public By pwdtxtarea = By.xpath("//*[@id='passwordValueId']");
	public By proceedbut = By.xpath("//input[@id='greybut']");
	public By stdylvlPG = By.xpath(".//*[@id='qual-57']/a");
	public By enggsubject = By.xpath(".//*[@id='enquirySubjectId']/option[8]");
	public By citizenship = By.xpath("//*[@id='residenceQuestionDiv']");
	public By citizenyes = By.xpath("//*[@id='resQuestion-Y']");
	public By citizenno = By.xpath("//*[@id='resQuestion-N']");
	
	
     
		
	}
	 
	
	



package com.hc.pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.hc.functionlibrary.Commanmethod;
import com.hc.testcases.VerifyHomepage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage {
	
	WebDriver driver;
	
     Commanmethod cm = new Commanmethod();
	//*Created my own xpaths for all the top navigations 
	
	By logo = By.xpath("//*[@id='wrapper']/div/a/img");
	By FindCourses = By.xpath("//a[@id='tpNvCrseLnk']");
	By GetInspired = By.xpath("//a[@id='tpNvInspLnk']");
	By AboutUs = By.xpath("//a[@id='tpNvAbtLnk']");
	By TopSearch = By.xpath("//a[@id='topNavSrchIcn']");
	By SubjectSearch = By.xpath("html/body/section[2]/div/div[2]/div/div/div/form/ul[2]/li[1]/div/a");
	By DestinationSearch = By.xpath("html/body/section[2]/div/div[2]/div/div/div/form/ul[2]/li[2]/div/a"); 		
	By QualificationSearch = By.xpath("html/body/section[2]/div/div[2]/div/div/div/form/ul[2]/li[3]/div/a");  
	By SearchIcon = By.xpath("//a[@id='topNavSrchIcn']");
	By SubjectPod = By.xpath("//div[@class='brtbprnt subj']");
	By DestinatioPod = By.xpath("//div[@class='brtbprnt']"); 
	By ArticlePod = By.xpath("//div[@id='articleProfileId']"); 
	By FeaturedInstitution = By.id("profilePodId");
	By whatmore = By.xpath("//section[@class='stftr']");  
	By partaners = By.xpath("//a[@href='/study/partners.html#HKUGC']");
	By Jointhecommunity = By.xpath("//input[@id='semail_id']");
	By footer = By.xpath("//footer[@id='footerId']");
	By chatbot = By.className("fd_bg");
	By subjectsrch = By.xpath("//span[text()='Subject area*']");
	By Subject = By.xpath("//div[@class='s_hd']");
	By TopNavSearchBar = By.xpath("//input[@id='topNavSrch']");
	By TopNavCourse = By.id("crseLnk_0");
	By TopNavUniv = By.xpath("//span[@id='univ_0']");
	By TopNavArticle = By.xpath("//*[@id='artlDtl_0']/b");  
	By ViewAllDest = By.xpath("//a[@href='/world/'][text()='VIEW ALL DESTINATIONS']");
	By HeroImage = By.xpath("//*[@id='heroImageDiv2']");
	By Gotitbtn = By.className("gt_it");
	
	
	
public HomePage(WebDriver driver)
	{
		this.driver = driver;
		
	}	 
	
	public void verifyLogo()
	{
		if(driver.findElement(logo).isDisplayed())
		{
			//Commanmethod.logger.log(LogStatus.PASS,"Verified..Logo Presence");
			cm.logger.log(LogStatus.PASS,"Verified..Logo Presence");
						
						
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Logo Not Presence");
		}
	}
	
	
	public void verifyFindCourses()
	{
		if(driver.findElement(FindCourses).isDisplayed())
		{  
			
			
			cm.logger.log(LogStatus.PASS,"Verified..FindCourses Presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..FindCourses Not Presence");
		}
	}
	
	public void verifyGetInspired()
	{
		if(driver.findElement(GetInspired).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..GetInspired Presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..GetInspired Not Presence");
		}
	}
	
	public void verifyAboutUs()
	
	{
		if(driver.findElement(AboutUs).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..AboutUs Presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..AboutUs Not Presence");
		}
	}
	
	public void verifyTopSearch()
	{
		if(driver.findElement(TopSearch).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..TopSearch Presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..TopSearch Not Presence");
		}
	}
	
	
	public void verifySubjectSearch()
	{
		if(driver.findElement(SubjectSearch).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..SubjectSearch Presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..SubjectSearch Not Presence");
		}
	}
	
	public void verifyDestinationSearch()
	{
		if(driver.findElement(DestinationSearch).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..DestinationSearch Presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..DestinationSearch Not Presence");
		}
	}
	
	public void verifyQualificationSearch()
	{
		if(driver.findElement(QualificationSearch).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..QualificationSearch Presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..QualificationSearch Not Presence");
		}
	}
	
	public void verifySearchIcon()
	{
		if(driver.findElement(SearchIcon).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..SearchIcon Presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..SearchIcon Not Presence");
		}
	}
	
	public void verifySubjectpod()
	{
		if(driver.findElement(SubjectPod).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Subjectpod Presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Subjectpod Not Presence");
		}
	}
	
	public void verifyDestinationpod()
	{
		if(driver.findElement(DestinatioPod).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Destinationpod Presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Destinationpod Not Presence");
		}
	}
	
	public void verifyArticlePod()
	{
		if(driver.findElement(ArticlePod).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..ArticlePod Presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..ArticlePod Not Presence");
		}
	}
	
	public void verifyFeaturedInstitution() throws InterruptedException
	{
		Thread.sleep(1000);
		if(driver.findElement(FeaturedInstitution).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..FeaturedInstitution Presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..FeaturedInstitution Not Presence");
		}
	}
	
	public void verifywhatmore()
	{
		if(driver.findElement(whatmore).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Whatmore presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Whatmore Not presence");
		}
	}
	
	public void verifypartaners()
	{
		if(driver.findElement(partaners).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Partners presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Partners Not presence");
		}
	}
	
	public void verifyJointhecommunity()
	{
		if(driver.findElement(Jointhecommunity).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Jointhecommunity presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Jointhecommunity Not presence");
		}
	}
	
	
	public void verifyfooter()
	{
		if(driver.findElement(footer).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Footer presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Footer Not presence");
		}
	}
	
	public void verifychatbot()
	{
		if(driver.findElement(chatbot).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Chatbot presence");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Chatbot Not presence");
		}
	}
	
	public void verifysubfield()
	{
		if(driver.findElement(subjectsrch).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Subject search field presence");
			String subjplaceholder = driver.findElement(subjectsrch).getAttribute("placeholder");
			System.out.println(subjplaceholder);
			//Assert.assertEquals(subjplaceholder, "Subject area*");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Subject search field Not presence");
		}
	}
	
	public void verifyTopNavSearch() throws InterruptedException
	{
		driver.findElement(TopSearch).click();
		
		//verify watermark
		Thread.sleep(1000);
		
		String placeholder_txt = driver.findElement(TopNavSearchBar).getAttribute("placeholder");
		System.out.println(placeholder_txt);
		
		if(placeholder_txt.contains("Search for study abroad info*"))
		{
			cm.logger.log(LogStatus.PASS,"Verified..Placeholder text in the field is as expected"+"Search for study abroad info*");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Placeholder text in the field is not as expected"+"Search for study abroad info*");
		}
		
		
		
		driver.findElement(TopNavSearchBar).sendKeys("arts");
		Thread.sleep(10000);
		driver.findElement(TopNavCourse).click();
		if(driver.findElement(By.xpath("//span[@id='phCat']")).getText().contains("Arts"))
		{
			cm.logger.log(LogStatus.PASS,"Verified..Redirected to SR Page");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Not Redirected to SR Page");
		}
		
		driver.findElement(TopSearch).click();
		driver.findElement(TopNavSearchBar).sendKeys("Business");
		Thread.sleep(1000);
		driver.findElement(TopNavUniv).click();
		
		if(driver.findElement(By.xpath("//*[@id='cdBannerWrapId']/div[2]/div[3]/div/h1")).getText().contains("AIB College of Business"))
		{
			//*[@id="cdBannerWrapId"]/div[2]/div[3]/div/h1
			cm.logger.log(LogStatus.PASS,"Verified..Redirected to Profile Page");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Not Redirected to Profile Page");
		}
		driver.findElement(TopSearch).click();
		driver.findElement(TopNavSearchBar).sendKeys("Medicine");
		Thread.sleep(10000);
		driver.findElement(TopNavArticle).click();
		
		if(driver.findElement(By.xpath("//*[@id='middle_cnt']/div/div[2]/div[2]/div/article/h1")).getText().contains("STUDYING HEALTH AND MEDICINE ABROAD"))
		{
			
			System.out.println("Verified..Redirected to Article Details Page");
			cm.logger.log(LogStatus.PASS,"Verified..Redirected to Article Details Page");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Not Redirected to Article Details Page");
		}
		//driver.quit();
	}
	

	public void hometoSR() throws InterruptedException
	{
	
		Thread.sleep(3000);
		WebElement subject_element = driver.findElement(Subject);
		String str = subject_element.getText();
		System.out.println(str);
		Actions actions = new Actions(driver);
		actions.click(subject_element).build().perform();
		
	}
	
	
	public void hometoworld() throws InterruptedException
	{
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		  jse1.executeScript("window.scrollBy(0,3000)", "");
		Thread.sleep(3000);
		driver.findElement(ViewAllDest).click();
	}
	
	
	public void navigatetoHome()
	{
		driver.findElement(logo).click();
	}
	
	public void gotitbtn()
	{
		WebElement gotitbtn = driver.findElement(Gotitbtn);
		System.out.println(gotitbtn.getCssValue("color"));
		
	}

	
	
//	@BeforeClass
//	public void initializeReport() {
//		   
//		Commanmethod.report = new ExtentReports(new File("src/main/java/com/hc/testreport").getAbsolutePath() + "\\" +Commanmethod.dateformat.format(Commanmethod.date) + "_TestReport.html");
//		   //Adding system info
//		Commanmethod.report.addSystemInfo("OS", "WINDOWS");
//		Commanmethod.report.addSystemInfo("BROWSER", "CHROME");
//		Commanmethod.report.addSystemInfo("PROJECT_NAME", "Intl");
//		   
//		  }
//	
//	@AfterClass
//	public void closeReport()
//	 {
//		Commanmethod.report.endTest(Commanmethod.logger);
//		Commanmethod.report.flush();
	  
	 }
	
	
	

		   




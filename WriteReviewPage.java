package com.hc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.hc.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class WriteReviewPage {
	
	
WebDriver driver;

    
    Commanmethod cm = new Commanmethod();
	By WriteReviewBtn = By.xpath("//A[@id='rvwIdPrfPageAnt']");
	By StarRating1 = By.xpath("//A[@id='r1']");
	By StarRating2 = By.xpath("//A[@id='r2']");
	By StarRating3 = By.xpath("//A[@id='r3']");
	By StarRating4 = By.xpath("//A[@id='r4']");
	By StarRating5 = By.xpath("//A[@id='r5']");
	By StarRating6 = By.xpath("//A[@id='r6']");
	By ReviewTitle = By.xpath("//INPUT[@id='reviewtitle']");  
    By ReviewEXP = By.xpath("//TEXTAREA[@id='txtArea']");
    By ReviewStudyLevel = By.xpath("//SELECT[@id='reviewstudyLevelId']");
    By ReviewSubject = By.xpath("//INPUT[@id='courseTitle']");
    By CourseName = By.xpath("//INPUT[@id='courseText']");
    By GradYear = By.xpath("//SELECT[@id='gradyear']");
    By RecommendBtn = By.xpath("//input[@id='accomandNo1']");
    By FirstName = By.xpath("//INPUT[@id='fstname']");
    By LastName = By.xpath("//INPUT[@id='lstname']");
    By YourCountry = By.xpath("//SELECT[@id='yournationality']");
    By Email1 = By.xpath("//INPUT[@id='confirmEmailId']");
    By Date = By.xpath("//INPUT[@id='date']");
    By Month = By.xpath("//INPUT[@id='month']");
    By Year = By.xpath("//INPUT[@id='year']");
    By PwdYes = By.xpath("//INPUT[@id='passwordyes']");
    By Pwdtxtvalue = By.id("passwordValue");
     By SubmitBtn = By.xpath("//INPUT[@id='greybut']");
    By AjaxSub1 = By.xpath("//DIV[@id='108~3']");
    
    
    
    
	public WriteReviewPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void clickReviewBtn()
	{ 
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	    jse1.executeScript("window.scrollBy(0,2500)", "");
		driver.findElement(WriteReviewBtn).click();
	}
	
	
	public void clickRatings()
	{
		if(driver.findElement(StarRating1).isDisplayed() && driver.findElement(StarRating2).isDisplayed() && driver.findElement(StarRating3).isDisplayed() && driver.findElement(StarRating4).isDisplayed() && driver.findElement(StarRating5).isDisplayed() && driver.findElement(StarRating6).isDisplayed())
		{
			if(driver.findElement(StarRating1).isEnabled() && driver.findElement(StarRating2).isEnabled() && driver.findElement(StarRating3).isEnabled() && driver.findElement(StarRating4).isEnabled() && driver.findElement(StarRating5).isEnabled() && driver.findElement(StarRating6).isEnabled())
			{
				driver.findElement(StarRating1).click();
				driver.findElement(StarRating2).click();
				driver.findElement(StarRating3).click();
				driver.findElement(StarRating4).click();
				driver.findElement(StarRating5).click();
				driver.findElement(StarRating6).click();
				cm.logger.log(LogStatus.PASS, "Star Ratings are clicked Successfully");
			}
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Star Ratings are Not clicked");
		}
	}

	
	public void EnterReviewTitle(String reviewtitle)
	{
		
		if(driver.findElement(ReviewTitle).isDisplayed() && driver.findElement(ReviewTitle).isEnabled())
		{
			driver.findElement(ReviewTitle).clear();
			driver.findElement(ReviewTitle).sendKeys(reviewtitle);
		}
		
	}
	
	public void EnterReviewExp(String reviewExp) throws InterruptedException
	{
		if(driver.findElement(ReviewEXP).isDisplayed() && driver.findElement(ReviewEXP).isEnabled())
		{
			driver.findElement(ReviewEXP).clear();
			driver.findElement(ReviewEXP).sendKeys(reviewExp);
			Thread.sleep(1000);
		}
	}
	
	public void SelectStudyLevel()
	{
		
			Select drpStudy = new Select(driver.findElement(ReviewStudyLevel));
			drpStudy.selectByValue("7");
		
		
	}
	
	public void EnterReviewSubject(String reviewSubj) throws InterruptedException
	{
		if(driver.findElement(ReviewSubject).isDisplayed() && driver.findElement(ReviewSubject).isEnabled())
		{
			WebElement Subject = driver.findElement(ReviewSubject);
			driver.findElement(ReviewSubject).clear();
			Subject.sendKeys(reviewSubj);
			Thread.sleep(1000);
			Actions act = new  Actions(driver);
			Subject.sendKeys(Keys.DOWN);
			Subject.sendKeys(Keys.DOWN);
			Subject.sendKeys(Keys.ENTER);
			
		}
		
	    
		
	}
	
	public void EnterCourseName(String revcoursename)
	{
		if(driver.findElement(CourseName).isDisplayed() && driver.findElement(CourseName).isEnabled())
		{
			driver.findElement(CourseName).sendKeys(revcoursename);
		}
	}
	
	public void SelectGradYear() throws InterruptedException
	{
		if(driver.findElement(GradYear).isDisplayed() && driver.findElement(GradYear).isEnabled())
		{
			Select drpStudyYear = new Select(driver.findElement(GradYear));
			drpStudyYear.selectByValue("2018");
			 Thread.sleep(5000);
			
		}
	}
	
	public void ClickRecBtn() 
	{
		   
			driver.findElement(RecommendBtn).click();
		
	}
	
	public void EnterFirstName(String firstname)
	{
		if(driver.findElement(FirstName).isDisplayed() && driver.findElement(FirstName).isEnabled())
		{
			driver.findElement(FirstName).sendKeys(firstname);
		}
	}
	
	public void EnterLastName(String lastname)
	{
		if(driver.findElement(LastName).isDisplayed() && driver.findElement(LastName).isEnabled())
		{
			driver.findElement(LastName).sendKeys(lastname);
		}
	}
	
	public void SelectCountry()
	{
		if(driver.findElement(YourCountry).isDisplayed() && driver.findElement(YourCountry).isEnabled())
		{
			Select drpStudyYear = new Select(driver.findElement(YourCountry));
			drpStudyYear.selectByValue("USA");
		}
	}
	
	public void EnterEmail(String email)
	{
		if(driver.findElement(Email1).isDisplayed() && driver.findElement(Email1).isEnabled())
		{
			driver.findElement(Email1).clear();
			driver.findElement(Email1).sendKeys(email);
		}
	}
	
	public void EnterDOB(String date, String month, String year) throws InterruptedException
	{
		if(driver.findElement(Date).isEnabled() && driver.findElement(Month).isEnabled() && driver.findElement(Year).isEnabled())
		{
			
			driver.findElement(Date).sendKeys(date);
			driver.findElement(Month).sendKeys(month);
			driver.findElement(Year).sendKeys(year);
			JavascriptExecutor jse1 = (JavascriptExecutor)driver;
  		    jse1.executeScript("window.scrollBy(0,2000)", "");
  		  JavascriptExecutor jse = (JavascriptExecutor) driver;
  		  jse.executeScript("document.getElementById('passwordyes').focus();");
  		  		}
	}
	
	public void CreatePwd() throws InterruptedException
	{
//		WebDriverWait wait = new WebDriverWait(driver,500);
//  	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//LABEL[@for='passwordyes'][text()='Yes']")));     
   if(driver.findElement(PwdYes).isDisplayed())
   {
	  
	

	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(PwdYes)).click().build().perform();
	//driver.findElement(PwdYes).click();
	Thread.sleep(1000);
//JavascriptExecutor jse = (JavascriptExecutor) driver;
//jse.executeScript("document.getElementById('Pwdtxtvalue').focus();");

   }
	
 }
	
	
	public void enterPwd(String pwd) throws InterruptedException
	{
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("document.getElementById('Pwdtxtvalue').focus();");
		
		if(driver.findElement(Pwdtxtvalue).isDisplayed())
		{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(Pwdtxtvalue)).click();
		action.moveToElement(driver.findElement(Pwdtxtvalue)).sendKeys(pwd);
		}
	}
	
	public void clickSubmitBtn()
	{
		if(driver.findElement(SubmitBtn).isDisplayed())
		{
			driver.findElement(SubmitBtn).click();
		}
		
	}
}

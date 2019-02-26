package com.hc.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.hc.functionlibrary.Commanmethod;
import com.relevantcodes.extentreports.LogStatus;

public class SubjectProfilePage {
	
    WebDriver driver;
    Commanmethod cm = new Commanmethod();
	By favlink = By.xpath("//span[@class='fa fa-heart-o']");
	By logo = By.xpath("//div[@id='stckyUniLogo']");
	By breadcrumb = By.xpath("//*[@id='cdBannerWrapId']/div[1]/ul/li[1]/a/i"); 
	By instname = By.xpath("//*[@id='cdBannerWrapId']/div[2]/div[3]/div/h1/a");
	
	By countryflag = By.xpath("//*[@id='cdBannerWrapId']/div[2]/div[3]/div/div/p[1]/span/img");
	
	By countryname = By.xpath("//*[@id='cdBannerWrapId']/div[2]/div[3]/div/div/p[1]");
	
	By rating = By.xpath("//i[@class='wrtng4']");
	By reviews = By.xpath("//a[@class='rw_ns']");
	By viewseye = By.xpath("//i[@class='fa fa-eye']");
	By noofviews = By.xpath("//*[@id='cdBannerWrapId']/div[2]/div[3]/div/div/p[3]/span");
	
	
	By THEranking = By.xpath("//p[@class='times']");
	By visitwebsite = By.xpath("//a[@id='visitWebLinkId']");
	By downloadprospectus = By.xpath("//a[@class='org_btn']");
	By contactuniversity = By.xpath("//a[@class='grn_btn']");
	By proSec1 = By.xpath("//li[@id='active-0']");
	By proSec2 = By.xpath("//li[@id='active-1']");
	By proSec3 = By.xpath("//li[@id='active-2']");
	By proSec4 = By.xpath("//li[@id='active-3']");
	By proSec5 = By.xpath("//li[@id='active-4']");
	By theUniTab = By.xpath("//a[@id='univTab']");
	By theStuTab = By.xpath("//a[@id='studTab']");
	By proImg = By.xpath("//img[@id='galimg-0']");
	By proVideo = By.xpath("//*[@id='galimg-4']"); 
	By proMap = By.xpath("//div[@id='mapDiv']"); 
	By engscrReq = By.xpath("//div[@class='hldr']");
	By ieltslogo = By.xpath("//img[@src='https://tpc.googlesyndication.com/simgad/512994634171109320']");
	By rankings = By.xpath("//*[@id='middle_cnt']/div/div[6]/div[1]/div"); 
	By studentlife = By.xpath("//div[@class='key_rgt p_ct fw_im']");
	By stdreviews = By.xpath("//*[@id='reviews']/div/div[4]/div");
	By reviewbtn = By.xpath("//a[@id='rvwIdPrfPage']");
	By coursesearchpod = By.xpath("//div[@class='ev_cont']");
	By coursesection = By.xpath("//*[@id='course']/div/div");
	By scholarshipsection = By.xpath("//*[@id='scholar']/div");
	
	By videostab = By.xpath("//*[@id='videoSecTtile']");  
	By subprofilename = By.xpath("//*[@id='middle_cnt']/div/div[2]/div[3]/div/h2");
	By enquiryform = By.xpath("//*[@id='enquiryDpForm']");
	
	//By embeddedEnqForm = By.xpath(xpathExpression)
	
	
	public SubjectProfilePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void verifyFavLinkSP()
	{
		if(driver.findElement(favlink).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Favourite link is presence in SP Page");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Verified..Favourite link is Not presence in SP Page");
		}
	}
	
	public void verifyLogo()
	{
		if(driver.findElement(logo).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Logo is presence in SP Page");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Logo is Not presence in SP Page");
		}
		
	}
	
	public void verifyBreadCrumb()
	{
		if(driver.findElement(breadcrumb).isDisplayed() && driver.findElement(breadcrumb).isEnabled())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Breadcrumb is presence in SP Page");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Breadcrumb is Not presence in SP Page");
		}
	}
	
	public void verifyInstName()
	{
		if(driver.findElement(instname).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Institution Name is presence in SP Page");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Institution Name is Not presence in SP Page");
		}
	}
	
	public void verifySPName()
	{
		if(driver.findElement(subprofilename).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Subject Profile Name is presence in SP Page");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Subject Profile Name is Not presence in SP Page");
		}
	}
	
	
	public void verifyCountryFlag()
	{
		if(driver.findElement(countryflag).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..CountryFlag is presence in SP Page");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..CountryFlag is Not presence in SP Page");
		}
	}
	
	public void verifyCountryName()
	{
		
		String ctrynme = driver.findElement(countryname).getText();
		if(ctrynme.equals("AUSTRALIA"))
		{
			cm.logger.log(LogStatus.PASS,"Verified..Provide Country name is displaying correctly");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Provide Country name is Not displaying correctly");
		}
		
	}
	
	
	public void verifyRating() throws InterruptedException
	{
		if(driver.findElement(rating).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS,"Verified..Rating is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Rating is Not presence in SP Page");
		}
	}
	
	public void verifyReviews()
	{
		if(driver.findElement(reviews).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Reviews is presence in SP Page");
			//driver.findElement(reviews).click();
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Reviews is Not presence in SP Page");
		}
	}
	
	public void verifyvieweye()
	{
		if(driver.findElement(viewseye).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..View eye is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..View eye is Not presence in SP Page");
		}
	}
	
	public void verifyNumberofViews()
	{
		if(driver.findElement(noofviews).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Number of views is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Number of views is Not presence in SP Page");
		}
	}
	
	public void verifyTHERanking()
	{
		if(driver.findElement(THEranking).isDisplayed())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..THE Ranking is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..THE Ranking is Not presence in SP Page");
		}
	}
	
	public void verifyvisitWebsiteButton()
	{
		if(driver.findElement(visitwebsite).isDisplayed() && driver.findElement(visitwebsite).isEnabled())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Visit website button is presence in SP Page & Its Clickable");
			//driver.findElement(visitwebsite).click();
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Visit website button is Not presence in SP Page ");
		}
	}
	
	public void verifyDP()
	{
		if(driver.findElement(downloadprospectus).isDisplayed() && driver.findElement(downloadprospectus).isEnabled())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..DP button is presence in SP Page & Its Clickable");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..DP button is Not presence in SP Page");	
		}
	}
	
	public void verifyCU()
	{
		if(driver.findElement(contactuniversity).isDisplayed() && driver.findElement(contactuniversity).isEnabled())
		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Contact University button is presence in SP Page & Its Clickable");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Contact University button is Not presence in SP Page");
		}
	}
	
//	public void verifytheUniTab()
//	{
//		if(driver.findElement(theUniTab).isDisplayed())		{
//			
//			cm.logger.log(LogStatus.PASS,"Verified..The University Tab Section is presence in SP Page");
//			
//			}
//		else
//		{
//			cm.logger.log(LogStatus.FAIL,"Verified..The University Tab Section is Not presence in SP Page");
//		}
//	}
//	
//	public void verifytheStuTab()
//	{
//		if(driver.findElement(theStuTab).isDisplayed())		{
//			
//			cm.logger.log(LogStatus.PASS,"Verified..The Student Tab Section is presence in SP Page");
//			
//		}
//		else
//		{
//			cm.logger.log(LogStatus.FAIL,"Verified..The Student Tab Section is Not presence in SP Page");	
//		}
//	}
//	
	public void verifyProSec1()
	{
		if(driver.findElement(proSec1).isDisplayed())		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Section 1 is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Section 1 is Not presence in SP Page");
		}
	}
	
	
	public void verifyProSec2()
	{
		if(driver.findElement(proSec2).isDisplayed())		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Section 2 is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Section 2 is Not presence in SP Page");
		}
	}
	
	public void verifyProSec3()
	{
		if(driver.findElement(proSec3).isDisplayed())		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Section 3 is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Section 3 is Not presence in SP Page");
		}
	}
	
	public void verifyProSec4()
	{
		if(driver.findElement(proSec4).isDisplayed())		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Section 4 is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Section 4 is Not presence in SP Page");
		}
	}
	
	public void verifyproSec5()
	{
		if(driver.findElement(proSec5).isDisplayed())		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Section 5 is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Section 5 is Not presence in SP Page");
		}
	}
	
	public void verifyproImg()
	{
		if(driver.findElement(proImg).isDisplayed())		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Profile Image Section is presence in SP Page");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			driver.findElement(videostab).click();
			
						
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Profile Image Section is Not presence in SP Page");	
		}
	}
	
	public void verifyproVideo()
	{
		if(driver.findElement(proVideo).isDisplayed())		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Profile Video Section is presence in SP Page");
				
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Profile Video Section is Not presence in SP Page");
		}
	}
	
	public void verifyproMap()
	{
		if(driver.findElement(proMap).isDisplayed())		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Profile Map Section is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Profile Map Section is Not presence in SP Page");
		}
	}
	
	public void verifyengscrReq()
	{
		if(driver.findElement(engscrReq).isDisplayed())		{
			
			cm.logger.log(LogStatus.PASS,"Verified..English Score Section is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..English Score Section is Not presence in SP Page");
		}
	}
	
	public void verifyieltslogo()
	{
		if(driver.findElement(ieltslogo).isDisplayed())		{
			
			cm.logger.log(LogStatus.PASS,"Verified..IELTS Logo Section is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..IELTS Logo Section is Not presence in SP Page");
		}
	}
	
	public void verifyrankings()
	{
		if(driver.findElement(rankings).isDisplayed())		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Rankings Section is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Rankings Section is Not presence in SP Page");
		}
	}
	
	public void verifystudentlife()
	{
		if(driver.findElement(studentlife).isDisplayed())		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Student Life Section is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Student Life Section is Not presence in SP Page");
		}
	}
	
	public void verifystdreviews()
	{
		if(driver.findElement(stdreviews).isDisplayed())		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Student Reviews Section is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Student Reviews Section is Not presence in SP Page");
		}
	}
	
	public void verifyreviewbtn()
	{
		if(driver.findElement(reviewbtn).isDisplayed())		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Review Button is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Review Button is Not presence in SP Page");
		}
	}
	
	public void verifycoursesearchpod()
	{
		if(driver.findElement(coursesearchpod).isDisplayed())		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Course Search Pod is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Course Search Pod is Not presence in SP Page");
		}
	}
	
	
	public void verifycoursesection()
	{
		if(driver.findElement(coursesection).isDisplayed())		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Course Section is presence in SP Page");
			
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Course Section is Not presence in SP Page");
		}
	}
	
	public void verifyscholarshipsection()
	{
		if(driver.findElement(scholarshipsection).isDisplayed())		{
			
			cm.logger.log(LogStatus.PASS,"Verified..Scholarship Section is presence in SP Page");
			  
		}
		else
		{
			cm.logger.log(LogStatus.FAIL,"Verified..Scholarship Section is Not presence in SP Page");
		}
		
	}
	
	public void verifyenqform()
	{
		
		if(driver.findElement(enquiryform).isDisplayed())
		{
			cm.logger.log(LogStatus.PASS, "Verified..Enquiry form is presence in SP Page");
		}
		else
		{
			cm.logger.log(LogStatus.FAIL, "Verified..Enquiry form is not presence in SP Page");
		}
	}
	

}

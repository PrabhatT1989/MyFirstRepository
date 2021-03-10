package com.policybazaar.pageclasses;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.ParentClass;

public class PolicyBazaarDashboard  extends ParentClass
{

	@FindBy(xpath = "//div[@class='bellIcon']/child::img[@src='/src/images/notification.fee385d1f72de6f6ec3a1ced839d7ff1.png']")
	@CacheLookup
	WebElement clickbellicon ;
	
	

	
	@FindBy(xpath = "//p[contains(text(),'Dashboard')]/img")
	@CacheLookup
	WebElement dashboard_link_image ;
	
	@FindBy(linkText = "Profiles")
	@CacheLookup
	WebElement clickprofileslink ;
	

	
	public PolicyBazaarDashboard()
	{
		PageFactory.initElements(wd, this);
	}
	
	
	
	//@SuppressWarnings("deprecation")
	public String getDashboardTitle()
	{
		
		/*wd.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		String dashboard_title =  wd.getTitle();
		
	    return dashboard_title ;
	}
	
	public void checkNotfications()
	{
		clickbellicon.click();
	}
	
public boolean getImageDisplayed()
{
	
	boolean dashboardimage = dashboard_link_image.isDisplayed();
	return dashboardimage ; 
	
}


public PolicyBazaarProfilesPage clickPolicyBazaarProfilesLink()
{
	clickprofileslink.click();
	
	return new PolicyBazaarProfilesPage();
}
	
	
	
}

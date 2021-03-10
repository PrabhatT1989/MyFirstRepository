package com.PolicyBazzar.TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.ParentClass;
import com.policybazaar.pageclasses.PolicyBazaarDashboard;
import com.policybazaar.pageclasses.PolicyBazaarLoginPage;

public class DashboardTest extends ParentClass{
	
	public PolicyBazaarDashboard  PolicyBazaarDashboardObj ;
	
    public 	PolicyBazaarLoginPage   PolicyBazaarLoginPageObj ;
	
	@BeforeMethod
	public void dashboardtestinitialize()
	{
		initializePolicyBazzar();
		
	}

	
/*	@Test(priority =1)
public void dashboardTitleTest() throws InterruptedException
{
		
		PolicyBazaarLoginPageObj = new PolicyBazaarLoginPage() ; 
		
		PolicyBazaarLoginPageObj.loginIntoPolicyBazzar() ; 
		
	//	wd.switchTo().frame(wd.findElement(By.id("tag-manager")));
		
		Thread.sleep(4000);
		
		PolicyBazaarDashboardObj = new PolicyBazaarDashboard();
		
		
		
		String dashboardtitledisp =  PolicyBazaarDashboardObj.getDashboardTitle();
		
		//Assert.assertEquals(dashboardtitledisp, "Dashboard-My Account");
		
		Assert.assertEquals(dashboardtitledisp, "Dashboard-My Account");;
		
}
	
	@Test(priority =2)
public void checkNotificationsTest() throws InterruptedException
{
		PolicyBazaarDashboardObj = new PolicyBazaarDashboard();
		PolicyBazaarLoginPageObj = new PolicyBazaarLoginPage() ; 
		PolicyBazaarLoginPageObj.loginIntoPolicyBazzar() ; 
		Thread.sleep(1000);
		
		PolicyBazaarDashboardObj.checkNotfications();
		
}*/
	
	
	@Test(priority= 1)
	public void dashboardMenuLinkImageTest() throws InterruptedException
	{
		PolicyBazaarDashboardObj = new PolicyBazaarDashboard();
		PolicyBazaarLoginPageObj = new PolicyBazaarLoginPage() ;
		
		PolicyBazaarLoginPageObj.loginIntoPolicyBazzar();
		Thread.sleep(4000);
		
		
		
		
	boolean image = 	PolicyBazaarDashboardObj.getImageDisplayed() ; 
	
	if(image==false)
	
		System.out.println("Dashboard Menu Image is false  :: ");
	else
		System.out.println("Dashboard Menu Image is true :: ");
	
	
	}
	
	
	@AfterMethod
	public void clearHistory()
	{
		wd.manage().deleteAllCookies();
	}

}

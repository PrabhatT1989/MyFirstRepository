package PageTestClasses;

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

	
	@Test(priority =1)
public void dashboardTitleTest()
{
		PolicyBazaarDashboardObj = new PolicyBazaarDashboard();
		PolicyBazaarLoginPageObj = new PolicyBazaarLoginPage() ; 
		
		PolicyBazaarLoginPageObj.loginIntoPolicyBazzar() ; 
		//wd.switchTo().frame(0);
		
		String dashboardtitle =  PolicyBazaarDashboardObj.getDashboardTitle();
		Assert.assertEquals(dashboardtitle, "Dashboard-My Account");
		
}
	
/*	@Test(priority =2)
public void checkNotificationsTest() throws InterruptedException
{
		PolicyBazaarDashboardObj = new PolicyBazaarDashboard();
		PolicyBazaarLoginPageObj = new PolicyBazaarLoginPage() ; 
		PolicyBazaarLoginPageObj.loginIntoPolicyBazzar() ; 
		Thread.sleep(1000);
		
		PolicyBazaarDashboardObj.checkNotfications();
		
}*/
	
	
	@AfterMethod
	public void clearHistory()
	{
		wd.manage().deleteAllCookies();
	}

}

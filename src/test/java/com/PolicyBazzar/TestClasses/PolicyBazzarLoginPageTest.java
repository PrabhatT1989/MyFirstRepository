package com.PolicyBazzar.TestClasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.ParentClass;
import com.policybazaar.pageclasses.PolicyBazaarDashboard;
import com.policybazaar.pageclasses.PolicyBazaarLoginPage;

public class PolicyBazzarLoginPageTest extends ParentClass
{  
	public PolicyBazaarLoginPage pbl; 
	public PolicyBazaarDashboard  PolicyBazaarDashboardObj ;

	 
	@BeforeMethod
	public void policyBazzarSetup()
	{
		
		/*pc = new ParentClass();*/
		 initializePolicyBazzar();
		
	}

	@Test(priority = 1)
	public void policybazzarLoginTestTitle()
	{
		pbl = new PolicyBazaarLoginPage();
		String policybazaarloginpagetitle =  pbl.getTitleLoginPage();
		
		System.out.println("Title of login page :: " + policybazaarloginpagetitle);
		
		Assert.assertEquals(policybazaarloginpagetitle, "My Account | Policybazaar");
	}
	
	@Test(priority=2)
	public void  policybazzarLoginTest()
	{
		 pbl = new PolicyBazaarLoginPage();
		
		pbl.loginIntoPolicyBazzar();
		
	}
	

	

	
	
	@AfterMethod
	public void policyBazzarTearDown()
	{
		wd.manage().deleteAllCookies();
	}
	
}

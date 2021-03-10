package com.policybazaar.pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClass.ParentClass;

public class PolicyBazaarLoginPage extends ParentClass
{
	
/*	@FindBy(xpath = "//a[contains(text(), 'My Account')]")
	@CacheLookup
	WebElement click_my_account ;*/
	
	@FindBy(id="mobileNo")
	@CacheLookup
	WebElement enter_mobile_no ; 
	
	@FindBy(xpath= "//span[contains(text(),'LOGIN WITH PASSWORD')]/parent::button")
	@CacheLookup
	WebElement click_login_with_password_button ;
	

	@FindBy(xpath = "//input[@type='password']")
	@CacheLookup
	WebElement enter_password ;
	
	@FindBy(xpath= "//span[contains(text(), 'LOGIN')]/parent::button")
	@CacheLookup
	WebElement click_login_button ;
	
	public PolicyBazaarLoginPage()
	{
		PageFactory.initElements(wd, this);
   }
	
	
	public String getTitleLoginPage()
	{
		String loginpagetitle = wd.getTitle() ; 
		
		return loginpagetitle ;
	}
	
	
//	@SuppressWarnings("deprecation")
	public PolicyBazaarDashboard loginIntoPolicyBazzar()
	{
		
		enter_mobile_no.sendKeys("9869331325");
		click_login_with_password_button.click();
		
		//wait untill password field is accessible
		
		wait=new WebDriverWait(wd, 10) ;
		wait.until(ExpectedConditions.visibilityOf(enter_password));
		
		enter_password.sendKeys("D@zzler$1234");
		click_login_button.click();
		
		return new PolicyBazaarDashboard() ; 
		
		
	}
	
	
	
	
	
	
}

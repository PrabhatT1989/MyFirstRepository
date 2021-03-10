package com.policybazaar.pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.ParentClass;

public class PolicyBazaarProfilesPage extends ParentClass
{
	@FindBy (xpath = "//span[contains(text(),'I am a Male')]/preceding-sibling::img")
	@CacheLookup
	WebElement i_am_a_male_option ; 
	
	
	
	@FindBy (xpath = "//input[@name='AnnualIncome']/preceding-sibling::div[@id='outlined-secondary']")
	@CacheLookup
	WebElement selectannualincome ; 
	
	@FindBy (xpath = "//input[@name='maritalStatus']/parent::div/child::div")
	@CacheLookup
	WebElement selectmartialstatus ; 
	
	
	

	@FindBy (xpath = "//label[contains(text(),'City')]/following::div/input[@id='outlined-secondary']")
	@CacheLookup
	WebElement entercitydetails; 
	
	public PolicyBazaarProfilesPage()
	{
		PageFactory.initElements(wd, this);
	}
	
	
	public String getProfilesPageTitle()
	{
		String profilepagetitle = wd.getTitle() ; 
		return profilepagetitle ; 
	}
	
	
	
	
	

}

package FacebookPageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePage extends BaseClass

{
	
	@FindBy(xpath = "//span[contains(text(),'Events')]")
	WebElement clickoneventslink ;
	
	FacebookHomePage()
	{
		
	}
	
	public FacebookHomePage(WebDriver wd)
	{
		this.wd = wd ;
		PageFactory.initElements(wd, this);
	}

String title_of_home_page;	
	
public String getTitleOfFacebookHomePage()
	{
		title_of_home_page = wd.getTitle() ;
		return title_of_home_page ;
		
	}
	
	
	public void clickEventsLink()
	{
		clickoneventslink.click();
	}
	
}

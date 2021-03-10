package FacebookPageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin extends BaseClass{

	
	// OR - Factory Methods , Declaring Web Objects/ Web Elements
	
	@FindBy(id="email")
	@CacheLookup
	WebElement enterEmailID ; 
	
	@FindBy(id="pass")
	@CacheLookup
	WebElement enterpassword ; 
	
	@FindBy (id="u_0_f")
	@CacheLookup
	WebElement clickLoginbutton ; 
	
	
	// initializing the web elements using Pagefactory class
	public FacebookLogin()
	{
		
		
		PageFactory.initElements(wd, "FacebookLogin.java");
	}
	
	
	
	// Actions / Methods
	public FacebookHomePage login()
	{
		enterEmailID.sendKeys("Prabhat.Tavag@yahoo.com");
		enterpassword.sendKeys("7710977");
		clickLoginbutton.click();
		
		return new FacebookHomePage();
	}
	
	public String getTitleFacebookLoginPage()
	{
		
		String fbloginpagetitle = wd.getTitle();
		return fbloginpagetitle ; 
	}
	
	
}

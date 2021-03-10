package PageTestClasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FacebookPageClasses.BaseClass;
import FacebookPageClasses.FacebookHomePage;
import FacebookPageClasses.FacebookLogin;

public class LoginPageTest extends BaseClass
{
	
	public static FacebookLogin fb_login ; 
	
	public static BaseClass bc ;
	
//	public static FacebookHomePage FB_HomePage ; 
	
	public static FacebookHomePage fhp ;
	
	
	
	
	
	
@BeforeMethod()
public void setup()
{
	initialize();
	
}

/*@Test(priority =1)
public void loginPageTitleTest()
{
	fb_login = new FacebookLogin(wd) ;
	
	String title_login_page = fb_login.getTitleFacebookLoginPage();
	//Assert.assertEquals(title_login_page, );
	Assert.assertEquals(title_login_page, "Facebook – log in or sign up","String not matched");
}
*/

@Test(priority = 2)
public void loginTest()
{
	fb_login = new FacebookLogin() ;
	 fb_login.login();
	
}

/*@Test(priority = 3)
public void facebookHomePageTitleTest()
{
	fhp = new FacebookHomePage(wd);
	
	String home_page_title = fhp.getTitleOfFacebookHomePage();
	
	Assert.assertEquals(home_page_title, "Facebook");
	}

@Test(priority = 4)
public void eventsTest()
{
	fhp = new FacebookHomePage(wd);
	
    fhp.clickEventsLink();	
}  
*/
@AfterMethod()
public void quitNow()
{
wd.quit();	
}
	
}

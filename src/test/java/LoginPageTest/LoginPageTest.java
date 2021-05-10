package LoginPageTest;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LoginClass.LogicPage;

public class LoginPageTest extends LogicPage {

	LogicPage lp = new LogicPage();
	
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\Chrome Driver 89\\chromedriver.exe" );
		wd = new ChromeDriver();
		wd.get("http://example.com/doc.html");
		
		
		
	}
	
	
	@Test(testName="without accepting tnc clicked on Mydoc.pdf")
	public void without_Accepting_Terms_N_Conditions_Test()
	{
        lp.click_On_downloadmydocpdf_Without_AcceptingTnC();
		
		Assert.assertEquals(errormsg, "You do not have permission to do that");
	}
	
	
	@Test
	public void acceptTerms_And_Conditions()
	{
		lp.accept_Terms_And_Conditions();
		lp.getWindowHandle();
		
		
	}
	
	
}

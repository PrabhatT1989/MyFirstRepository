import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataDrivenTestClass 
{
	String url = "https://www.facebook.com/" ; 
	String chromedriverpath = "F:\\Chrome Driver\\Chrome Driver 89\\chromedriver.exe";
	WebDriver wd ; 
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		wd = new ChromeDriver() ;
		
		wd.get(url);
		wd.manage().window().maximize();
		
		
	}
	
	@Test
	public void loginTest(String username , String password)
	{
		
		wd.findElement(By.id("email")).sendKeys(username);
		wd.findElement(By.id("pass")).sendKeys(password);
		
		wd.findElement(By.id("u_0_d_9W")).click();
		
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		wd.close();
	}

}

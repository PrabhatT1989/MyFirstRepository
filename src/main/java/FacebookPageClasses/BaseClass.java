package FacebookPageClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	public static String driverpath = "G:\\Selenium Driver\\Chromer Driver 87\\chrome driver 87\\chromedriver.exe" ; 
	
	public static String url = "https://www.facebook.com/" ;
	
	
	 public static WebDriver wd  ;
	 
	
	 
	public void initialize()
	 {
		 try 
		 {
			 
			 System.setProperty("webdriver.chrome.driver", driverpath);
		
			 wd =  new ChromeDriver();
		 //System.setProperty("webdriver.chrome.driver", driverpath);
		
		 wd.get(url);
		 wd.manage().window().maximize();
		 wd.manage().deleteAllCookies();
		 // wd.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 
		 
		 
	 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
		 
	 }

	
	
	
}

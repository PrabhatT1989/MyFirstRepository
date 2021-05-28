package XpathPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathPrac {
	
	WebDriver wd ;
	String driverpath = "F:\\Chrome Driver\\Chrome Driver 90\\chromedriver.exe" ;
	
	//String firefoxdriverpath = "G:\\Mozilla Firefox Driver\\Gecko Driver\\geckodriver.exe" ; 
	
	String url = "https://money.rediff.com/gainers/bsc/daily/groupa";
	
	@Test
	public void dynamicXpath()
	{
		System.setProperty("webdriver.chrome.driver", driverpath) ; 
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get(url);
		
		
		
	}

}

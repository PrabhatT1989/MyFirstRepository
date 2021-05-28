package SampleTestPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo 
{
   
    WebDriver wd ; 

	
@Test
	@Parameters("browser")
	public void crossBrowserTesting(String browser)
	{
      if(browser.equalsIgnoreCase("Chrome"))
      {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\Chrome Driver 90\\chromedriver.exe");
		
		wd= new ChromeDriver();
		
		wd.get("https://www.guru99.com/");
		
		wd.manage().window().maximize();
      }
      
      else if(browser.equalsIgnoreCase("Firefox"))
      {
    	  System.setProperty("webdriver.gecko.driver", "G:\\Mozilla Firefox Driver\\Gecko Driver\\geckodriver.exe");
  		
  		wd= new FirefoxDriver();
  		
  		wd.get("https://www.guru99.com/");
  		
  		wd.manage().window().maximize();
  		
  		
  		

     }  
		
		
	}

}

package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParentClass {
	
	
	public static String driverpath = "G:\\Selenium Driver\\Chromer Driver 87\\chrome driver 87\\chromedriver.exe" ; 
	
	public static String url = "https://caccount.policybazaar.com/?source=pbheader" ;
	
	
	 public static WebDriver wd  ;
	 
	 public static WebDriverWait wait ;
	 
	
	 
	public void initializePolicyBazzar()
	 {
		 
			 
			 System.setProperty("webdriver.chrome.driver", driverpath);
		
			 wd =  new ChromeDriver();
		 //System.setProperty("webdriver.chrome.driver", driverpath);
		
		 wd.get(url);
		 
		 wd.manage().window().maximize();
		 wd.manage().deleteAllCookies();
		 // wd.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 
	 
	 }

	

}

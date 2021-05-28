package SampleTestPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SpicejetDemo {
	
	WebDriver wd ;
	String driverpath = "F:\\Chrome Driver\\Chrome Driver 90\\chromedriver.exe" ;
	
	String chromedriverpath = "G:\\Mozilla Firefox Driver\\Gecko Driver\\geckodriver.exe" ; 
	
	String url = "https://book.spicejet.com/Select.aspx";
	
@Test	
public void dynamicXpath() throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", driverpath);
	
	    wd = new ChromeDriver() ;
	    
	    wd.manage().window().maximize();
	    wd.get(url);
		
		/*
		 * WebElement from = wd.findElement(By.xpath(
		 * "//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")) ;
		 * from.sendKeys("Mum"); // from.sendKeys(Keys.TAB); Thread.sleep(2000);
		 * 
		 * WebElement to = wd.findElement(By.xpath(
		 * "//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")) ;
		 * to.sendKeys("Del");
		 * 
		 * 
		 * Thread.sleep(2000); WebElement date =
		 * wd.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")) ;
		 * date.sendKeys("18/05"); // date.sendKeys(Keys.TAB);
		 * 
		 * 
		 * WebElement search =
		 * wd.findElement(By.id("ctl00_mainContent_btn_FindFlights")) ;
		 * 
		 * search.click();
		 */	
		
	    WebElement flightnumber = wd.findElement(By.xpath("//span[contains(text(),'SG 8152')]"));
	    
	    String f_number = flightnumber.getText();
	    
	    
	    
	    
	    
	    
	}




}

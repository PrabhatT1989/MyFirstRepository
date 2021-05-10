package DataDrivenTestingPackAge;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting 

{
	WebDriver wd ; 
	String driverpath = "F:\\Chrome Driver\\Chrome Driver 89\\chromedriver.exe";
	String url = "https://www.facebook.com/" ;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", driverpath) ; 
		wd = new ChromeDriver() ; 
		wd.get(url);
		
		
	}
	
	@DataProvider(name = "loginCredentials")
	public static  Object[][] loginCredentials()
	{
		Object ob[][] = {
		
				{ "abc","123"},
				{"Prabhat.Tavag@yahoo.com" ,"Tester@123"} 
				
		};
		return ob ;
		
	}
	
	@Test(dataProvider = "loginCredentials")
	public void checkCredentials(String username , String password)
	{
		wd.findElement(By.id("email")).clear();;
		wd.findElement(By.id("email")).sendKeys(username);
		
		wd.findElement(By.id("pass")).clear();;
		wd.findElement(By.id("pass")).sendKeys(password);
		WebElement loginbutton = wd.findElement(By.id("u_0_d_6Y"));
		JavascriptExecutor js = (JavascriptExecutor) wd; 
		
		js.executeScript("arguments[0].click()", loginbutton);
	
	}
		
		
		
	
	
	@AfterMethod
	public void tearDown()
	{
		
	wd.manage().deleteAllCookies();
	}

}

package SampleTestPrograms;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ActionsDemo 
{
	public static WebDriver wd;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\Chrome Driver 90\\chromedriver.exe");
		
		wd= new ChromeDriver();
		wd.get("https://www.guru99.com/");
		
		wd.manage().window().maximize();
	}

	@Test(priority =  2 ,testName = "Action Demo")
	public void actionsDemo() throws Exception
	{
		
		  Thread.sleep(2000);
		 
		  WebElement hover = wd.findElement(By.xpath("//span[@class='g-menu-item-title' and contains(text(),'Web')]"));
		 Actions a= new Actions(wd); a.moveToElement(hover).perform();
		  
		 
		  wd.findElement(By.xpath("//span[@class='g-menu-item-title' and contains(text(),'Linux')]")).click();
		  
		Thread.sleep(1000) ;
		 
		
	
	
	
	}
	
	@AfterMethod
	public void tearDown()
	{
		wd.manage().deleteAllCookies();
	}
}

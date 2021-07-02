package XpathPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		List<WebElement> li =  wd.findElements(By.xpath("//*[contains(text(),'Dhanuka Agritech Ltd')]/parent::td/parent::tr/child::td"));
		
		String data = li.get(2).getText();
		
		
			System.out.println("List of web elements :: " +data);
		
	}

}

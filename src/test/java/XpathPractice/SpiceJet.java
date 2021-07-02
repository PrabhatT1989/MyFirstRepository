package XpathPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpiceJet {
	
	WebDriver wd ;
	String driverpath = "F:\\Chrome Driver\\Chrome Driver 90\\chromedriver.exe" ;
	
	//String firefoxdriverpath = "G:\\Mozilla Firefox Driver\\Gecko Driver\\geckodriver.exe" ; 
	
	String url = "https://book.spicejet.com/Select.aspx";
	
	@Test
	public void spicejetDynamicXpath()
	{
		System.setProperty("webdriver.chrome.driver", driverpath) ; 
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get(url);
		
		List<WebElement> li =  wd.findElements(By.xpath("//span[contains(text(), 'SG 8152')]/ancestor::td[@class='farerow-first-td']/parent::tr/td"));
		
		String spicejetrate = li.get(2).getText();
		
		System.out.println("Spicejet rates :: " +spicejetrate);
		
	}

}

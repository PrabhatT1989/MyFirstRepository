package InterviewQuestionsPractice;

import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Background;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetBackGroundColor

{
	
	String driverpath = "F:\\Chrome Driver\\Chrome Driver 91\\chromedriver.exe" ;
	
	String url ="https://www.apachefriends.org/index.html" ;
 

	WebDriver wd ;
	
	
	
	public String getBackgroundcolor(WebElement we)
	{
		
		String color = we.getCssValue("background-color");
		return color ; 
	}
	@Test
	public void bgColorTest()
	{
		System.setProperty("webdriver.chrome.driver", driverpath) ; 
		wd = new ChromeDriver() ;
		
		wd.get(url);
		
	WebElement we= wd.findElement(By.xpath("//div[@class='hero']"));
	
	 String color = we.getCssValue("color");
		
	getBackgroundcolor(we);
	
	System.out.println("background color of the webpage ::" +color);
	
	
	
	wd.navigate().to("http://www.google.com");
	wd.navigate().back();
	wd.navigate().forward();
	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	wd.manage().timeouts().pageLoadTimeout(0, null)
	
	}
}

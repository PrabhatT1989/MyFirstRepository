package SampleTestPrograms;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssertDemo 
{
	WebDriver  wd ;
	
	@Test(priority =1)
	public void test1()
	{ 
		SoftAssert softassert = new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "F:\\Chrome Driver\\Chrome Driver 90\\chromedriver.exe");
		
		wd= new ChromeDriver();
		wd.get("https://www.guru99.com/");
		
		wd.manage().window().maximize();
		
		String title = wd.getTitle() ; 
		System.out.println("Title :: " + title);
		String exp = "Meet Guru99 - Free Training Tutorials & Video";
	 
		softassert.assertEquals(title, exp);
		
		if(title.equals(exp))
		{
		System.out.println("Hard assert is Passed");
		}
		else
		{
			System.out.println("Hard assert is failed");
		}
		softassert.assertAll();
		
	}
}

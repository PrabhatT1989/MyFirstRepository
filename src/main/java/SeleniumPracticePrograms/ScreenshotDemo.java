package SeleniumPracticePrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotDemo {
	
	
	float f = 20.23f;
	int x = (int) f; 
	float y = x ;
	
	
	WebDriver wd ;
	String driverpath = "F:\\Chrome Driver\\Chrome Driver 91\\chromedriver.exe" ;
    String url = "https://www.google.com/";	 
    
	
	
	String screenshotspath = "F:\\Chrome Driver\\Chrome Driver 91" ; 
	 
	public void typeCasting()
	{
		
		System.out.println("The value of x after downcasting   " + x);	
		
		System.out.println("After Widening casting the value of y :: " + y );
	}
	
	public void takeScreenshot() throws Exception
	{
	
		
		TakesScreenshot ts = (TakesScreenshot) wd;
		
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		
		File destfile = new File(screenshotspath) ;
		
		FileUtils.copyFile(srcfile, destfile);
		
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		ScreenshotDemo ss = new ScreenshotDemo();
		ss.typeCasting();
		
		ss.takeScreenshot();
	}

}

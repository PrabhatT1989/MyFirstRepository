package SeleniumPracticePrograms;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import org.openqa.selenium.WebDriver;

public class ScreenshotPrac
{
	WebDriver wd ;
	String driverpath = "F:\\Chrome Driver\\Chrome Driver 91\\chromedriver.exe" ;
String url = "https://www.google.com/";	
	
public ScreenshotPrac() throws Exception {

	Robot robot =  new Robot();
Rectangle rect =  new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

BufferedImage bi = robot.createScreenCapture(rect);
File f = new File("F:\\Chrome Driver\\Chrome Driver 91");


}

}

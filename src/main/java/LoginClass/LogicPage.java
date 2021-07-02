package LoginClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LogicPage {
	
	public static WebDriver wd ;
	
	@FindBy (id = "toc-link")
    @CacheLookup
    WebElement termsandconditions;
	

	@FindBy (id = "mydocpdf")
    @CacheLookup
    WebElement downloadmydocpdf;
	
	@FindBy (id = "error")
    @CacheLookup
	public  WebElement errormsg;
	
	@FindBy (id = "accept")
    @CacheLookup
	public  WebElement Accept;
	
	@FindBy (id = "reject")
    @CacheLookup
	public  WebElement Reject;
	
	
	
	
	
	
	
	
	String errormessage ; 
	public LogicPage()
	{
		PageFactory.initElements(wd,this);
	}
	
	public void click_On_downloadmydocpdf_Without_AcceptingTnC()
	{
		downloadmydocpdf.click();
		 errormessage = errormsg.getText();
		
	}

	public void accept_Terms_And_Conditions()
	{
		String main_windowhandle = wd.getWindowHandle();
		System.out.println("Main Window Handle ::" + main_windowhandle);
		
		termsandconditions.click();
		
		Select s = new Select(termsandconditions);
		
		
		downloadmydocpdf.click();
		
		String sub_windowhandles = wd.getWindowHandle();
		System.out.println("Sub Window Handle ::" + sub_windowhandles);
		
		}
	
	  public void getWindowHandle() { 
		  String main_windowhandle =  wd.getWindowHandle(); 
		  
		  System.out.println("Main Window Handle ::" + main_windowhandle);
	  
	  //Set<String> get_window_handle = wd.getWindowHandles();
	 
	  }
	  
	  public void getWindowHandle_OfAllWindows()
	  {
		  Set<String> allWindowHandles = wd.getWindowHandles();
	        Iterator<String> iterator = allWindowHandles.iterator();
	        
	        System.out.println("List of window handles " + iterator);
	  }
	 
	 public void i_Accept()
	 {
		 termsandconditions.click();
			downloadmydocpdf.click();
			
		 wd.switchTo().window("child_windowhandle");
		 Accept.click();
		 
		 
		 wd.switchTo().window("main_windowhandle");
		 downloadmydocpdf.click();
		 
		 
	 }
	 
	 
	 public void i_Reject() 
	 {
		 
		 
	 }
}

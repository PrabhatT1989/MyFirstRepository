package SampleTestPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class SetAndArrrayList 
{
 WebDriver wd ;
  
  
	public void arraylistAndSetDemo()
	{
		
		 List<String> li = new ArrayList<String>();		  
		  Set<String> set = new HashSet<String>() ;
		  
		li.add("a");
		li.add("a");
		li.add("b");
		li.add("c");
		li.add("c");
		
		li.add("r");
		System.out.println("ArrayList : " + li);
		
		li.remove(2);
		
		wd.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		wd.manage().timeouts().pageLoadTimeout(50, null);
		
		set.addAll(li);
		System.out.println("Set :: " + set );
		
		
		 //Set<String> set2 = new HashSet<String>(li) ;
//		  System.out.println("Set2 :: " + set2 );
		
			/* Another way to print list/set */
//		for(String s:set) {
//			System.out.println("s-->"+s);
//		}
//		for(String s:li) {
//			System.out.println("li-->"+s);
//		}
		
	}
	
	
	public static void main(String args[])
	{
		SetAndArrrayList sal = new SetAndArrrayList();
		
		sal.arraylistAndSetDemo();
		
	}
	
}

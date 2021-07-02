package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 
{
	public void arraylistDemo() 
	{
ArrayList al1 = new ArrayList();

	al1.add("Mumbai University");
	al1.add("Boston University");
	al1.add("Micigan University");
	
	ArrayList<String> al2 = new ArrayList<String>(al1);
	al2.add("Walking Dead");
	al2.add("Famil Man");
	System.out.println(al2.containsAll(al1));;
	
	
	for (Object s : al1)
	{
		System.out.println("ArrayList :: " + s);
		
	}
	
	
	Iterator<String> i = al2.iterator();
	while(i.hasNext())
	{
		System.out.println("Using iterator :: " + i.next());
		
	}
	
	
	
	
	}
	
	
	
	
	
	public static void main(String args[])
	{
		
		ArrayList2 array = new ArrayList2();
		array.arraylistDemo();
		
	}
}

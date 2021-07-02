package CollectionsDemo;

import java.util.ArrayList;

public class AlAddingOneCollection 
{
	
	ArrayList al1  = new ArrayList();
	
	ArrayList al2  = new ArrayList();
	
	
	public void arralistDemo()
	{
		al1.add("Prabhat") ;
		al1.add("Samir");
		al1.add("Vikas");
		
		
		al2.add(null);
		al2.add("45.25");
		al2.add(200);
		
		al2.addAll(al1); 
		
		
		
		System.out.println("Items in ArrayList 2 after adding items of Arraylist 1::  " +al2);
		
		al2.clear();
		System.out.println("After clearing all the items from al2 :: " + al2);
		
	
	}

	
}

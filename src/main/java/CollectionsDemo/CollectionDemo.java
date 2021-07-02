package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	Collection c= new ArrayList() ;
	Collection c1= new ArrayList() ;
	
	
	public void collectionDemo()
	{
		
	c.add("ratan");
	c.add("Prabhat");
	c.add(null);
	c.add("10.28588");


	System.out.println("The status  before adding objects  to  C1 :: " +c1);
	
	
	System.out.println("After adding all the elements of Collection c into c1 :: ");
	
	c1.addAll(c); 

	System.out.println(c1);
	
	System.out.println(c);
	
	boolean collection_c1 = c1.contains(null);
	System.out.println("Collection c1 contains null object or not :: " + collection_c1);
	
	boolean c1_elements= c.removeAll(c1); 
	
	System.out.println("After removing all the elements from c1 : " + c1_elements);
	
	System.out.println("Elements in C1" + c1);
	System.out.println("Elements in C" + c);
	
	}
	
	public static void main(String[] args) 
	{
		CollectionDemo  obj = new CollectionDemo();
		obj.collectionDemo();
		
	}

}

package CollectionsDemo;

import java.util.ArrayList;

public class ArraylistDemo1

{
	
	// 2- methods to add collection elements
	
	ArrayList<String> al = new ArrayList<String>() ; 
	public void addcollection()
	{
		
		al.add("Ratan") ; 
		al.add("DurgaSoft") ; 
		

		ArrayList  al2 = new ArrayList(al) ; 
		al2.add("Prabhat") ;
		al2.add("Ayush");
		
		System.out.println("Arraylist 2 :: " + al2);
		
		System.out.println("al2 contains Prabhat ?? " + (al2.contains("Prabhat"))) ;
		
		System.out.println("al2 contains elements of al??  " + (al2.containsAll(al))); ;
		
		al2.removeAll(al);
		System.out.println("After removing the contents of al :: " + al2);
		
		System.out.println("After retainining all the elements of al - collection :: " + (al2.retainAll(al)));;
	
		for (Object oo : al2)
		{
			System.out.println("After retianaing elelemnts of al into al2 :: " + oo);
		}
		
	}
	
	
	public static void main(String args[])
	{
		ArraylistDemo1 ad = new ArraylistDemo1();
		ad.addcollection();
		
	}

}

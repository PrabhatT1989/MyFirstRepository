package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistBasicOperations 
{
	
	ArrayList al ;
	
	public void arraylistBasicOperations()
	{
		al= new ArrayList();
		/*
		 * al.add(10); al.add(15.879); al.add("Prabhat");
		 * 
		 * al.add(null);
		 * 
		 * al.add(3, "Ratan Sir"); al.add(3, "Durga");
		 */
	//	System.out.println(al);
		
		//boolean b = al.isEmpty() ; 
		//System.out.println(al.remove("Durga"));
		
	//	al.set(3, "Durga");
		
	
		/*
		 * al.remove(40);
		 * 
		 * 
		 * for (Object o : al) {
		 * 
		 * System.out.println("The elements in the arraylist :: " + o); }
		 * 
		 * Iterator i = al.iterator() ;
		 * 
		 * while(i.hasNext()) { System.out.println("iterated using Iterator class :: "+
		 * i.next());
		 */
		//  al.add(new Employee(112 , "Kuldeep"));
		  
		  al.add(new Student(111,"Samir"));
			System.out.println(al);
		  
		
			
			
			
		for(Object o : al)
		{
			
		    
      //  System.out.println(o instanceof Employee);
        
        System.out.println(o instanceof Student);
			
			/*if(o instanceof Employee) 
			{
				Employee e = (Employee)o ; 
				
				System.out.println("Employee class object :: " +e.eid);
				System.out.println("Employee class object :: " +e.ename);
				
			}*/
			
			
			 if(o instanceof Student)
			{
				Student s = (Student)o ;
				
				System.out.println("Student class obejct :: " +s.sid);
				System.out.println("Student class obejct :: " +s.sname);
			
			}
			
			
		}
			
		  }
		 
		
		
		
	

public static void main(String args[])
{
	
	ArraylistBasicOperations ao = new ArraylistBasicOperations();
	
	ao.arraylistBasicOperations();

}

}


package CollectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {
	
	
	
	
	public static void main(String args[])
	{
		ArrayList al =  new ArrayList();
		Student s = new Student();
		Employee e = new Employee();
	
	//	al.add(new Student(10, "Prabhat"));
	  //  al.add(new Employee(15, "Satish"));
	    
		al.add(s);
		al.add(e);
		
		al.add(null);
	    
	    al.add("Ratan Sir");
	    al.add(10);
	    
	    
	System.out.println(al);
	
	}
}

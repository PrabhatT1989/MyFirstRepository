package StringPrograms;

public class StringDemo {
	
	String s1 = "Ratan" ; 
	
	String s2 = "Durga" ; 
	
	Object o = "Suzuki" ; 
	
	String s3 = "Suzuki";
	
	StringBuffer sb = new StringBuffer("Yamaha") ; 
	
	StringBuffer sb1 = new StringBuffer("Ratan") ; 
	
	Integer i = new Integer(20);
	
	public void stringComparison()
	{
		
		System.out.println("Comparison of sb and sb1 references"  +(sb==sb1));
		
		System.out.println("Comparison of s1 and s2 references"  +(s1==s2));
		
		//incompatible operand types
		// System.out.println("Comparison of s1 and sb1 references"  +(s1==sb1));
		
		System.out.println("Comparison of o and s3 references"  +(o == s3));
		

		System.out.println("Comparison of o and sb references"  +(o == sb));
		
		//incompatible operand types
		//System.out.println("Comparison of o and sb references"  +(i == s1));
		
		
		
	}
	
	public static void main(String args[])
	{
		StringDemo sd = new StringDemo();
		
		sd.stringComparison();
		
	}
	
	
	

}

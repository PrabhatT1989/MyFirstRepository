package AbstractDemo;

public  class AbstractChild extends AbstractDemo 
{
	int x = 20 ;
	int y = 10 ;
	int z ;
	float fl = 150.85f ;
	
	

	@Override
	public void calculate() 
	{
		
		z= x+y ; 	
		System.out.println("Addition of x and y :: " +z);
	   
	     int typecasted  = (int) fl ;
	     System.out.println("Typecasted value :: " + typecasted);
	
	}

	@Override
	protected void m2() 
	{
		z= x-y ; 	
		System.out.println("Addition of x and y :: " +z);
		
	}

	@Override
 public	void m4() {
		z= x*y ; 	
		System.out.println("Addition of x and y :: " +z);
		
	}

	public static void main(String args[])
	{
	AbstractDemo ad = new AbstractChild() ;
	ad.calculate();
	
	}
	
	
}

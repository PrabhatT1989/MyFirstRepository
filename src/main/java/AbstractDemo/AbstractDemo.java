package AbstractDemo;

abstract  class AbstractDemo 
{
	
	abstract public void calculate();
	
	private int x;
	public void m1()
	{
	 System.out.println("Concrete Method M1 :: "+ x);
	
	}

	
	abstract protected void m2() ;
	private int y= 10;
	
	private  void m3()
	{
		System.out.println("M2 method :: " +y);
	
	}
	
	abstract void m4();
	
	AbstractDemo() {
	}
	
	
	
}

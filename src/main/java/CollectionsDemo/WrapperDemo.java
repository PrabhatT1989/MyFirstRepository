package CollectionsDemo;

public class WrapperDemo {

	Integer i = new Integer("10");
	
	Float f = new Float("10.02f");
	
	Double d = new Double(144.08);
	
	Boolean b = new Boolean(true);
	
	public void m1()
	{
		System.out.println(f);
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
		
	}

public static void main(String args[])

{
	WrapperDemo wd = new WrapperDemo();
	wd.m1();

}


}

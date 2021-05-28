package CollectionsDemo;

public class StaticDemo 
{

	static int x;
	
	final int y = 0;
	
	public void m1(int x)
	{
		StaticDemo.x = x ;
		
	
	}
	
	public static void main(String args[])
	{
		StaticDemo s = new StaticDemo();
		System.out.println(s.y);
	}
	
}

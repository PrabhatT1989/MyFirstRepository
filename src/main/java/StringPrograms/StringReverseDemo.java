package StringPrograms;

public class StringReverseDemo 
{
	
	String str = "abc";
public void reverseDemo() throws Exception
{

	
	
	
	char[]  ch = str.toCharArray();
	
	for (int i=ch.length-1 ; i>=0 ; i--)
	{
		
		
		System.out.print(ch[i]);
	}
	
	
}
	
	
	public static void main(String args[]) throws Exception
	{
		StringReverseDemo srd = new StringReverseDemo();
		
		srd.reverseDemo();
		
	}
}

package SampleTestPrograms;

public class InvertedPyramid {
	
	public void invertedPyramid()
	{
		for(int i=0;i<= 5 ; i++)
			
		{
			
			for(int j=0;j<=5 ; j++)
			{
				System.out.print(" ");
			}
			
		for(int k=5; k>=1  ;k-- )
		{
			System.out.print("*");
		}
			
		System.out.println("\n");
		}
		
	}	
			
public static void main(String args[])
{
	InvertedPyramid ip = new InvertedPyramid();
	ip.invertedPyramid();
		
}
	
}	


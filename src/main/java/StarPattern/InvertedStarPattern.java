package StarPattern;

public class InvertedStarPattern {

	public void invertedStarPattern()
	{
		for(int i = 1; i<=5 ; i++)
		{
			for(int j=4 ; j>=i ; j--)
			{
				System.out.print(" ");
			}
			
		for(int k=1 ; k<=i ; k++)
		{
			
			System.out.print("*");
			
		}
		System.out.println("\n");
		}
			
	}
	
	public void invertedDownStar()
	{
		for(int i=0;i<=4;i++)
		{
		for(int j=0;j<=i;j++)	
		{
			System.out.print(" ");
		}	
			for(int k=4;k>=i ;k--)
			{
				System.out.print("*");
			}
		System.out.println("\n");
		}	
	}
		
	
	
	public static void main(String[] args) {
		
		InvertedStarPattern isp = new InvertedStarPattern();
		//isp.invertedStarPattern();
	 isp.invertedDownStar();
	
	}

}

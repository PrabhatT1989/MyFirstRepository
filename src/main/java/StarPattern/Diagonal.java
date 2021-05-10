package StarPattern;

public class Diagonal {
	

	public void diagonalStar()
	{
		for(int i=0;i<=5 ; i++)
		{
			for(int j=0;j<=i; j++)
			{
				System.out.print(" ");
			}
			
        for(int k=1 ; k<=1 ;k++)
        {
System.out.print("*");
        }
		
        System.out.println("\n");
			}
		}
	
	public void invetedDiagnalStar()
	{
		
		System.out.println("\n");
		System.out.println("================================");
		
		for(int i=0 ; i<=5 ; i++)
		{
			for(int j=5 ; j>=i ; j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=1 ; k++)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	
	
	public static void main(String args[])

	{
		
		Diagonal d =  new Diagonal();
		d.diagonalStar();
		
		d.invetedDiagnalStar();
		
	}
}

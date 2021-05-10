package StarPattern;

public class FirstProgram 
{
	
	
	  public void basicStarPattern() 
	  { 
		  for (int i=0;i<=4 ;i++) 
	      {
		  for(int j=0;j<=i;j++) 
	        { 
	    	  System.out.print("*");
	        } 
	      
	      
	      System.out.println("\n");
	        
	      }
	   }
	 
	public void secondInvertedBasicPatter()
	{
		//System.out.println("----------------------------------------");
		for(int i=1 ; i<=4;i++)
		{
			
			for(int j=4 ; j>=i ; j--)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	
	
	

	public static void main(String args[])
	{
		FirstProgram fp = new FirstProgram();
		fp.basicStarPattern();
		
		//System.out.println("----Next inverted basic program ----------");
		
		fp.secondInvertedBasicPatter();
		
	}
}

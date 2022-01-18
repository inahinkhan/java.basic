package Pattern;

import java.util.Scanner;

public class P1 
{
	public static void main(String[] args) 
	  {
		Scanner input=new Scanner(System.in);
	
	
	 	
	 	   System.out.print("Enter Line Number  : ");
	 	   int l=input.nextInt();
	 		int r=1,c=1;
	 		
	 		for(r=1;r<=l;r++)
	 		{
	 			for(c=1;c<=r;c++)
	 			{
	 				System.out.print("\t"+c);
	 		    }
	 			
	 		  System.out.println();
			   
	 		
	 	 }
	 	 
	 	    
	  }

}

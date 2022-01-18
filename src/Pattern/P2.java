package Pattern;

import java.util.Scanner;

public class P2
{
    public static void main(String[] args) 
      {
    	Scanner input=new Scanner(System.in);
    	
    	
	 	
	 	   System.out.print("Enter Alphabet  : ");
	 	   char l=input.next().charAt(0);
	 		char r='a',c='a';
	 		for(r='a';r<=l;r++)
	 		{
	 			for(c='a';c<=r;c++)
	 			{
	 				System.out.print("\t"+c);
	 		    }
	 			
	 		  System.out.println();
			   
	          }
      }
    
    }


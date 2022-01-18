package Pattern;

import java.util.Scanner;

public class P3 
{
       public static void main(String[] args) 
         {
    	         Scanner input=new Scanner(System.in)  ;
    	            System.out.println("Enter a Number");
    	            int n=input.nextInt();
    	            int c=1,r=1;
    	            for(r=n;r>=1;r--)
    	            {
    	            	for(c=1;c<=r;c++)
    	            	{
    	            		System.out.print("\t"+c);
    	            	}
    	            	System.out.println();
    	            }
	     }

}

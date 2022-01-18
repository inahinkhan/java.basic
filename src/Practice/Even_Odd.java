package Practice;

import java.util.Scanner;

public class Even_Odd
{
     public static void main(String[] args)
        {
		               Scanner input=new Scanner(System.in);
		               System.out.println("Enter value: ");
		                   int N=input.nextInt();
		                   if(N%2==0)
		                   {
		                	   System.out.println("EVEN");
		                   }
		                   else 
		                   {
		                	   System.out.println("ODD");
		                   }
		                 input.close();
	    }
}

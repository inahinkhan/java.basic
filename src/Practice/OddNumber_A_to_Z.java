package Practice;

import java.util.Scanner;

public class OddNumber_A_to_Z
{
       public static void main(String[] args)
         {
		         Scanner input=new Scanner(System.in);
		         System.out.print("Enter starting number: ");
		         int startA=input.nextInt();
		         System.out.print("Enter ending number: ");
		         int endZ=input.nextInt();
		        System.out.println("Odd Number are : ");
		         for(int i=startA;i<=endZ;i++)
		         {
		        	 if(i%2!=0)
		        	 {
		        		 System.out.println(i);
		        	 }
		        	 
		         }
    	}
}

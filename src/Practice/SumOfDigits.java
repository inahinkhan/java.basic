package Practice;

import java.util.Scanner;

public class SumOfDigits
{
         public static void main(String[] args)
           {
        	 int sum=0;
		         Scanner input=new Scanner(System.in);
		         System.out.println("Enter Number[Integer] to add input: ");
		         int N=input.nextInt();
		         System.out.println("Enter data: ");
		         for(int i=1;i<=N;i++)
		         {
		        	 int data=input.nextInt();
		        	 sum+=data;
		         }
		         System.out.println("Summation of data: "+sum);
		   }
}

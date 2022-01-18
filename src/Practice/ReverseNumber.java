package Practice;

import java.util.Scanner;

public class ReverseNumber 
{
    public static void main(String[] args)
     {
	        int i;
	        Scanner input=new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int N=input.nextInt();
	        
	         for(i=N;i>=1;i--)
	         {
	        	 System.out.println(i);
	         }
     }
}

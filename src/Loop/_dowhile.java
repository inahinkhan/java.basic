//do while loop in java


package Loop;

import java.util.Scanner;

public class _dowhile
{
     public static void main(String[] args)
       {
    	   Scanner input=new Scanner(System.in);
    	   System.out.println("Enter 1st value");
	          int Data=input.nextInt();
	          System.out.println("Enter 2nd value");
	          int End=input.nextInt();
	          System.out.println("Numbers are:");
	          do          // Excuite 1st time into use  do key
	          {
	        	 System.out.println(Data); 
	        	 Data--;
	        	
	          }while(Data>=End);     //condition in while 
	   }
}

//While Loop in java

package Loop;

import java.util.Scanner;
public class _while
{
     public static void main(String[] args)
        {
		      Scanner input=new Scanner(System.in);
		      System.out.print("Enter Starting integer value: ");
		      int Start=input.nextInt();
		      System.out.print("Enter Ending integer value: ");
		      int End=input.nextInt();
		      int Sum=0;
		      int Multiple=1;
		      System.out.println("Integer Numbers are: ");
		      while(Start<=End)       //use while key for condition 
		      {
		    	  System.out.println(Start);
		    	  Sum=Sum+Start;
		    	  Multiple=Multiple*Start;
		    	  Start++;
		    
		      }
		      System.out.println("Summation is those numbers: "+Sum);
		      System.out.println("Multiplication is those numbers: "+Multiple);
		      input.close();
    	}
}

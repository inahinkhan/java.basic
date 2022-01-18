//if statement in java program

package FlowControl;

import java.util.Scanner;

public class C1_if
{
     public static void main(String[] args) 
        {
		      Scanner input=new Scanner(System.in);
		      System.out.print("Enter a number: ");
		      int data=input.nextInt();
		      if(data>0)
		      {
		    	  System.out.println(data+" is positive number.");
		      }
		      if(data<0)
		      {
		    	  System.out.println(data+" is negative number.");
		      }
    	}
}

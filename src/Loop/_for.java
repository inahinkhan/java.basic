//for Loop in java Program

package Loop;

import java.util.Scanner;
public class _for
{
        public static void main(String[] args) 
        {
			 Scanner input=new Scanner(System.in);
        	 int Start,End;
        	 System.out.print("Enter Starting integer value: ");
        	 Start=input.nextInt();
        	 System.out.print("Enter Ending integer value: ");
        	 End=input.nextInt();
        	    System.out.println("Integer Numbers are: ");
        	    
			    for(int I=Start;I<=End;I++)   // initialize;conditin;increment/decrement
			    {
			    	System.out.println(I);
			    }
			    input.close();
		}
}

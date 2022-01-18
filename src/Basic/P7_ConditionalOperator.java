//Conditional operator in java

package Basic;

import java.util.Scanner;

public class P7_ConditionalOperator
{
    public static void main(String[] args)
    {
		 Scanner input=new Scanner(System.in);
		 System.out.println("\t\tINPUT\n");
		   System.out.print("Enter 1st Number: ");
	          int frist=input.nextInt();
	          System.out.print("Enter 2nd Number: ");
	          int second=input.nextInt();
	         
	         int max=(frist>second)?frist : second;       //use cinditional operator
	         int min= (frist>second)?second : frist;       //use cinditional operator
	         System.out.println("\n\t   OUTPUT\n");
	         int count=1;
	         while(count==1)       //use while loop
        	  {
	        	 if(max==min)
                       {
        	                   System.out.println("\n!Number are equal");
        	                   count++;
        	              
                       }
	        	 else {
	        		 System.out.println("Maximum Number is: "+max);
	    	         System.out.println("Minimum number is: "+min);
	    	   count++;
	        	 }
        	  }
	         
	        input.close();
	         
	        
	}
}

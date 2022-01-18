package Practice;

import java.util.Scanner;

public class MultiplicationTable 
{
    public static void main(String[] args)
      {
    	Scanner input=new Scanner(System.in);
    	System.out.print("Enter Number: ");
    	int multiply=1;
    	int N=input.nextInt();
    	System.out.println("Multiplication table of "+N+" : ");
	          for(int i=1;i<=10;i=i+1)	
	          {
	        	 
	        	  multiply=N*i;
	        	  
	        	  System.out.println(N+ " x "+i +" = "+multiply);
	        	  
	          }
	          input.close();
	        
	          
	  }
}

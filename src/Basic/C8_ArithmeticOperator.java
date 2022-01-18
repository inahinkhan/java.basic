//Arithmetic operator in java

package Basic;

import java.util.Scanner;

public class C8_ArithmeticOperator
{
       public static void main(String[] args) 
         {
		         //Arithmetic operator-- +,-,*,/,%
    	   Scanner input=new Scanner(System.in);
    	   System.out.print("Enter 1st Number: ");
    	      int No1=input.nextInt();
	   	   System.out.print("Enter 2nd Number: ");
 	           int No2=input.nextInt();
 	           
 	       System.out.println("\n\tAnswer: \n");    
 	       System.out.println("Sum of  two number: "+(No1+No2));
 	       System.out.println("Sub of  two number: "+(No1-No2));
 	       System.out.println("Multiply of  two number: "+(No1*No2));
 	       System.out.println("Devided of  two number: "+(No1/No2));
 	       System.out.println("Reminder of  two number: "+(No1%No2));

 	   input.close();
    	      
	     }
}

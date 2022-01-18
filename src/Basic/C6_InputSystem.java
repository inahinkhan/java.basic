//User input system in java programming

package Basic;

import java.util.Scanner;
public class C6_InputSystem
{
      public static void main(String[] args)
       {
    	       
    	       System.out.println("\n\t\t\tUpdate Profile\n");
	           Scanner input=new Scanner(System.in);       //Getting user  input 
	         
	           System.out.println("Enter your Name: ");
	           String name=input.nextLine();     //get string type input 
	           System.out.println("Enter your Age: ");
		       int age=input.nextInt();      //get in type input
	           input.nextLine();
	           System.out.println("Enter your hometown: ");
	           String  city=input.next();
	           System.out.println("Enter your Phone number: ");
	           int phone=input.nextInt();
	           
	           
	           //Printing 
	           System.out.println("\n\t\t\tPROFILE\n");
	           System.out.println("Name: "+name);
	           System.out.println("Age: "+age);
	           System.out.println("Hometown: "+city);
	           System.out.println("Phone No: +880 "+phone);
	           input.close();
	   }
}

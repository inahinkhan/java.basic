package Practice;

import java.util.Scanner;

public class Vowel_Consonent
{
     public static void main(String[] args) 
       {
    	    Scanner scan =new Scanner(System.in);
    	    System.out.println("Enter Alphabet: ");
	         char Alpha=scan.next().charAt(0);	
	         if(Alpha=='a' || Alpha=='e' || Alpha=='i' || Alpha=='o' || Alpha=='u' ||
	        		 Alpha=='A' || Alpha=='E' || Alpha=='I' || Alpha=='O' || Alpha=='U')
	         {
	        	 System.out.println("Vowel");
	         }
        	 else
        	 {
        		 System.out.println("Consonent");
        	 }
	         scan.close();
	        
	         
	   }
}

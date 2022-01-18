//Logical operator in java

package Basic;

import java.util.Scanner;

public class P2_LogicalOperator
{
     public static void main(String[] args) 
     {
		
    	 Scanner input=new Scanner(System.in);
    	 System.out.println("Enter any alphabet: ");
    	 char letter=input.next().charAt(0);
    	 
    	// Logical OR operator--  ||
    	 
    	 if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u' ||
    		letter=='A' || letter=='E' || letter=='I' ||letter=='O' || letter=='U')
    	 {
    		 System.out.println("VOWEL");
    	 }
    	 else
    	 {
    		 System.out.println("CONSONENT");
    	 }
    	 
    	 
    	 //Logical AND Operator--   &&
    	 if(letter>='a' && letter<='z')
    	 {
    		 System.out.println("small");
    	 }
    	 else if (letter>='A' &&letter<='Z')
    	 { 
    		 System.out.println("BIG");
    	 }
    	 
    	 //Logical NOT-- !=
    	 int a=10;
    	 int b=10;
    	 System.out.println(a!=b);
         
    	 input.close();
    	 
    	 
    	 
	}
}

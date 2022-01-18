//if else statement using java

package FlowControl;

import java.util.Scanner;

public class C2_ifelse
{
	 public static void main(String[] args)
     {
		        Scanner input=new Scanner(System.in);
		           System.out.println("Enter any Alphabet: ");
		           char A=input.next().charAt(0);
		           if(A>='a' && A<='z')
		           {
		        	   if(A=='a' || A=='e' || A=='i' || A=='o' || A=='u') 
		        	   {
		        		   System.out.println("Vowel");
		        	   }
		        	   else
		        	   {
		        		   System.out.println("Consonent");
		        	   }
		        		   System.out.println("small Letter");
		           }
		           if(A>='A' && A<='Z')
		           {
		         	   if(A=='A' || A=='E' || A=='I' || A=='O' || A=='U') 
		        	   {
		        		   System.out.println("Vowel");
		        	   }
		        	   else
		        	   {
		        		   System.out.println("Consonent");
		        	   }
		        	   System.out.println("Big Letter");
		           }
		           input.close();
 	}
}

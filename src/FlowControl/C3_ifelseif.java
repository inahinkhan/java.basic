//if, else if ,else statement using java


package FlowControl;

import java.util.Scanner;

public class C3_ifelseif 
{
        public static void main(String[] args)
        {
        	Scanner input=new Scanner(System.in);
        	System.out.println("Enter any alphabet: ");
			 char data=input.next().charAt(0);
			 if(data>='a'   &&  data<='z')
			 {
				 System.out.println("small");
			 }
			 else if(data>='A'   &&  data<='Z')
			 {
				 System.out.println("BIG");
			 }
			 else
			 {
				 System.out.println("Not an Alphabet");
			 }
		}
}

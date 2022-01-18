//Use math class fo java programming language


package Basic;

import java.util.Scanner;

public class P4_MathClass
{
        public static void main(String[] args) 
           {
        	   Scanner input=new Scanner(System.in);
        	   System.out.print("Enter 1st Number: ");
		          int frist=input.nextInt();
     	      System.out.print("Enter 2nd Number: ");
		          int second=input.nextInt();
		          
		          int max=Math.max(frist, second);
		          int min=Math.min(second, frist);
		          System.out.println("Maximum:  "+max);
		          System.out.println("Minimum:   "+min);
		          input.close();
		          int multyply=Math.multiplyExact(frist, second);
		          System.out.println(multyply);
		          int ok=Math.abs(second);
		          System.out.println(ok);
		   }
}

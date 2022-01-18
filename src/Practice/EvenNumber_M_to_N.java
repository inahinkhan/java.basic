package Practice;

import java.util.Scanner;

public class EvenNumber_M_to_N
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
	    System.out.println("Enter value M: ");
	    int M=input.nextInt();
	    System.out.println("Enter value N: ");
	    int N=input.nextInt();
	    int v=input.nextInt();
	    while(M<=N) {
	       if(v%2==0)
	        {
	     	   System.out.println("EVEN");
	        }
	        else 
	        {
	     	   System.out.println("ODD");
	        }
	    }
	    M++;
	      input.close();
		
	}
    

}

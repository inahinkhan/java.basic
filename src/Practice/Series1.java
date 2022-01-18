package Practice;
import java.util.*;
public class Series1
{
       public static void main(String[] args)
         {
    	   Scanner input=new Scanner(System.in);
    	   System.out.print("Enter the size of data");
    	   int size=input.nextInt();
		    int[] number=new int[size];
		    System.out.print("Enter data: ");
		    for(int i=0;i<=size;i++)
		    {
		    	number[i]=input.nextInt();
		    	System.out.print("Odd number: ");
		    	
		    	if(number[i]%2==0)
		    	{
		    		System.out.println("Even Number: "+number[i]);
		    	}
		    	System.out.print("Odd number ");
		    	if(number[i]%2!=0)
		    	{
		    		System.out.println(" "+number[i]);
		    	}
		    }
		    
	     }
}

package Practice;

import java.util.Scanner;

public class AverageArrray
{
     public static void main(String[] args)
     {
    	 Scanner input=new Scanner(System.in);
    	 System.out.println("Enter elments number: ");
    	 int  N=input.nextInt();
    	 int sum=0;
    	 System.out.println("Elements are: ");
    	    int[] A=new int[N];
    	    for(int i=0;i<N;i++)
    	    {
    	       A[i]=input.nextInt();
    	       sum=sum+A[i];
    	    }
    	    System.out.println("Avg: "+(sum/N));
    	   
	 }
}

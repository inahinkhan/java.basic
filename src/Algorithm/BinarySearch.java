package Algorithm;

import java.util.Scanner;



public class BinarySearch
{
       public static void main(String[] args)
          {
    	  
		        Scanner input=new Scanner(System.in);
		        System.out.println("Test Case: ");
	    	       int C=input.nextInt();
		   
		        System.out.print("How many number you want to insert: ");
		        int n=input.nextInt();
		        System.out.println("Enter "+n+" array elements");
		        int[] arr=new int[n];
		        for(int i=0;i<n;i++)
		        {
		        	arr[i]=input.nextInt();
		        }
		        int left=arr[0];
		        int right=arr.length-1;
		        System.out.println("Enter data you want to Search:");
		        int search=input.nextInt();
		     
				   for(int f=1;f<C;f++)
				   {
					   System.out.println("Enter data you want to Search:");
					    search=input.nextInt();
				   }
				   while(left<=right)
				   {
					    int mid=(right+left)/2;
					    if(search==arr[mid])
					    {
					    	 System.out.println(search+" is found index "+mid);
					    	 return;
					    }
					    else if(arr[mid]<search)
					    {
					    	left=mid+1;
					    }
					    else
					    {
					    	right=mid-1;
					    }
						   
				   }
				   System.out.println(search+" is not Found in the Array");
	      }
}

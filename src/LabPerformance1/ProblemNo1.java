package LabPerformance1;

import java.util.Scanner;
public class ProblemNo1
{
    public static void main(String[] args)
    {
		  Scanner input=new Scanner(System.in);
		  System.out.println("Enter size of array: ");
		  int n=input.nextInt();
		  int[] a=new int[n];
		  System.out.println("Enter those elments input the array shorting  in ascending order: ");
	
		  int odd=0;
		 
		  for(int i=0;i<n;i++)
		  {
			  a[i]=input.nextInt();
			  if(a[i]%2!=0)
			  {
				  System.out.println("Odd array: "+a[i]);
	                odd++;
			  }  
			
		  }
		
	  System.out.print("Serach item:");
		  int search=input.nextInt();
			 System.out.println(search+" Is found position "+odd);
		  
		     int left=a[0];
	        int right=a.length-1;
	   	  while(left<=right)
		   {
			    int mid=(right+left)/2;
			    if(odd==search)
			    {
			    	 System.out.println(search+" is found index "+mid);
			    
			    	 return;
			    }
			    else if(a[mid]<search)
			    {
			    	left=mid+1;
			    }
			    else
			    {
			    	right=mid-1;
			    }
		   }
	
		
		  
		  
		  
	}
}

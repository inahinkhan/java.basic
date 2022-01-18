package Algorithm;

import java.util.Scanner;

//Linear Search in Java
public class LinearSearch
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Total Case: ");
		int C=input.nextInt();
		System.out.println("Enter the size of Array: ");
		  int N=input.nextInt();
		  System.out.println("Enter Elments of Array:");
		   int[]  Array=new int[N];
	       for(int i=0;i<N;i=i+1)
		   {
			   Array[i]=input.nextInt();
		   }
		   System.out.println("Enter data you want to Search: ");
		   int Search=input.nextInt();;
		   for(int f=1;f<C;f++)
		   {
			   System.out.println("Enter data you want to Search:");
			    Search=input.nextInt();
		   }

		  for(int i=0;i<N;i=i+1)
		  {
			  if(Array[i]==Search)
			  {
				  System.out.println("Item Found");
				  System.out.println("Index is: "+i);
				  return ;
			     
			  }
		 }

			  System.out.println("Item Not Found");
	 
		
                 input.close();
			  
	}


}

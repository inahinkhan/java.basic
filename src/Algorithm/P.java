package Algorithm;

import java.util.Scanner;

public class P 
{
      public static void main(String[] args) 
        {
    	  int count=0;
    	
    	  Scanner input=new Scanner(System.in);
    
   
    	  System.out.print("Data List: ");
		   int[]  Array=new int[8];
	       for(int i=0;i<8;i=i+1)
		   {
			   Array[i]=input.nextInt();
		   }
		   System.out.print("You have to Search: ");
		   int Search=input.nextInt();
		   
		   for(int i=0;i<8;i=i+1)
			  {
				  if(Array[i]==Search)
				  {
					
				       count++;
					  
	              }
			  }
			  System.out.println( Search+" is found " + count +" times in your list");
	       }
		
			
        }  


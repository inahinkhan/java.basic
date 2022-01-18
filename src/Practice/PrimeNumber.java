package Practice;
//A prime number or a Prime is a natural greater than 1 that has no positive divisors other than 1 itself
import java.util.Scanner;

public class PrimeNumber
{
     public static void main(String[] args)
        {
		    
		      Scanner input=new Scanner(System.in);
		      int i;
		      int ans=0;
		        System.out.print("Test Case = ");
		        int tc=input.nextInt();
		        
		       int n=input.nextInt();
		        for(int S=1;S<tc;S++)
		        {
		        	  n=input.nextInt();
		        }
		        
		 
  	    	      for(i=2;i<n;i++)
		    		  {
		  		          
		  		          if(n%i==0)
		  		          {
		  		        	  ans++;
		  		        	  break;
		  		          }
		  		      
		  	         }
  	    	    if(ans==0)
	    	      {
	    	    	  System.out.println(n+" is a prime number");
	    	      }
	    	      else
	    	      {
	    	    	  System.out.println(n+" is not a prime number");
	    	      }
  	    	
  	    	      
  	    
  	    	
		 
    	}
}

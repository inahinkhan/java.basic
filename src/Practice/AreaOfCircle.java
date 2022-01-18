package Practice;

import java.util.Scanner;

class Circle
{
	   float circle(float R)
	     {
	    	return (float) (Math.PI*Math.pow(R, 2));
	     }
}
public class AreaOfCircle 
{
     public static void main(String[] args)
       {
    	 
    	 Scanner input=new Scanner(System.in);
    	 System.out.print("Enter the value of R: ");
    	     float R=input.nextFloat();
		     Circle ob=new  Circle();
		     System.out.println("Area of circle:  "+ob.circle(R));
	   }
}

package Practice;

import java.util.Scanner;

public class AreaOfTriangle
{
     public static void main(String[] args)
        {
		         Scanner scan =new Scanner(System.in);
		         System.out.print("Enter Base: ");
		         float B=scan.nextFloat();
		         System.out.print("Enter Height : ");
		         float H=scan.nextFloat();
		         float area=(B*H)/2;
		         System.out.println(" Area of triangle: "+area);
	    }
}

package Practice;

import java.util.Scanner;

public class TempretureConverter
{
      public static void main(String[] args)
        {
    	  Scanner input=new Scanner(System.in);
    	    System.out.println("Enter Farenheight temprreture:");
    	    double f=input.nextDouble();
		      double  c=(5*f-5*32)/9;
		        System.out.println("Celcius tempreture: "+c);
    	}
}

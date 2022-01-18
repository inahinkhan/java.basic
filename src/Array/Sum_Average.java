package Array;

import java.util.Scanner;

public class Sum_Average
{
       public static void main(String[] args)
          {
    	            System.out.println("Enter 5 Number: ");
		            int[] Marks=new int[5];
		            int sum=0;
		            Scanner input=new Scanner(System.in);
		            for(int i=0;i<5;i++)
		            {
		            	Marks[i]=input.nextInt();
		            }
		            for(int i=0;i<5;i++)
		            {
		            	sum=sum+Marks[i];
		            }
		            System.out.println("Summation : "+sum);
		            float avg=sum/Marks.length;
		            System.out.println("Average : "+avg);
		            
    	 }
}

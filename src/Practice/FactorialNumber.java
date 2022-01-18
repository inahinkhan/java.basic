package Practice;

import java.util.Scanner;

class Fact
{
	int n;
	int fact(int n)
	{
		if(n==1 || n==0)
		{
		           return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
}

public class FactorialNumber
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter any integer number: ");
		int n=input.nextInt();
		Fact obj=new Fact();
	int 	Factorial= obj.fact(n);
		System.out.println("Factorial Number of "+n+" =  "+Factorial);
		
	}
     
}

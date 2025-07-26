package DAY6;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try 
		{
		System.out.println("Enter a Number ");
		int n = scanner.nextInt();
		
		if(n<0)
		{
			throw new IllegalArgumentException("You are not allowed to enter a negative number");
		}
		
		int factorial=1;
		
		if(factorial==0 || factorial == 1)
		{
			factorial=1;
		}
		
		else 
		{
			for(int i=2;i<=n;i++)
			{
				factorial*=i;
			}
		}
		
		System.out.println("Factorial of "+n + " is: " + factorial);
		
		}
		
		catch(IllegalArgumentException e)
		{
			System.out.println("Error: " + e.getMessage());
			System.out.println("\n");
			e.printStackTrace();
		}
		
		
		
	}
}

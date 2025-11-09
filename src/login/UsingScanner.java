package login;

import java.util.Scanner;

public class UsingScanner 
{
	
	public static void main(String[] args) 
	{
		int budget;
		
		
		System.out.println("Please Enter Your Budget");
		
		Scanner sc=new Scanner(System.in);
		
		budget=sc.nextInt();
		if(budget>100000)
		{
			System.out.println("Trip To Switzerland");
		}
		else
		{
			System.out.println("Trip To GOA");
		}
		System.out.println("Enter your Age");
		int VotingAge=sc.nextInt();
		if(VotingAge>18)
		{
			System.out.println(" You are eligible for voting ");
		}
		else
		{
			System.out.println(" You are not eligible for voting ");
			
			
		}
		
	}

}

package login;

import java.util.Scanner;

public class ControlstatementUsinglogicaland {
	
public static void main(String[] args)
{
	String gender;
	int age;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Please Enter Your Gender");
	gender=sc.next();
	
	System.out.println("Please Enter Your Age");
	age=sc.nextInt();
	if(age>=21 && gender.equalsIgnoreCase("female"))
	{
		System.out.println(" You Are Eligible For Voting ");
	}
			
	
	
}
}

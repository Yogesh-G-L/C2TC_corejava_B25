package com.tns.exception;
import java.util.Scanner;
public class exampleclass3_userdifined {
	private static int age;
	// creating a static method to call the this in the main function code.
	static void validate()throws InvalidAgeException
	{
		Scanner ac= new Scanner(System.in);
		System.out.println("ENter your age = ");
		age=ac.nextInt();
		if(age<18) 
		throw new InvalidAgeException("invalid age, you are not eligible to vote ");
		else
			System.out.println("welcome to voting");
			
	}

		
	public static void main(String[] args) {
		
		try
		{
			validate();
			
		}
		catch(Exception e)
		{
			System.out.println("caught an Exception \n "+e);
			
		
	}
	}

}

package com.tns.exception;

public class exampleclass5 {

	public static void main(String[] args) {

		int a=20,b=0;
		try
		{
			System.out.println("value of a ="+a);
			System.out.println("value of b ="+b);
			int s=a/b;
			System.out.println(" result is "+s);
			
		}
		catch(NullPointerException npe)
		{
			System.out.println("npe");// checking for the exception
		}
		finally
		{
			System.out.println("denominator can't be zero");
			
		}
		System.out.println("hello java");
		
		
	}

}

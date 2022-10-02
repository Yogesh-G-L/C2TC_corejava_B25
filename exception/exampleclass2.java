package com.tns.exception;

public class exampleclass2 {

	public static void main(String[] args) {
		
		System.out.println("111111");
		System.out.println("going inside the try block");
		
		try
		{
			
		
			 int x= 12,y=20;
			 int a=x+y;// i can use many operation to check the exception.
			 System.out.println("result of the solution is "+a);
			 // no exception is raised at this stage
			
			/*int x= 12/0;
			System.out.println("Result of the x="+x);
			*/
		}
		catch(ArithmeticException ae) // cerating the the catch block to printnthe exception  error int the result.
		
		{
			System.out.println(" the number can't divid by zero");
			
			
		}
		System.out.println("out of the catch block ");
		System.out.println("*"+5+'*');
	}
	
	

}

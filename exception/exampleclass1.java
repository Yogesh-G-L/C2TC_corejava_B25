package com.tns.exception;

public class exampleclass1 {

	public static void main(String[] args) {
		
		
		
		
		System.out.println("inside the main code ");
		System.out.println("before you go inside the exceptionblock");
		//adding the try-catch block to handle exception.
		
		try
		{
			int e=1/0;
			System.out.println("after divisiion");
		}
		catch(ArithmeticException ae)//here ae is the reference variable foe the coming exception object.
		{
			System.out.println("the given number is not divisable by  zero");
			
			//catch will executed when an execpation is raiesed 
		}
		System.out.println("the funcation is out of the execption block");
	
			
		
	}

}

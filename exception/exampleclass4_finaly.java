package com.tns.exception;

public class exampleclass4_finaly {

	
	
	
	public static void main(String[] args) {
	int a=20,b=90,c=10;
	try
	{
		 int sum= a+b+c/0;
	//	double sum= a+b+c/ 3.142;
		System.out.println("sum of all the number is "+sum);
		
	
	}
	catch(Exception e) {
		
		System.out.println(e);// checking the type of Exception raised by the in the code.
		
	}
	finally// this will execut if exception is persent or not.
	
	{
		System.out.println("finnaly block must be exceuted ");
	}
	System.out.println(" \n out all the exception things");
	}
	

}

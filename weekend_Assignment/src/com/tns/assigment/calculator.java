package com.tns.assigment;


import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		
		
		Scanner cal=new Scanner(System.in);
		System.out.println("Enter the first number= ");
		int num1=cal.nextInt();
		System.out.println("Enter the second number= ");
		int num2= cal.nextInt();
		
		System.out.println("Enter the operator [+ , - , / ,*]");
		char  ch=cal.next().charAt(0);
		
		if ( ch =='+') {
			num1+=num2;
			System.out.println(num1);	
		}
		else if(ch == '-') {
			num1-=num2;
			System.out.println(num1);
		}
		else if(ch == '*') {
			
			num1*=num2;
			System.out.println(num1);
		}
		else if (ch == '/') {
			num1/=num2;
			System.out.println(num1);
		}
		else {
			System.out.println("invalid entry");
		}
		
		
		

	}

}

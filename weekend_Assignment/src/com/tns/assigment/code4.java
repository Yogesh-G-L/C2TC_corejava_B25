package com.tns.assigment;

import java.util.Scanner;

public class code4 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		 
		// Eligible 
		if (age <= 18) {
			System.out.println("not eligible for voting ");
		}
		
		else {
			System.out.println("Eligible for voting");
		}
		
		
		
	}

}

package com.tns.assigment;


import java.util.Scanner;
public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner na= new Scanner(System.in);
		System.out.println("Enter your name =");
		String name=na.next();
		
		switch(name.toLowerCase()) {
		
		case "yogi":
			System.out.println("wellcome "+name.toUpperCase());
			break;
			
		case "ruby":
			System.out.println("wellcome "+name.toUpperCase());
			break;
			
			
		case "loopi":
			System.out.println("wellcome "+name.toUpperCase());
			break;
			
		case "i":
			System.out.println("wellcome "+name.toUpperCase());
			break;
			
		
		case "lon":
			System.out.println("wellcome "+name.toUpperCase());
			break;
			
		default:
			System.out.println("invalid entry of input ");
			
		}
	}

}

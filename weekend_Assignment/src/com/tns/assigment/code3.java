package com.tns.assigment;

import java.util.Scanner;

public class code3 {

	public static void main(String[] args) {
		/*int a=99;
		a+=10;
		System.out.println(a);
		a-=10;
		System.out.println(a);
		a*=10;
		System.out.println(a);
		a/=10;
		System.out.println(a);
		a%=10;
		System.out.println(a);
		--a;
		System.out.println("decrement"+a);
		++a;
		System.out.println("increment"+a);
		*/
		/*do// do while loop
		{
			a--;
			System.out.println(a);
		}while(a>0);
		*/
		/*for (int i = 1; i <=9 ; i++)
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print('@');
				System.out.print("*");
			}
			System.out.println();
		*/
			// Do while loop
		/* int i = 1, j = 1;
		do { System.out.println("i=" + i + " and j=" + j);
				i++;
				j++;
		
			} while (i < 11 || j < 11);*/
		
		Scanner as=new Scanner(System.in);
		System.out.println(" Enter the character : ");
		
		
		char x=as.next().charAt(0);
		
		switch (x) {
		case'a':
		case'A':
			System.out.println("the char is a");
			break;
		case'b':
		case'B':
			System.out.println("the char is b");
			break;
		case'c':
		case'C':
			System.out.println("the char is c");
			break;
		case'd':
		case'D':
			System.out.println("the char is d");
			break;
		case'e':
		case'E':
			System.out.println("the char is e");
			break;
		case'f':
		case'F':
			System.out.println("the char is f");
			break;
		default:
			System.out.println("In valid char value !");
			
		}
		
		
		}
		
		
	

}

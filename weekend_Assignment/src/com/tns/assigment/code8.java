package com.tns.assigment;

import java.util.Scanner;

public class code8 {

	public static void main(String[] args) {
	
		Scanner tab=new Scanner(System.in);
		System.out.println("Enter the  number");
		int s=tab.nextInt();
		for (int i=1;i<=10;i++) {
			int ans=i*s;
			System.out.println(s+" X "+i+" = "+ans);
		}


	}

}


           

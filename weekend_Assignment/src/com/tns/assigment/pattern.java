package com.tns.assigment;

public class pattern {

	public static void main(String[] args) {
	
		for(int i= 0 ; i<= 4;i++)
		{
			for(int j= 0; j<=i;j++)
			{
				System.out.print("@");
			}
			System.out.println("");
		}
		
		System.out.println("");
		//reverse the pattern
		
		for(int ia = 4;ia>= 0;ia--) {
			for(int ja=0;ja<=ia;ja++) {
				System.out.print("@");
				
			}
			System.out.println("");
		}
		
		/*
		do{
			int g=0;
			g++;
			
			
			
			
		}while(g <= 10);
*/
	}

}

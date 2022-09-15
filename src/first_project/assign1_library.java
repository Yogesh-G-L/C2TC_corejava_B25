package first_project;

import java.util.Scanner;

public class assign1_library {

	public static void main(String[] args) {
	// to check  the light condition ON or OFF
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of days late :");
	int days=sc.nextInt();
	
	int fine_money=0;
	if(days <= 5) {
		fine_money = days*1;
		System.out.print("the fine amount is ="+fine_money);
	} 
	else if (days >=5 & days <=10) {
			fine_money= (5*1)+(days-5)*5;
			System.out.print("the fine amount is ="+fine_money);
			}
	else {
		fine_money= ((5*1)+(25))+(days-10) *10;
		System.out.print("the fine amount is ="+fine_money);
		
	}

	}
	
		
	}


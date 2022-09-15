package first_project;
import java.util.Scanner;
public class assign9_water_conservation {
// Water bill calculation 
	
	public static void main(String[] args) {
		
		// input to take the water in gallons
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the water consumed in gallons=");
		float water = sc.nextFloat();
		
			
		
		
		if(water <= 45) {
			System.out.print(" NO TAX ");
					}
		else if(water >= 45 && water <=75) {
			System.out.print("TAX MONEY IS = 475 ");
			
		}
		else if(water >=75 && water <=125) {
			System.out.print("TAX MONEY IS = 750");
		}
		else if(water >=125 && water <=200) {
			System.out.print("TAX MONEY IS = 1225 ");
		}
		else if(water >=200 & water <= 350) {
			System.out.print("TAX MONEY IS = 1650 ");
		}
		else {
			System.out.print("TAX MONEY IS = 2000 ");
		}
	}
}


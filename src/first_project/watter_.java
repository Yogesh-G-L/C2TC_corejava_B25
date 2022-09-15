package first_project;

public class watter_ {
// Water bill calculation 
	
	public static void main(String[] args) {
		int tax_m= 0;
		// input to take the water in gallons
		float water = 52.25f;
		float total= 0;
			
		
		
		if(water <= 45) {
			System.out.print("the Entered water level is= ");
			tax_m=0;
			total = (water *100)+ tax_m;// calculating the total prices
			System.out.print("\nTotal amount in rupees= ");// printing the total cost
			System.out.print(total);
		}
		else if(water >= 45 & water <=75) {
			System.out.print("the Entered water level is= ");
			tax_m=475;
			total =(water *100)+ tax_m;// calculating the total prices
			System.out.print("\nTotal amount in rupees= ");// printing the total cost
			System.out.print(total);	
		}
		else if(water >=75 & water <=125) {
			System.out.print("the Entered water level is= ");
			tax_m=750;
			total =(water *100)+ tax_m;// calculating the total prices
			System.out.print("\nTotal amount in rupees= ");// printing the total cost
			System.out.print(total);
		}
		else if(water >=125 & water <=200) {
			System.out.print("the Entered water level is= ");
			tax_m=1225;
			total =(water *100)+ tax_m;// calculating the total prices
			System.out.print("\nTotal amount in rupees= ");// printing the total cost
			System.out.print(total);	
		}
		else if(water >=200 & water <= 350) {
			System.out.print("the Entered water level is= ");
			tax_m=1650;
			total =(water *100)+ tax_m;// calculating the total prices
			System.out.print("\nTotal amount in rupees= ");// printing the total cost
			System.out.print(total);
		}
		else if(water >=350) {
			System.out.print("the Entered water level is= ");
			tax_m=2000;
			total =(water *100)+ tax_m;// calculating the total prices
			System.out.print("\nTotal amount in rupees= ");// printing the total cost
			System.out.print(total);
		}
		else {
			System.out.print("invalid input ");
		}
		}
	}

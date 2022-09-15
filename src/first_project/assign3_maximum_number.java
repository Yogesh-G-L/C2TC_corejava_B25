package first_project;

public class assign3_maximum_number {
	// To Find the large number in 3 number
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=12;
		int second = 15;
		int third =18;
		if ( (first > second & first > third )& (first != second & first != third)){
			System.out.print("First number is the larget number");
		}
		else if ( (second > first & second  > third )& (second != first & second != third)) {
			System.out.print("Second number is the larget number");
		}
		else if ( (third > first & third  > second )& (third != first & third != second)) {
			System.out.print("Thrid  number is the larget number");
		}
		else {
			System.out.print("All the number are equal");
		}
	}

}

package assignment_2;

public class shirt {
	public static String color;
	public static char size;
	
	
	shirt(){// default constructor
		
	}
	
	shirt(String color,char size){// constructor with a variable input to it 
	this.color=color;
	this.size=size;
	System.out.println();
	
	}
	public static void puton() {
		System.out.println("Shirt is on!");
	}
	public static void takeoff() {
		System.out.println("Shirt is off");
	}
	public static void setColor(String newColor) {
		color=newColor;
		
	}
	public static void setsize(char newsize) {
		size=newsize;
		
	}
}

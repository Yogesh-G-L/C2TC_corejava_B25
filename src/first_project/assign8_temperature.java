package first_project;
import java.util.Scanner;
public class assign8_temperature {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the temperature value=");
		int temp=sc.nextInt();
		int week =1;
		for(int i=1 ; i<5; i++) {
			temp=temp-2;
			week++;
			System.out.print("\nthe temperature in week ="+week+""+temp);
		}
		
	}

}

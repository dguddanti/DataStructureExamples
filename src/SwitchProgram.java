import java.util.Scanner;

public class SwitchProgram {

	public static void main(String[] args) {
	System.out.println("This program returns the factorial for a positive integer.");
		
		System.out.println("Enter the number you want the day of:");
		Scanner in = new Scanner(System.in);
		int day = in.nextInt();
		
		
		// int day = 1;
		String dayName;
		
		switch (day) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		default:
			dayName = "Invalid Day";
			break;
		}
		System.out.println(dayName);
	}

}

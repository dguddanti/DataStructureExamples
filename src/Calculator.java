import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Enter the first number :");
		Scanner in1 = new Scanner(System.in);
		int num1 = in1.nextInt();
		
		System.out.println("Enter the second number:");
		Scanner in2 = new Scanner(System.in);
		int num2 = in2.nextInt();
		
		int answer = 0;
		
		System.out.println("Enter what operation you would like to perform:");
		Scanner in3 = new Scanner(System.in);
		String operation = in3.nextLine();
		
		try {
			switch (operation) {
			case "add":
				answer = num1 + num2;
				break;
				
			case "subtract":
				answer = num1 - num2;
				break;
				
			case "multiply":
				answer = num1 * num2;
				break;
				
			case "divide":
				answer = num1 / num2;
				break;
				
			default:
				System.out.println("Invalid Operation");
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Caught Arithmetic Exception " + e);
		}
		
		System.out.println(answer);
	}
	
}

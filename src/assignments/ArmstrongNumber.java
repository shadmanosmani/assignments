package assignments;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		if(isArmstrongNumber(number)) {
			
			System.out.println(number + " is an armstrong number.");
			
		} else {
			
			System.out.println(number + " is not an armstrong number.");
			
		}
		
		scanner.close();

	}

	public static boolean isArmstrongNumber(int number) {

		int copyOfNumber = number, result = 0;

		while (copyOfNumber != 0) {

			result += Math.pow((copyOfNumber % 10), String.valueOf(number).length());
			copyOfNumber /= 10;

		}

		if (result == number) {

			return true;

		}

		return false;

	}

}

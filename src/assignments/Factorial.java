package assignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		if (number < 0) {

			System.out.println("Invalid number. Please enter a positive number and try again.");

		} else if (number == 0 || number == 1) {

			System.out.println("The factorial of " + number + " is 1");

		} else {

			int factorial = 1;

			for (int i = 2; i <= number; i++) {

				factorial = factorial * i;

			}

			System.out.println("The factorial of " + number + " is " + factorial);

		}

		scanner.close();

	}

}

package assignments;

import java.util.Scanner;

public class ArmstrongNumbersInGivenRange {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter lower limit: ");
		int lowerLimit = scanner.nextInt();
		System.out.print("Enter upper limit: ");
		int upperLimit = scanner.nextInt();

		System.out.print("List of armstrong numbers between " + lowerLimit + " and " + upperLimit + " are: ");
		for (int i = lowerLimit; i <= upperLimit; i++) {

			if (isArmstrongNumber(i)) {

				System.out.print(i + " ");

			}

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

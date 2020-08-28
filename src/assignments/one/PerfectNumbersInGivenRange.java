package assignments.one;

import java.util.Scanner;

public class PerfectNumbersInGivenRange {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter lower limit: ");
		int lowerLimit = scanner.nextInt();
		System.out.print("Enter upper limit: ");
		int upperLimit = scanner.nextInt();

		System.out.print("List of perfect numbers between " + lowerLimit + " and " + upperLimit + " are: ");
		for (int i = lowerLimit; i <= upperLimit; i++) {

			if (isPerfectNumber(i)) {

				System.out.print(i + " ");

			}

		}

		scanner.close();

	}

	public static boolean isPerfectNumber(int number) {

		int result = 0;

		for (int i = 1; i <= number / 2; i++) {

			if (number % i == 0) {

				result += i;

			}
		}

		if (result == number) {

			return true;

		}

		return false;

	}

}

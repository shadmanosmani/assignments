package assignments.one;

import java.util.Scanner;

public class SumOfSquareOfNumbersUptoGivenRange {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the upper limit: ");
		int upperLimit = scanner.nextInt();

		int sum = 0;

		for (int i = 1; i <= upperLimit; i ++) {

			sum += Math.pow(i, 2);

		}

		System.out.println("Sum of square of numbers upto " + upperLimit + " is " + sum);

		scanner.close();

	}

}

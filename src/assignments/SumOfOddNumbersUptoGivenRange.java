package assignments;

import java.util.Scanner;

public class SumOfOddNumbersUptoGivenRange {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the upper limit: ");
		int upperLimit = scanner.nextInt();

		int sum = 0;

		for (int i = 1; i <= upperLimit; i += 2) {

			sum += i;

		}

		System.out.println("Sum of odd numbers upto " + upperLimit + " is " + sum);

		scanner.close();

	}

}

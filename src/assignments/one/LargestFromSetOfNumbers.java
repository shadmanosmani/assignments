package assignments.one;

import java.util.Scanner;

public class LargestFromSetOfNumbers {

	public static void main(String[] args) {

		int n, number, largest = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the value of n: ");
		n = scanner.nextInt();

		System.out.print("Enter " + n + " numbers: ");
		for (int i = 0; i < n; i++) {

			number = scanner.nextInt();
			largest = largest < number ? number : largest;

		}

		System.out.println(largest + " is the largest number");

		scanner.close();

	}

}

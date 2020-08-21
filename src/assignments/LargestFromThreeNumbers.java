package assignments;

import java.util.Scanner;

public class LargestFromThreeNumbers {

	public static void main(String[] args) {

		int number, largest = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter 3 numbers: ");
		for (int i = 0; i < 3; i++) {

			number = scanner.nextInt();

			largest = largest < number ? number : largest;

		}

		System.out.println(largest + " is the largest number");

		scanner.close();

	}

}

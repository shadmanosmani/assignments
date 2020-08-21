package assignments;

import java.util.Scanner;

public class LargestAndSmallestFromThreeNumbers {

	public static void main(String[] args) {

		int number, smallest = 0, largest = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter 3 numbers: ");
		for (int i = 0; i < 3; i++) {

			number = scanner.nextInt();

			smallest = smallest == 0 ? number : number < smallest ? number : smallest;
			largest = number > largest ? number : largest;

		}

		System.out.println(smallest + " is the smallest number");
		System.out.println(largest + " is the largest number");

		scanner.close();

	}

}

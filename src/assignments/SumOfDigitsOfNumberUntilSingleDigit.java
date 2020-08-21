package assignments;

import java.util.Scanner;

public class SumOfDigitsOfNumberUntilSingleDigit {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		System.out.println("Sum of digits of " + number + " upto single digit is " + (1 + ((number-1) % 9)));
		
		scanner.close();
		
	}

}

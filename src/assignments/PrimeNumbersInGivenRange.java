package assignments;

import java.util.Scanner;

public class PrimeNumbersInGivenRange {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter lower limit: ");
		int lowerLimit = scanner.nextInt();
		System.out.print("Enter upper limit: ");
		int upperLimit = scanner.nextInt();

		System.out.print("List of prime numbers between " + lowerLimit + " and " + upperLimit + " are: ");
		for (int i = lowerLimit; i <= upperLimit; i++) {
			
			if(isPrime(i)) {
				
				System.out.print(i+ " ");
				
			}

		}

		
		scanner.close();

	}

	public static boolean isPrime(int number) {

		for (int i = 2; i <= number / 2; i++) {

			if (number % i == 0) {

				return false;

			}

		}

		return true;

	}

}

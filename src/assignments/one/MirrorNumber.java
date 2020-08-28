package assignments.one;

import java.util.Scanner;

public class MirrorNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		String number = scanner.next();

		if (isMirrorNumber(number)) {

			System.out.println(number + " is a mirror number");

		} else {

			System.out.println(number + " is not a mirror number");

		}

		scanner.close();

	}
	
	public static boolean isMirrorNumber(String number) {

		for (int i = 0; i < number.length(); i++) {

			if (number.charAt(i) != '1' && number.charAt(i) != '0' && number.charAt(i) != '8') {

				return false;

			}

		}

		if (number.equals(new String(new StringBuilder(number).reverse()))) {

			return true;

		}

		return false;

	}

}

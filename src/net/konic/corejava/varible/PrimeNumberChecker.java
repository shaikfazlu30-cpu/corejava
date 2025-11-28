package net.konic.corejava.varible;

import java.util.Scanner;

public class PrimeNumberChecker {

	int number;

	// Method to read number from user
	void readNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = sc.nextInt();
		number = input;
	}

	boolean isPrime() {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		PrimeNumberChecker pc = new PrimeNumberChecker();

		pc.readNumber();

		if (pc.isPrime()) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}

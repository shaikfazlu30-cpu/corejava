
package net.konic.corejava.varible;

import java.util.Scanner;

public class EvenOdd {

	int number;

	void readNumber() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt(); // local variable

		number = n;
	}

	boolean isEven() {
		return number % 2 == 0;
	}

	public static void main(String[] args) {

		EvenOdd obj = new EvenOdd();

		obj.readNumber();

		if (obj.isEven()) {
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}
	}
}

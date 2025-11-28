package net.konic.corejava.varible;

import java.util.Scanner;

public class NameLength {

	String fullName;

	void readFullName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter full name: ");
		String input = scanner.nextLine();
		fullName = input;
	}

	boolean isLongName() {
		return fullName.length() > 10;
	}

	public static void main(String[] args) {
		NameLength nl = new NameLength();

		nl.readFullName();

		if (nl.isLongName()) {
			System.out.println("The name is long.");
		} else {
			System.out.println("The name is short.");
		}
	}
}

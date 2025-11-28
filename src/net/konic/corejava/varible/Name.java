package net.konic.corejava.varible;

import java.util.Scanner;

public class Name {

	class Person {

		String firstName;
		String lastName;

		void readNames() {
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter first name: ");
			firstName = sc.nextLine();

			System.out.print("Enter last name: ");
			lastName = sc.nextLine();
		}

		String fullName() {
			return firstName + " " + lastName;
		}
	}

	public static void main(String[] args) {

		Name outer = new Name();

		Name.Person p = outer.new Person();

		p.readNames();

		System.out.println("Full Name: " + p.fullName());
	}
}

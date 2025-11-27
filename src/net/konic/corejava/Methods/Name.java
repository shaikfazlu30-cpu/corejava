
package net.konic.corejava.Methods;

public class Name {

	// Method with parameters & without return type
	public static void printFullName(String firstName, String lastName) {
		System.out.println("Full Name: " + firstName + " " + lastName);
	}

	public static void main(String[] args) {
		printFullName("khadeer", "fazlu");
	}
}

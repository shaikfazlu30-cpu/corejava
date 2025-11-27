package net.konic.corejava.Methods;

public class Application {

	// Method without parameters and without return type
	public static void displayMessage() {
		System.out.println("Welcome to our Application");
	}

	public static void main(String[] args) {
		Application method = new Application();
		displayMessage();
	}
}

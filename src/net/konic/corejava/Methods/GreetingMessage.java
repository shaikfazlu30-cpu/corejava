package net.konic.corejava.Methods;

public class GreetingMessage {

	public String greet(String greet) {
		System.out.println("greeting " + greet);
		return greet;

	}

	public static void main(String[] args) {
		GreetingMessage greeting = new GreetingMessage();
		greeting.greet("hello");
	}

}

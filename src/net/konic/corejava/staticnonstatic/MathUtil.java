package net.konic.corejava.staticnonstatic;

public class MathUtil {

	static int add(int a, int b) {
		return a + b;

	}

	int multiply(int a, int b) {
		return a * b;

	}

	public static void main(String[] args) {
		int s = add(10, 20);
		System.out.println("Sum (): " + s);

		MathUtil mu = new MathUtil();

		int product = mu.multiply(10, 5);

	}

}

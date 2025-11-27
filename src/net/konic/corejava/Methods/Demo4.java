package net.konic.corejava.Methods;

public class Demo4 {

	public int add(int a, int b) {

		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		Demo4 demo = new Demo4();
		int sum = demo.add(5, 6);
		System.out.println("sum::" + sum);

	}
}

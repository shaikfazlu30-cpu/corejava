package net.konic.corejava.Methods;

public class Demo2 {
	public void add(int a, int b) {

		int c = a + b;

		System.out.println("add =" + c);

	}

	public static void main(String[] args) {

		Demo2 demo2 = new Demo2();

		demo2.add(10, 50);
	}
}

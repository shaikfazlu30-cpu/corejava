package net.konic.corejava.Methods;

public class Demo3 {

	public int add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;

	}

	public static void main(String[] args) {
		Demo3 demo = new Demo3();

		int sum = demo.add();
		System.out.println("sum::" + sum);

	}
}

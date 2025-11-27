package net.konic.corejava.Methods;

public class Demo {

	public void add() {
		int a = 10;
		int b = 20;
		int c = a + b;

		System.out.println("add =" + c);

	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.add();
	}
}

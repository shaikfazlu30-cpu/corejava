package net.konic.corejava.objectclass;

public class Age {

	public boolean age(int age) {
		if (age >= 18) {
			System.out.println(age>=20 );
			return true;

		} else {
			return false;

		}
	}

	public static void main(String[] args) {
		Age age = new Age();
		age.age(18);
	}
}

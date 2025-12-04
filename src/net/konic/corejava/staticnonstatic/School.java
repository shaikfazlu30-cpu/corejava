package net.konic.corejava.staticnonstatic;

public class School {

	void printStudent() {
		System.out.println("Student Name: fazlu");
	}

	static void printSchoolName() {
		System.out.println("School Name: Global");
	}

	public static void main(String[] args) {

		printSchoolName();

		School s1 = new School();
		s1.printStudent();
	}
}

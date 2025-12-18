package net.konic.corejava.constructor;

final class Student {

	static String schoolname = "Xlnc";
	int rollnum;
	String studentname;

	Student(int a, String b) {

		rollnum = a;
		studentname = b;
	}

	void std() {
		System.out.println("rollnum :" + rollnum);
		System.out.println("studentname :" + studentname);

	}

	static void stdl() {
		System.out.println(schoolname);
	}

	public static void main(String[] args) {
		Student student = new Student(12, "khadeer");

		student.std();
		stdl();

	}

}

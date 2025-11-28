package net.konic.corejava.varible;

public class StudentMarks {

	class Student {

		int marks;

		void setMarks(int m) {
			marks = m;
		}

		String checkResult() {
			if (marks >= 40) {
				return "Pass";
			} else {
				return "Fail";
			}
		}
	}

	public static void main(String[] args) {

		StudentMarks sm = new StudentMarks();

		Student student = sm.new Student();

		student.setMarks(75);

		String result = student.checkResult();

		System.out.println("Marks: " + student.marks);
		System.out.println("Result: " + result);
	}
}

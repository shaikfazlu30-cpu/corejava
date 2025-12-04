package net.konic.corejava.staticnonstatic;

public class Employe {

	static String companyName = "Honda";

	// instance variables
	int empId;
	String empName;

	Employe(int id, String name) {
		this.empId = id;
		this.empName = name;
	}

	void showDetails() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Company Name: " + companyName);
	}

	public static void main(String[] args) {

		Employe e1 = new Employe(200, "khadeer");

		e1.showDetails();
	}
}

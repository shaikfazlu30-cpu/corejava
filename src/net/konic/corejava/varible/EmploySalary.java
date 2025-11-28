package net.konic.corejava.varible;

public class EmploySalary {

	String name;
	double salary;

	void setDetails(String n, double s) {
		name = n;
		salary = s;
	}

	double getYearlySalary() {
		return salary * 5;
	}

	public static void main(String[] args) {

		EmploySalary emp = new EmploySalary();

		emp.setDetails("khadeer", 5000);

		System.out.println("Employee Name: " + emp.name);
		System.out.println("Yearly Salary: " + emp.getYearlySalary());
	}
}

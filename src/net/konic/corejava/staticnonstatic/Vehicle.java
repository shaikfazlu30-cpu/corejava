package net.konic.corejava.staticnonstatic;

public class Vehicle {

	static int wheels = 6;
	String brand;

	public static void main(String[] args) {

		System.out.println("Number of wheels: " + Vehicle.wheels);

		Vehicle v1 = new Vehicle();
		v1.brand = "TVS";
		System.out.println("Vehicle Brand: " + v1.brand);
	}
}

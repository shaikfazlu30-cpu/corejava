package net.konic.corejava.Methods;

public class CountryName {

	// Method with return type & without parameters

	public String name() {
		String country = "India";
		System.out.println("Country Name: " + country);
		return country;

	}

	public static void main(String[] args) {
		CountryName countryName = new CountryName();
		countryName.name();

	}

}
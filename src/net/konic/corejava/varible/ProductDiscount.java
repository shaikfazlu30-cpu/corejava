package net.konic.corejava.varible;

import java.util.Scanner;

public class ProductDiscount {

	double price;

	void readPrice() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter product price: ");
		double inputPrice = sc.nextDouble();

		price = inputPrice;
	}

	double getDiscount() {
		double discountAmount = price * 0.10;
		return price - discountAmount;
	}

	public static void main(String[] args) {

		ProductDiscount pd = new ProductDiscount();

		pd.readPrice();

		double finalAmount = pd.getDiscount();

		System.out.println("Final Price After 10% Discount: " + finalAmount);
	}
}

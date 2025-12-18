package net.konic.corejava.string;

public class DeleteLastDigit {
	public static void main(String[] args) {

		StringBuilder otp = new StringBuilder("12345");

		otp.deleteCharAt(4);

		System.out.println("Updateotp:" + otp);

	}

}

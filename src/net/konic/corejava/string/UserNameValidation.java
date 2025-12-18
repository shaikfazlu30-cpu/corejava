package net.konic.corejava.string;

public class UserNameValidation {
	public static void main(String[] args) {

		String username = "adminuser01";

		if (username.equals(username)) {
			System.out.println(" valid Admin user");
		} else {
			System.out.println("invalid user");
		}
	}

}

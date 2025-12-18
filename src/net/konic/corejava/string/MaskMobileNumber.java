package net.konic.corejava.string;

public class MaskMobileNumber {
	public static void main(String[] args) {

		StringBuffer num = new StringBuffer("8309528529");
		num.replace(2, num.length() - 2, "******");
		System.out.println("MaskedNumber:" + num);

	}

}

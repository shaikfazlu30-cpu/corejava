package net.konic.corejava.string;

public class URLBuilder {
	public static void main(String[] args) {

		String protocal = "https";
		String Domain = "Konic";
		String path = "login";
		StringBuilder obj = new StringBuilder();
		obj.append(protocal);
		obj.append("://");
		obj.append(Domain);
		obj.append(path);
		System.out.println(obj);
	}

}

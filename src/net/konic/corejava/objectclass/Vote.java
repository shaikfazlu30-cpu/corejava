package net.konic.corejava.objectclass;

public class Vote {
	public int add(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}
public int sub(int x,int y) {
	int z=x-y;
	System.out.println(z);
	return z;
}
public double  mul(double a,double b) {
	double c=a*b;
	System.out.println(c);
	return c;
}
public double div(double x,double y) {
	double z=x/y;
	System.out.println(z);
	return z;
}
public static void main(String[] args) {
	Vote vote = new Vote();
	 vote.add(5,6);
	vote . sub(8,4);
	vote . mul(3,2);
	vote . div(1,32);
}
	
	
	
	}


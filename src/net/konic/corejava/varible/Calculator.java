package net.konic.corejava.varible;

import java.util.Scanner;

public class Calculator {
	
	int a;
	int b;

	public void intput() {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Value : ");
		a = sc.nextInt();
		System.out.println("Enter B value");
		b = sc.nextInt();
		
		sc.close();
		
	}

	public int add() {
		return a + b;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.intput();
		int sum = cal.add();
		System.out.println("Sum = " + sum);

	}
	

}
	



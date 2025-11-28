package net.konic.corejava.varible;

public class BankAccount {

	int balance;

	void deposit(int amount) {
		int depositAmount = amount;
		balance = balance + depositAmount;
	}

	int getBalance() {
		return balance;
	}

	public static void main(String[] args) {

		BankAccount acc = new BankAccount();

		acc.deposit(6000);

		System.out.println("Current Balance: " + acc.getBalance());
	}
}

package com;

public class SavingsAccount extends Account {
	private final double minimumBalance=500;
	private double bal=super.getBalance();
	public void withdraw(double amount) {
		if((bal-amount)<minimumBalance)
		{
			System.out.println("Withdraw not possible.");
		}
		else
		{
			System.out.println("Withdrawl done");
			bal = bal-amount;
		}
		super.setBalance(bal);
	}
}

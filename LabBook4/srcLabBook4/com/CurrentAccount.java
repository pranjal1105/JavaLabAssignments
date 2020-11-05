package com;

public class CurrentAccount extends Account {
	private double overdraftLimit;
	public void withdraw(double amount) {
		if(amount>overdraftLimit)
		{
			System.out.println("True");
			
		}
		else
		{
			System.out.println("False");
			
		}
	}
}

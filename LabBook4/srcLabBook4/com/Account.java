package com;
public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double amount) {
		balance=balance+amount;
	}
	public void withdraw(double amount) {
		if((balance-amount)<500)
		{
			System.out.println("Withdraw not possible");
		}
		else {
			balance=balance-amount;
		}
	}
	public String toString()
	{
		return accHolder.getName() + "\t"+ accNum + "\t" + balance;
	}
}

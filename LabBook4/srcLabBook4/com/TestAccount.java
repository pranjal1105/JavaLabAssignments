package com;

public class TestAccount {

	public static void main(String[] args) {
		Account a= new Account();
		a.setBalance(2000);
		double d=Math.random();
		String str=Double.toString(d);
		str=str.substring(3, 9);
		long aNum=Long.parseLong(str);
		a.setAccNum(aNum);
		Person p= new Person();
		p.setName("Kaithy");
		a.setAccHolder(p);
		a.withdraw(2000);
		System.out.println(a);

	}

}

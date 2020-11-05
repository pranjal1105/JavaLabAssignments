package com;

import java.util.Scanner;

class PersonDetails{
	String firstname;
	String lastname;
	char gender;
	int age;
	double weight;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public PersonDetails(String firstname, String lastname, char gender, int age, double weight) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}
	
}
public class PrintDetails {
	
	public static void main(String[] args) {
		String fname;
		String lname;
		char gender;
		int age;
		double weight;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		fname=sc.nextLine();
		System.out.println("Enter last name");
		lname=sc.nextLine();
		System.out.println("Enter gender");
		gender=sc.next().charAt(0);
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter weight");
		weight=sc.nextDouble();
		PersonDetails p=new PersonDetails(fname,lname,gender,age,weight);
		System.out.println("PersonDetails:");
		System.out.println("----------------");
		System.out.println("First Name: "+p.firstname );
		System.out.println("Last Name: "+p.lastname );
		System.out.println("Gender: "+p.gender );
		System.out.println("Age: "+p.age );
		System.out.println("Weight: "+p.weight );
	}

}

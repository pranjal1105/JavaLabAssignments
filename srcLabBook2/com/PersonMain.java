package com;

import java.util.Scanner;

import com.Person.Gender;


class Person{
	String firstName;
	String lastName;
	String phoneNum;
	enum Gender{
		M,F
	}
	Gender gender;
	
	public Person(String firstName, String lastName, String phoneNum, Gender gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
	
}
public class PersonMain {
	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first name");
		String fname=sc.nextLine();
		System.out.println("Enter the last name");
		String lname=sc.nextLine();
		System.out.println("Enter phone number");
		String phno=sc.nextLine();		
		//System.out.println("Enter gender");
		//char gender=sc.next().charAt(0);
		Person p1= new Person(fname,lname,phno,Gender.M);
		System.out.println("Person Details");
		System.out.println("-----------------------");
		System.out.println("First Name: "+p1.firstName);
		System.out.println("Last Name: "+p1.lastName);
		System.out.println("Phone num: "+p1.phoneNum);
		System.out.println("Gender: "+p1.gender);
	}
}

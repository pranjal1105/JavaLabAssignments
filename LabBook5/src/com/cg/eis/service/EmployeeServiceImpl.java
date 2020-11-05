package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	Employee obj = new Employee();
	Scanner sc = new Scanner(System.in);
	public void getInsuranceScheme() {
		if(obj.getSalary()>5000 && obj.getSalary()<20000 || obj.getDesignation()=="System Associate") {
			obj.setInsuranceScheme("C");	
		}
		else if(obj.getSalary()>=20000 && obj.getSalary()<40000 || obj.getDesignation()=="Programmer")
		{
			obj.setInsuranceScheme("B");
		}
		else if(obj.getSalary()>=40000  || obj.getDesignation()=="Manager")
		{
			obj.setInsuranceScheme("A");
		}
		else if(obj.getSalary()<5000 || obj.getDesignation()=="Clerkr")
		{
			obj.setInsuranceScheme("No insurance scheme");
		}
		
	}
	public Employee getEmployeeDetails() {
		System.out.println("Enter Your Details");
		System.out.print("Enter Id: ");
		obj.setId(sc.nextLine());
		System.out.print("Enter Name: ");
		obj.setName(sc.nextLine());
		System.out.print("Enter Salary: ");
		obj.setSalary(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter Designation: ");
		obj.setDesignation(sc.nextLine());
		return obj;
	}
	public void displayEmpDetails() {
		System.out.println("Employee Details: ");
		System.out.println("Id: "+obj.getId());
		System.out.println("Name: "+obj.getName());
		System.out.println("Salary: "+obj.getSalary());
		System.out.println("Designation: "+obj.getDesignation());
		System.out.println("Designation: "+obj.getInsuranceScheme());
	}
	
}

package com.cg.eis.pl;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;
public class EmployeeTest {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		EmployeeServiceImpl emp=new EmployeeServiceImpl();
		emp.getEmployeeDetails();
		emp.getInsuranceScheme();
		emp.displayEmpDetails();
	}
}

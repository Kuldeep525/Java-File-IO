package com.bridgelab.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRoll {
	
	List<EmployeeData> employeeDataList = new ArrayList<>();


	public static void main(String[] args) {
		
		EmployeePayRoll employee = new EmployeePayRoll();
		Scanner consoleInputReader = new Scanner(System.in);
		
		employee.readEmployeePayRollData( consoleInputReader );
		employee.writeEmployeePayRollData();
	}

	private void readEmployeePayRollData(Scanner consoleInputReader) {
		
		System.out.println("Enter the Id ");
		int id = consoleInputReader.nextInt();
		System.out.println("Enter the Name");
		String name = consoleInputReader.next();
		System.out.println("Enter the Salary");
		double salary = consoleInputReader.nextDouble();
		
		employeeDataList.add(new EmployeeData(id,name,salary));
		
	}

	private void writeEmployeePayRollData() {
		System.out.println(employeeDataList);
		
	}
}

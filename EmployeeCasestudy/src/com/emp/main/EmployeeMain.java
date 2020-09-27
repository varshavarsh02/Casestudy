package com.emp.main;

import java.util.Scanner;

import com.emp.jdbc.Employee;
import com.emp.pojo.EmployeePojo;

public class EmployeeMain {

	public static void main(String[] args) throws Exception {

		Employee emp = new Employee();
		EmployeePojo e = new EmployeePojo();
		int ch = 0;

		while (ch == 0) {
			System.out.println("select the option");
			System.out.println("1 -> Create an Employee");
			System.out.println("2 -> Read Employee details");
			System.out.println("3 -> Update Employee details");
			System.out.println("4 -> Delete Employee");

			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {
                                 //switch case1 used to insert employee details from user
			case 1: {
				System.out.println("Enter Employee Name");
				e.setEmployee_Name(sc.next());
				System.out.println("Enter Employee Address");
				e.setEmployee_Address(sc.next());
				System.out.println("Enter Date of joining in the formate 'YYYY-MM-DD'");
				e.setDate_of_Joining(sc.next());
				System.out.println("Enter Experience");
				e.setExperience(sc.nextInt());
				System.out.println("Enter Date of Birth in the formate 'YYYY-MM-DD'");
				e.setDate_of_Birth(sc.next());

				int val = emp.createEmp(e);
				if (val == 0)
					System.out.println("Failed to insert Employee details");
				else
					System.out.println("Employee details inserted succesuffly...!!!");
				break;
			}
                                //switch case2 used to display employee details by taking employee id from user

			case 2: {
				System.out.println("Enter the Employee id to get the details");
				e.setEmployee_Id(sc.nextInt());
				emp.readEmp(e);
				break;
			}
                                //switch case3 used to update employee details by taking employee id from user

			case 3: {
				System.out.println("Enter Employee Id to update its details");
				e.setEmployee_Id(sc.nextInt());
				System.out.println("Enter Employee Name");
				e.setEmployee_Name(sc.next());
				System.out.println("Enter Employee Address");
				e.setEmployee_Address(sc.next());
				System.out.println("Enter Date Of Joining in the formate 'YYYY-MM-DD'");
				e.setDate_of_Joining(sc.next());
				System.out.println("Enter Experience");
				e.setExperience(sc.nextInt());
				System.out.println("Enter Date Of Birth in the formate 'YYYY-MM-DD'");
				e.setDate_of_Birth(sc.next());

				int val = emp.updateEmp(e);
				if (val == 0)
					System.out.println("Failed to Update Employee details");
				else
					System.out.println("New Employee details Updated successfully...!!!");
				break;

			}
                                //switch case4 used to delete employee details by taking employee id from user

			case 4: {
				System.out.println("Enter Employee Id to delete the details");
				e.setEmployee_Id(sc.nextInt());

				int val = emp.deleteEmp(e);
				if (val == 0)
					System.out.println("Failed to delete the Employee details");
				else
					System.out.println("Employee details deleted successfully...!!!");
				break;

			}

			}

			System.out.println("Press 0 to continue");
			ch = sc.nextInt();
		}

	}

}

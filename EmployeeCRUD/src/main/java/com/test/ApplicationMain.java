package com.test;

import java.util.Scanner;

public class ApplicationMain {

	public static void main(String[] args) {

		int c = 0;
		EmployeeDAO employeeDAO = new EmployeeDAO();
		do {
			System.out.println("****************************Employee Management*****************************");
			System.out.println("===================================================================");
			System.out.print("1>Display All Employee");
			System.out.print("2>Add Employee");
			System.out.println("3>Update Employee");
			System.out.print("4>Delete Employee");
			System.out.println("5>Exit");
			System.out.println("===================================================================");
			System.out.print("Enter Your Choice:");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				employeeDAO.getAllEmployees();
				break;

			case 2:
				System.out.println("Enter employee first name: ");
				String fName = sc.next();
				System.out.println("Enter employee last name: ");
				String lName = sc.next();
				System.out.println("Enter employee city: ");
				String city = sc.next();
				System.out.println("Enter employee mobile: ");
				String mobile = sc.next();

				Employee emp = new Employee();
				emp.setFirstName(fName);
				emp.setLastName(lName);
				emp.setCity(city);
				emp.setMobile(mobile);

				employeeDAO.addEmployee(emp);
				break;

			case 3:
				System.out.println("Enter employee Id: ");
				int id = sc.nextInt();
				System.out.println("Enter employee first name: ");
				String firstName = sc.next();
				System.out.println("Enter employee last name: ");
				String lastName = sc.next();
				System.out.println("Enter employee city: ");
				String eCity = sc.next();
				System.out.println("Enter employee mobile: ");
				String eMobile = sc.next();

				Employee emp2 = new Employee();
				emp2.setId(id);
				emp2.setFirstName(firstName);
				emp2.setLastName(lastName);
				emp2.setCity(eCity);
				emp2.setMobile(eMobile);

				employeeDAO.updateEmployee(emp2, id);
				break;

			case 4:
				System.out.print("Enter the employee ID to delete: ");
				int empId = sc.nextInt();
				employeeDAO.deleteEmployee(empId);
				break;

			case 5:
				System.out.println("........Thank You........");
				return;

			default:
				System.out.println("please enter valid choice");
				break;
			}

			System.out.print("do you want to continue(y/n)");
			c = sc.next().charAt(0);
		} while ((c == 'y' || c == 'Y') || (c == 'n' && c == 'N'));

	}
}

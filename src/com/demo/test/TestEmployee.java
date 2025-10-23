package com.demo.test;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import java.util.*;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();
        int choice;

        do {
            System.out.println("\n====== Employee Menu ======");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Show All Employees");
            System.out.println("4. Show Sorted Employees (by ID)");
            System.out.println("5. Find Employee by Name");
            System.out.println("6. Save All Employees to File");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Role: ");
                    String role = sc.nextLine();
                    service.addEmployee(new Employee(id, name, role));
                    break;

                case 2:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = sc.nextInt();
                    if (service.removeEmployee(removeId))
                        System.out.println("Employee removed.");
                    else
                        System.out.println("Employee not found.");
                    break;

                case 3:
                    service.showAll();
                    break;

                case 4:
                    service.showSorted();
                    break;

                case 5:
                    System.out.print("Enter Employee name to search: ");
                    String searchName = sc.nextLine();
                    service.findByName(searchName);
                    break;

                case 6:
                    service.saveToFile("employees.dat");
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        sc.close();
    }
}

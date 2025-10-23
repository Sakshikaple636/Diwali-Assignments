package com.demo.service;

import com.demo.beans.Employee;
import java.util.*;
import java.io.*;

public class EmployeeService {
    private ArrayList<Employee> list = new ArrayList<>();

    // Add Employee
    public void addEmployee(Employee e) {
        list.add(e);
    }

    // Remove Employee by ID
    public boolean removeEmployee(int id) {
        return list.removeIf(e -> e.getEmpID() == id);
    }

    // Show all Employees
    public void showAll() {
        if (list.isEmpty())
            System.out.println("No employees to display.");
        else
            list.forEach(System.out::println);
    }

    // Show all Employees in sorted order by empID
    public void showSorted() {
        list.stream()
            .sorted(Comparator.comparingInt(Employee::getEmpID))
            .forEach(System.out::println);
    }

    // Find Employee by Name
    public void findByName(String name) {
        boolean found = false;
        for (Employee e : list) {
            if (e.getEmpName().equalsIgnoreCase(name)) {
                System.out.println(e);
                found = true;
            }
        }
        if (!found)
            System.out.println("Employee not found.");
    }

    // Save all Employees to file (serialization)
    public void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(list);
            System.out.println("All employees saved successfully to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }
}

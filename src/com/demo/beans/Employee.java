package com.demo.beans;

import java.io.Serializable;

public class Employee implements Serializable {
    private String empName;
    private int empID;
    private String empRole;

    // No-argument constructor
    public Employee() {
        this.empRole = "Not Assigned";
    }

    // Constructor with empID and empName
    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = "Staff";
    }

    // Constructor with all parameters
    public Employee(int empID, String empName, String empRole) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = empRole;
    }

    // Getters
    public int getEmpID() { return empID; }
    public String getEmpName() { return empName; }
    public String getEmpRole() { return empRole; }

    // Setters
    public void setEmpRole(String empRole) { this.empRole = empRole; }

    // Override toString()
    @Override
    public String toString() {
        return "Employee [ID=" + empID + ", Name=" + empName + ", Role=" + empRole + "]";
    }
}

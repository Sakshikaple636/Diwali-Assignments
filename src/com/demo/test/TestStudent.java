package com.demo.test;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.exceptions.LowAttendanceException;
import java.util.*;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter details for student " + i + " (rollno, name, course, attendance, score):");
            int roll = sc.nextInt();
            String name = sc.next();
            String course = sc.next();
            double att = sc.nextDouble();
            double score = sc.nextDouble();

            Student s = new Student(roll, name, course, att, score);
            try {
                StudentService.validateAttendance(s);
                students.add(s);
            } catch (LowAttendanceException e) {
                System.out.println(e.getMessage());
            }
        }

        List<Student> sorted = StudentService.sortByAttendanceDesc(students);
        System.out.println("\nSorted Students (by Attendance Desc):");
        for (Student s : sorted) {
            System.out.println(s);
        }

        StudentService.saveToFile(sorted);
    }
}

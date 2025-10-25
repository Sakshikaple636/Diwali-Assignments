package com.demo.service;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.exceptions.LowAttendanceException;
import java.util.*;

public class StudentService {

    public static void validateAttendance(Student s) throws LowAttendanceException {
        if (s.getAttendancePercentage() < 60)
            throw new LowAttendanceException("Student " + s.getSname() + " has low attendance: " + s.getAttendancePercentage() + "%");
    }

    public static List<Student> sortByAttendanceDesc(List<Student> list) {
        list.sort((s1, s2) -> Double.compare(s2.getAttendancePercentage(), s1.getAttendancePercentage()));
        return list;
    }

    public static void saveToFile(List<Student> students) {
        StudentDao.saveStudents(students);
    }

    public static List<Student> loadFromFile() {
        return StudentDao.loadStudents();
    }
}

package com.demo.dao;

import com.demo.beans.Student;
import java.io.*;
import java.util.*;

public class StudentDao {

    private static final String FILE_NAME = "students.ser";

    public static void saveStudents(List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
            System.out.println("Students saved successfully to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Student> loadStudents() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(" No existing file found. Returning empty list.");
            return new ArrayList<>();
        }
    }
}

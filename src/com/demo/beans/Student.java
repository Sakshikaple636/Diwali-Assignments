package com.demo.beans;

import java.io.Serializable;

public class Student implements Serializable {
    private int rollno;
    private String sname;
    private String course;
    private double attendancePercentage;
    private double score;

    public Student() {}

    public Student(int rollno, String sname, String course, double attendancePercentage, double score) {
        this.rollno = rollno;
        this.sname = sname;
        this.course = course;
        this.attendancePercentage = attendancePercentage;
        this.score = score;
    }

    public int getRollno() { return rollno; }
    public String getSname() { return sname; }
    public String getCourse() { return course; }
    public double getAttendancePercentage() { return attendancePercentage; }
    public double getScore() { return score; }

    public String calculateGrade() {
        if (score >= 90) return "A+";
        else if (score >= 80) return "A";
        else if (score >= 70) return "B";
        else if (score >= 60) return "C";
        else return "D";
    }

    @Override
    public String toString() {
        return rollno + " | " + sname + " | " + course + " | Attendance: " + attendancePercentage + "% | Score: " + score + " | Grade: " + calculateGrade();
    }
}

package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Attendance Management System!");
        System.out.println("----- Core Domain Modelling -----");

        // Create array of Students
        Student[] students = {
            new Student(1, "Alice", 20),
            new Student(2, "Bob", 21),
            new Student(3, "Charlie", 19)
        };

        // Create array of Courses
        Course[] courses = {
            new Course(101, "Mathematics", 10),
            new Course(102, "Physics", 8),
            new Course(103, "Computer Science", 12)
        };

        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.displayDetails();
        }

        System.out.println("\n--- Course Details ---");
        for (Course c : courses) {
            c.displayDetails();
        }
    }
}

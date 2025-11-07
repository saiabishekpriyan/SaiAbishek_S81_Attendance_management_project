package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Attendance Management System!");
        System.out.println("----- Constructor Initialization & Auto-ID Generation -----");

        // Create Students using constructor
        Student[] students = {
            new Student("Alice", 20),
            new Student("Bob", 21),
            new Student("Charlie", 19),
            new Student("Diana", 22)
        };

        // Create Courses using constructor
        Course[] courses = {
            new Course("Mathematics", 10),
            new Course("Physics", 8),
            new Course("Computer Science", 12),
            new Course("Biology", 9)
        };

        // Display Student Details
        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.displayDetails();
        }

        // Display Course Details
        System.out.println("\n--- Course Details ---");
        for (Course c : courses) {
            c.displayDetails();
        }
    }
}

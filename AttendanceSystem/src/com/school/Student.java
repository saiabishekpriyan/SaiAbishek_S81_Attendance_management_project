package com.school;

public class Student {
    private static int nextStudentIdCounter = 1; // Auto-increment ID
    private int studentId;
    private String name;
    private int age;

    // Constructor that sets name and assigns auto-generated ID
    public Student(String name, int age) {
        this.studentId = nextStudentIdCounter++;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Student ID: S" + studentId + ", Name: " + name + ", Age: " + age);
    }
}

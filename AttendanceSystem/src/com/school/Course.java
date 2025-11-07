package com.school;

import java.util.ArrayList;
import java.util.List;

public class Course implements Storable {
    private int courseId;
    private String courseName;
    private int capacity;
    private List<Student> enrolledStudents;

    public Course(int courseId, String courseName, int capacity) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public int getNumberOfEnrolledStudents() {
        return enrolledStudents.size();
    }

    public boolean addStudent(Student student) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(student);
            System.out.println("✅ " + student.getName() + " enrolled in " + courseName);
            return true;
        } else {
            System.out.println("⚠️  Cannot enroll " + student.getName() + " in " + courseName + ": capacity full (" + capacity + ")");
            return false;
        }
    }

    public void displayDetails() {
        System.out.println("Course ID: " + courseId + ", Name: " + courseName);
        System.out.println("Capacity: " + capacity + ", Enrolled: " + getNumberOfEnrolledStudents());
        if (!enrolledStudents.isEmpty()) {
            System.out.println("Enrolled Students:");
            for (Student s : enrolledStudents) {
                System.out.println("  - " + s.getName());
            }
        } else {
            System.out.println("No students enrolled yet.");
        }
    }

    @Override
    public String toDataString() {
        return courseId + "," + courseName + "," + capacity;
    }
}

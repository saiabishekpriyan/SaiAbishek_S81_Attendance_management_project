package com.school;

public class Course {
    private static int nextCourseIdCounter = 101; // Auto-increment ID starting from 101
    private int courseId;
    private String courseName;
    private int durationWeeks;

    // Constructor that sets course name and assigns auto-generated ID
    public Course(String courseName, int durationWeeks) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
    }

    // Getters
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDurationWeeks() {
        return durationWeeks;
    }

    // Display course details
    public void displayDetails() {
        System.out.println("Course ID: C" + courseId + ", Name: " + courseName + ", Duration: " + durationWeeks + " weeks");
    }
}

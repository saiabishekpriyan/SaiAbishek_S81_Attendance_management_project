package com.school;

public class Course {
    private int courseId;
    private String courseName;
    private int durationWeeks;

    // Constructor
    public Course(int courseId, String courseName, int durationWeeks) {
        this.courseId = courseId;
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

    // Display details
    public void displayDetails() {
        System.out.println("Course ID: " + courseId + ", Name: " + courseName + ", Duration: " + durationWeeks + " weeks");
    }
}

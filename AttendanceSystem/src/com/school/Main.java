package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "10th Grade"));
        students.add(new Student("Bob", "9th Grade"));

        // Courses
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Mathematics"));
        courses.add(new Course("Physics"));

        // Attendance
        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(students.get(0).getId(), courses.get(0).getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(students.get(1).getId(), courses.get(1).getCourseId(), "Absent"));

        // Display
        System.out.println("--- Display Data ---");
        for (Student s : students) s.displayDetails();
        for (Course c : courses) c.displayDetails();
        for (AttendanceRecord a : attendanceLog) a.displayRecord();

        // Save to files
        FileStorageService storageService = new FileStorageService();
        storageService.saveData(students, "students.txt");
        storageService.saveData(courses, "courses.txt");
        storageService.saveData(attendanceLog, "attendance_log.txt");
    }
}

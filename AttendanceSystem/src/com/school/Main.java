package com.school;

import java.util.List;

public class Main {

    public static void displaySchoolDirectory(RegistrationService regService) {
        System.out.println("\n--- School Directory ---");
        List<Person> people = regService.getAllPeople();
        for (Person person : people) {
            person.displayDetails();
        }
    }

    public static void main(String[] args) {
        // Initialize services
        FileStorageService storageService = new FileStorageService();
        RegistrationService regService = new RegistrationService(storageService);
        AttendanceService attendanceService = new AttendanceService(storageService, regService);

        // Register students
        Student s1 = regService.registerStudent("Alice", "10th Grade");
        Student s2 = regService.registerStudent("Bob", "9th Grade");

        // Register teachers
        Teacher t1 = regService.registerTeacher("Mr. Smith", "Mathematics");
        Teacher t2 = regService.registerTeacher("Ms. Johnson", "Physics");

        // Register staff
        Staff st1 = regService.registerStaff("Jane Doe", "Administrator");

        // Create courses
        Course c1 = regService.createCourse("Mathematics");
        Course c2 = regService.createCourse("Physics");

        // Display school directory
        displaySchoolDirectory(regService);

        // Mark attendance
        attendanceService.markAttendance(s1, c1, "Present");
        attendanceService.markAttendance(2, 102, "Absent"); // Using IDs
        attendanceService.markAttendance(s1, c2, "Late"); // Invalid status example

        // Display attendance
        attendanceService.displayAttendanceLog();
        attendanceService.displayAttendanceLog(s1);
        attendanceService.displayAttendanceLog(c2);

        // Save data
        regService.saveAllRegistrations();
        attendanceService.saveAttendanceData();
    }
}

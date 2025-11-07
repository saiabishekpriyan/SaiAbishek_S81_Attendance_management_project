package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Method to display all people polymorphically
    public static void displaySchoolDirectory(List<Person> people) {
        System.out.println("\n--- School Directory ---");
        for (Person person : people) {
            person.displayDetails();
        }
    }

    public static void main(String[] args) {

        // -------------------------
        // 1️⃣ Create Person objects
        // -------------------------
        Student s1 = new Student("Alice", "10th Grade");
        Student s2 = new Student("Bob", "9th Grade");

        Teacher t1 = new Teacher("Mr. Smith", "Mathematics");
        Teacher t2 = new Teacher("Ms. Johnson", "Physics");

        Staff st1 = new Staff("Jane Doe", "Administrator");

        // -------------------------
        // 2️⃣ Create Course objects
        // -------------------------
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Physics");

        // -------------------------
        // 3️⃣ Polymorphic school directory
        // -------------------------
        List<Person> schoolPeople = new ArrayList<>();
        schoolPeople.add(s1);
        schoolPeople.add(s2);
        schoolPeople.add(t1);
        schoolPeople.add(t2);
        schoolPeople.add(st1);

        displaySchoolDirectory(schoolPeople);

        // -------------------------
        // 4️⃣ Prepare lists for AttendanceService
        // -------------------------
        List<Student> allStudents = new ArrayList<>();
        allStudents.add(s1);
        allStudents.add(s2);

        List<Course> allCourses = new ArrayList<>();
        allCourses.add(c1);
        allCourses.add(c2);

        // -------------------------
        // 5️⃣ Create storage and attendance service
        // -------------------------
        FileStorageService storageService = new FileStorageService();
        AttendanceService attendanceService = new AttendanceService(storageService);

        // -------------------------
        // 6️⃣ Mark attendance (overloaded)
        // -------------------------
        attendanceService.markAttendance(s1, c1, "Present");                  // Using objects
        attendanceService.markAttendance(2, c2.getCourseId(), "Absent", allStudents, allCourses); // Using IDs

        // Test invalid status
        attendanceService.markAttendance(s1, c2, "Late"); // Will show "Invalid"

        // -------------------------
        // 7️⃣ Display attendance
        // -------------------------
        attendanceService.displayAttendanceLog();       // Full log
        attendanceService.displayAttendanceLog(s1);     // Filtered by student
        attendanceService.displayAttendanceLog(c2);     // Filtered by course

        // -------------------------
        // 8️⃣ Save attendance to file
        // -------------------------
        attendanceService.saveAttendanceData();

        System.out.println("\n✅ Data saved to students.txt, courses.txt, and attendance_log.txt");
    }
}


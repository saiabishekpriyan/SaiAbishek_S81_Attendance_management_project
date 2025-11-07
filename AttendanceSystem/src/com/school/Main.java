package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", "10th Grade");
        Student s2 = new Student("Bob", "9th Grade");

        Teacher t1 = new Teacher("Mr. Smith", "Mathematics");
        Teacher t2 = new Teacher("Ms. Johnson", "Physics");

        Staff staff1 = new Staff("Jane Doe", "Administrator");

        System.out.println("\n--- Person Details ---");
        s1.displayDetails();
        s2.displayDetails();
        t1.displayDetails();
        t2.displayDetails();
        staff1.displayDetails();

        // Optional: create AttendanceRecords using student.getId()
        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(s1.getId(), 101, "Present"));
        attendanceLog.add(new AttendanceRecord(s2.getId(), 102, "Absent"));

        System.out.println("\n--- Attendance Records ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}

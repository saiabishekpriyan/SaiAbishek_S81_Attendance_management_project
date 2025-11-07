package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void displaySchoolDirectory(List<Person> people) {
        System.out.println("\n--- School Directory ---");
        for (Person person : people) {
            person.displayDetails(); // polymorphic call
        }
    }

    public static void main(String[] args) {

        // Students
        Student s1 = new Student("Alice", "10th Grade");
        Student s2 = new Student("Bob", "9th Grade");

        // Teachers
        Teacher t1 = new Teacher("Mr. Smith", "Mathematics");
        Teacher t2 = new Teacher("Ms. Johnson", "Physics");

        // Staff
        Staff staff1 = new Staff("Jane Doe", "Administrator");

        // Polymorphic list of all people
        List<Person> schoolPeople = new ArrayList<>();
        schoolPeople.add(s1);
        schoolPeople.add(s2);
        schoolPeople.add(t1);
        schoolPeople.add(t2);
        schoolPeople.add(staff1);

        // Display school directory (polymorphic call)
        displaySchoolDirectory(schoolPeople);

        // Courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Physics");
        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);

        // Attendance
        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(s1, c1, "Present"));
        attendanceLog.add(new AttendanceRecord(s2, c2, "Absent"));
        attendanceLog.add(new AttendanceRecord(s1, c2, "Invalid")); // test invalid

        System.out.println("\n--- Attendance Records ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }

        // File Storage
        FileStorageService storageService = new FileStorageService();

        // Save only Student instances from polymorphic list
        List<Student> studentList = new ArrayList<>();
        for (Person p : schoolPeople) {
            if (p instanceof Student) {
                studentList.add((Student) p);
            }
        }

        storageService.saveData(studentList, "students.txt");
        storageService.saveData(courses, "courses.txt");
        storageService.saveData(attendanceLog, "attendance_log.txt");
    }
}

package com.school;

import java.util.ArrayList;
import java.util.List;

public class AttendanceService {
    private List<AttendanceRecord> attendanceLog;
    private FileStorageService storageService;

    public AttendanceService(FileStorageService storageService) {
        this.attendanceLog = new ArrayList<>();
        this.storageService = storageService;
    }

    // 1️⃣ Mark attendance using Student and Course objects
    public void markAttendance(Student student, Course course, String status) {
        AttendanceRecord record = new AttendanceRecord(student, course, status);
        attendanceLog.add(record);
    }

    // 2️⃣ Mark attendance using IDs and lookup
    public void markAttendance(int studentId, int courseId, String status, List<Student> allStudents, List<Course> allCourses) {
        Student student = findStudentById(studentId, allStudents);
        Course course = findCourseById(courseId, allCourses);
        if (student != null && course != null) {
            markAttendance(student, course, status);
        } else {
            System.out.println("⚠️ Student or Course not found for ID: " + studentId + ", " + courseId);
        }
    }

    // Helper: find Student by ID
    private Student findStudentById(int id, List<Student> students) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    // Helper: find Course by ID
    private Course findCourseById(int id, List<Course> courses) {
        for (Course c : courses) {
            if (c.getCourseId() == id) return c;
        }
        return null;
    }

    // 3️⃣ Display all attendance records
    public void displayAttendanceLog() {
        System.out.println("\n--- Full Attendance Log ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }

    // 4️⃣ Display records filtered by Student
    public void displayAttendanceLog(Student student) {
        System.out.println("\n--- Attendance for Student: " + student.getName() + " ---");
        for (AttendanceRecord record : attendanceLog) {
            if (record.getStudent().getId() == student.getId()) {
                record.displayRecord();
            }
        }
    }

    // 5️⃣ Display records filtered by Course
    public void displayAttendanceLog(Course course) {
        System.out.println("\n--- Attendance for Course: " + course.getCourseName() + " ---");
        for (AttendanceRecord record : attendanceLog) {
            if (record.getCourse().getCourseId() == course.getCourseId()) {
                record.displayRecord();
            }
        }
    }

    // 6️⃣ Save all attendance data
    public void saveAttendanceData() {
        storageService.saveData(attendanceLog, "attendance_log.txt");
    }
}

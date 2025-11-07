package com.school;

public class Main {
    public static void main(String[] args) {
        RegistrationService registrationService = new RegistrationService();

        // Register Students
        Student s1 = registrationService.registerStudent("Alice", "10th Grade");
        Student s2 = registrationService.registerStudent("Bob", "9th Grade");
        Student s3 = registrationService.registerStudent("Charlie", "8th Grade");

        // Register Teachers
        registrationService.registerTeacher("Mr. Smith", "Mathematics");
        registrationService.registerTeacher("Ms. Johnson", "Physics");

        // Create Courses with capacity
        Course math = registrationService.createCourse("Mathematics", 2);
        Course physics = registrationService.createCourse("Physics", 1);

        // Enroll students in courses
        registrationService.enrollStudentInCourse(s1, math);
        registrationService.enrollStudentInCourse(s2, math);
        registrationService.enrollStudentInCourse(s3, math); // Exceeds capacity

        registrationService.enrollStudentInCourse(s1, physics);
        registrationService.enrollStudentInCourse(s2, physics); // Exceeds capacity

        // Display Course Details
        System.out.println("\n--- Course Details After Enrollment ---");
        for (Course c : registrationService.getCourses()) {
            c.displayDetails();
        }

        System.out.println("\n✅ Capacity Management Demonstration Complete.");
    }
}

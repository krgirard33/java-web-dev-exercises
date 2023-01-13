package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private final int numberOfCredits;
    private final double gpa;

    // NAME
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // STUDENT ID
    public int getStudentId() {
        return studentId;
    }
    private void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // CREDITS
    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    // GPA
    public double getGpa() {
        return gpa;
    }

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }
}
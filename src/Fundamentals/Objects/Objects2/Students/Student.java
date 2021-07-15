package Fundamentals.Objects.Objects2.Students;

import java.text.DecimalFormat;

public class Student {
    private String firstName;
    private String lastName;
    private Double grade;

    public Student(String firstName, String lastName, Double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public Double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + ": " + new DecimalFormat("0.00").format(this.grade);
    }
}

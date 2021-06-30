package Fundamentals.Objects.Students05;

import java.text.DecimalFormat;

public class Student {
    private String name;
    private String lastName;
    private float grade;

    public Student(String name, String lastName, float grade) {
        this.name = name;
        this.lastName = lastName;
        this.grade = grade;
    }

    public float getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return this.name + " " + this.lastName + ": " + (new DecimalFormat("0.00").format(this.getGrade()));
    }
}

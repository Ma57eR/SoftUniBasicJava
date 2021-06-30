package Fundamentals.Objects.Students05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numOfStudents = Integer.parseInt(scan.nextLine());

        List<Student> students = new ArrayList<>();

        for (int student = 1; student <= numOfStudents; student++) {
            String[] studentInfo = scan.nextLine().split("\\s+");
            Student newStudent = new Student (studentInfo[0], studentInfo[1], Float.parseFloat(studentInfo[2]));
            students.add(newStudent);
        }

        students.sort(Comparator.comparingDouble(Student::getGrade).reversed());

        for (int student = 1; student <= students.size(); student++) {
            System.out.println(students.get(student-1).toString());
        }

    }
}

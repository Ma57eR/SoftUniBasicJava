package Fundamentals.Objects.Objects2.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfStudents = Integer.parseInt(scan.nextLine());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < numOfStudents; i++) {
            String[] student = scan.nextLine().split("\\s+");
            String firstName = student[0];
            String lastName = student[1];
            Double grade = Double.parseDouble(student[2]);
            Student currentStudent = new Student(firstName, lastName, grade);
            students.add(currentStudent);
        }
        students.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}

package Fundamentals.Objects.Objects2.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        String[] input = scan.nextLine().split(" ");
        String command = input[0];
        String lastName;
        int age;
        String homeTown;


        while (!command.equals("end")) {
            String firstName = input[0];
            lastName = input[1];
            age = Integer.parseInt(input[2]);
            homeTown = input[3];
            Student currentStudent = new Student(firstName, lastName, age, homeTown);
            students.add(currentStudent);

            input = scan.nextLine().split(" ");
            command = input[0];

        }
        String filterTown = scan.nextLine();

        for (Student student : students) {
            if (filterTown.equals(student.getHomeTown())) {
                System.out.println(student.toString());
            }
        }
    }
}

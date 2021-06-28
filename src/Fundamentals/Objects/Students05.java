package Fundamentals.Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<Student> students = new ArrayList<>(); // създаваме списък от студенти с тяхната информация. Всеки индекс съдържа полетата на класа Student

        while (!input.equals("end")) {
            String[] studentData = input.split(" ");

            String name = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String homeTown = studentData[3];

            Student student = new Student(name, lastName, age, homeTown); //Взимаме данните от инпута и ги вкарваме за даден студент
            students.add(student); //Добавяме информацията от полетата за конкретния студент

            input = scan.nextLine();
        }

        String cityFilter = scan.nextLine();

        for (Student student : students) {
            if (student.getHomeTown().equals(cityFilter)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }


    }
}


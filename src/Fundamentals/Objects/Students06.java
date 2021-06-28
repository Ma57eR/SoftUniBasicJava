package Fundamentals.Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<Student2> students = new ArrayList<>(); // създаваме списък от студенти с тяхната информация. Всеки индекс съдържа полетата на класа Student

        while (!input.equals("end")) {
            String[] studentData = input.split(" ");

            String name = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String homeTown = studentData[3];

            Student2 student = new Student2(name, lastName, age, homeTown); //Взимаме данните от инпута и ги вкарваме за даден студент


            if (!isStudentUnique(students, name, lastName, age, homeTown)) {
                students.add(student); //Добавяме информацията от полетата за конкретния студент}
            }
            input = scan.nextLine();
        }

        String cityFilter = scan.nextLine();

        for (Student2 student : students) {
            if (student.getHomeTown().equals(cityFilter)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }


    }

    private static boolean isStudentUnique(List<Student2> students, String name, String lastName, int age, String town) {
        for (Student2 student : students) {
            boolean isFirstNameSame = student.getFirstName().equals(name);
            boolean isLastNameSame = student.getLastName().equals(lastName);
            if (isFirstNameSame && isLastNameSame) {
                student.setAge(age);
                student.setHomeTown(town);
                return true;
            }
        }
        return false;
    }
}


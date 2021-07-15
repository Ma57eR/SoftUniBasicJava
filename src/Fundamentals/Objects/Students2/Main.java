package Fundamentals.Objects.Students2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        String input = scan.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];

            if (isStudentExisting(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName);
                //На намерения студент му заместваме данните
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(city);
            } else {
                Student currentStudent = new Student(firstName, lastName, age, city);
                students.add(currentStudent);
            }
            input = scan.nextLine();
        }
        String filterCity = scan.nextLine();

        for (Student student : students) {
            if (filterCity.equals(student.getHomeTown())) {
                System.out.println(student.toString());
            }
        }

    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        //Създаваме празен обект
        Student existingStudent = null;
        //Минаваме през всички обекти на студентите
        for (Student student : students) {
            //Ако намерим съвпадение по първо и последно име на студента
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student; //Заместваме празния обект с данните на студента
            }
        }
        return existingStudent;
    }

    private static boolean isStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}

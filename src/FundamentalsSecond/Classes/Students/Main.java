package FundamentalsSecond.Classes.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        String[] input = scan.nextLine().split(" ");

        while (!input[0].equals("end")) {
            String first_name = input[0];
            String last_name = input[1];
            int age = Integer.parseInt(input[2]);
            String homeTown = input[3];
            Student currentStudent = new Student(first_name, last_name, age, homeTown);
            if (isStudentExisting(students, first_name, last_name)) {
                Student student = getExistingStudent(students, first_name, last_name);
                student.setFirst_name(first_name);
                student.setLast_name(last_name);
                student.setAge(age);
                student.setHometown(homeTown);
            } else {
            students.add(currentStudent);
            }
            input = scan.nextLine().split(" ");
        }

        String city = scan.nextLine();

        students.stream()
                .filter(s -> s.hometown.equals(city))
                .forEach(s -> {
                    System.out.printf("%s %s %d %s%n", s.first_name, s.last_name, s.age, s.hometown);
                });


    }

    private static Student getExistingStudent(List<Student> students, String first_name, String last_name) {
        Student existingStudent = null;
        for (Student student : students) {
            //Намираме студента с повтарящи се имена и го връщаме от метода
            if (student.first_name.equals(first_name) && student.last_name.equals(last_name)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }

    private static boolean isStudentExisting(List<Student> students, String first_name, String last_name) {

        for (Student student : students) {
            //Минаваме през всеки студент, за да проверим дали първото и последното име съвпадат
            if (student.getFirst_name().equals(first_name) && student.getLast_name().equals(last_name)) {
                return true;
            }
        }
        return false;
    }


}

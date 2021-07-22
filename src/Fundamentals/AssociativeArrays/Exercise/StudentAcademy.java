package Fundamentals.AssociativeArrays.Exercise;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfStudents = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String, Double> students = new LinkedHashMap();

        for (int i = 0; i < numOfStudents; i++) {
            String studentName = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

            boolean isStudentExist = isStudentExist(students, studentName);
            if (isStudentExist) {
                double tmp = (students.get(studentName) + grade) / 2;
                students.put(studentName, tmp);
            } else {
                students.put(studentName, grade);
            }
        }
        students
                .entrySet()
                .stream()
                .filter(studentGrade -> studentGrade.getValue() >= 4.50)
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .forEach(student ->
                        System.out.printf("%s -> %.2f%n", student.getKey(), student.getValue()));
    }

    private static boolean isStudentExist(LinkedHashMap<String, Double> students, String studentName) {
        for (Map.Entry<String, Double> entry : students.entrySet()) {
            if (entry.getKey().equals(studentName)) {
                return true;
            }
        }
        return false;
    }
}


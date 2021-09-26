package Advanced.SetsAndMaps;

import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfStudents = Integer.parseInt(scan.nextLine());
        Map<String, List<Double>> studentData = new TreeMap<>();

        while (numOfStudents-- > 0) {
            String studentName = scan.nextLine();
            double[] grades = Arrays.stream(scan.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

            studentData.putIfAbsent(studentName, new LinkedList<>());
            //Добавяме оценките на студента
            for (double grade : grades) {
                studentData.get(studentName).add(grade);
            }
        }

        for (Map.Entry<String, List<Double>> student : studentData.entrySet()) {
            System.out.println(student.getKey() + " is graduated with " +
                    student.getValue()
                            .stream()
                            .mapToDouble(grade -> grade)
                            .average()
                            .getAsDouble());
        }
    }
}

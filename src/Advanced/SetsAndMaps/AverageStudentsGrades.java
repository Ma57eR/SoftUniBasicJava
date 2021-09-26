package Advanced.SetsAndMaps;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfStudents = Integer.parseInt(scan.nextLine());
        Map<String, ArrayList<Double>> studentData = new TreeMap<>();

        for (int i = 0; i < numOfStudents; i++) {

            String[] tokens = scan.nextLine().split("\\s+");
            String name = tokens[0];
            Double grade = Double.parseDouble(tokens[1]);
            if (!studentData.containsKey(name)) {
                studentData.put(name, new ArrayList<>());
                studentData.get(name).add(grade);
            } else {
                studentData.get(name).add(grade);
            }
        }
        studentData.entrySet().forEach(entry -> {
            System.out.print(entry.getKey() + " -> ");
            entry.getValue().forEach(value ->
                System.out.printf("%.2f ", value));
            System.out.printf("(avg: %.2f)%n", entry.getValue().stream().mapToDouble(e -> e).average().getAsDouble());

        });
    }
}

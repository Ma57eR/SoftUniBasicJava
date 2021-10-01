package Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());


        Map<String, Integer> peopleInfo = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(", ");
            String name = tokens[0];
            int personAge = Integer.parseInt(tokens[1]);
            peopleInfo.put(name, personAge);
        }
        String condition = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String format = scan.nextLine();

        switch (condition) {
            case "younger":
                for (Map.Entry<String, Integer> person : peopleInfo.entrySet()) {
                    if () {
                    }
                }
                break;
            case "elder":
                break;
        }
    }

}

package Fundamentals.FinalExams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> employees = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());
        String[] command = scan.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            String commandType = command[0];
            String user = command[1];

            switch (commandType) {
                case "register":
                    String plateNumber = command[2];
                    if (employees.containsKey(user)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                    } else {
                        employees.put(user, plateNumber);
                        System.out.printf("%s registered %s successfully%n", user, plateNumber);
                    }
                    break;
                case "unregister":
                    if (employees.containsKey(user)) {
                        System.out.printf("%s unregistered successfully%n", user);
                        employees.remove(user);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", user);
                    }
                    break;
            }

            command = scan.nextLine().split(" ");
        }
        employees.forEach((employee, plate) -> System.out.printf("%s => %s%n", employee, plate));
    }
}

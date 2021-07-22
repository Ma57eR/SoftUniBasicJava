package Fundamentals.AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfData = Integer.parseInt(scan.nextLine());

        Map<String, String> db = new LinkedHashMap<>();

        for (int i = 0; i < numOfData; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String command = input[0];
            String name;
            String licensePlate;
            switch (command) {
                case "register":
                     name = input[1];
                     licensePlate = input[2];
                   boolean notRegistered = isRegistered(db, name);
                    if (!notRegistered) {
                        db.put(name, licensePlate);
                        System.out.printf("%s registered %s successfully%n", name, licensePlate);
                    } else{
                        System.out.printf("ERROR: already registered with plate number %s%n", db.get(name));
                    }
                        break;
                case "unregister":
                    name = input[1];
                    boolean isRegistered = isRegistered(db, name);
                    if (isRegistered) {
                        db.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", name);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : db.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }

    private static boolean isRegistered(Map<String, String> db, String name) {
        return db.containsKey(name);
    }
}

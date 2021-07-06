package Fundamentals.ExamsPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> itemsList = Arrays.stream(scan.nextLine().split(",\\s+")).collect(Collectors.toList());
        String[] command = scan.nextLine().split(" - ");
        String commandType = command[0];

        while (!commandType.equals("Craft!")) {
            switch (commandType) {
                case "Collect":
                    if (!itemsList.contains(command[1])) {
                        itemsList.add(command[1]);
                    }
                    break;
                case "Drop":
                    if (itemsList.contains(command[1])) {
                        itemsList.remove(itemsList.indexOf(command[1]));
                    }
                    break;
                case "Combine Items":
                    combining(command[1], itemsList);
                    break;
                case "Renew":
                    renew(itemsList, command[1]);
                    break;
            }

            command = scan.nextLine().split(" - ");
            commandType = command[0];
        }

            System.out.printf("%s", String.join(", ", itemsList));

    }

    private static void combining(String s, List<String> itemsList) {
        String[] combine = s.split(":");
        String oldItem = combine[0];
        String newItem = combine[1];
        if (itemsList.contains(oldItem)) {
            itemsList.add(itemsList.indexOf(oldItem) + 1, newItem);
        }
    }

    private static void renew(List<String> itemsList, String item) {
        if (itemsList.contains(item)) {
            String tmp = itemsList.get(itemsList.indexOf(item));
            itemsList.remove(tmp);
            itemsList.add(tmp);
        }
    }

}

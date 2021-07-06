package Fundamentals.ExamsPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream(scan.nextLine().split("!")).collect(Collectors.toList());
        String[] command = scan.nextLine().split(" ");
        String commandType = command[0];
        while (!command[0].equals("Go") && !command[1].equals("Shopping!")) {
            switch (commandType) {
                case "Urgent":
                    if (!shoppingList.contains(command[1])) {
                    shoppingList.add(0, command[1]);
                    }
                    break;
                case "Unnecessary":
                    if (shoppingList.contains(command[1])) {
                        shoppingList.remove(command[1]);
                    }
                    break;
                case "Correct":
                    correctName(command, shoppingList);
                    break;
                case "Rearrange":
                    rearrange(command, shoppingList);
            }

            command = scan.nextLine().split(" ");
            commandType = command[0];
        }
        System.out.printf("%s", String.join(", ", shoppingList));

    }

    private static void rearrange(String[] command, List<String> shoppingList) {
        if (shoppingList.contains(command[1])) {
            shoppingList.remove(command[1]);
            shoppingList.add(command[1]);
        }
    }

    private static void correctName(String[] command, List<String> shoppingList) {
        String oldItem = command[1];
        String newItem = command[2];

        if (shoppingList.contains(oldItem)) {
            shoppingList.set(shoppingList.indexOf(oldItem), newItem);
        }
    }


}


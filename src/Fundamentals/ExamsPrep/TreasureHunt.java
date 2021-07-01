package Fundamentals.ExamsPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> loot = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());
        List<String> command = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

        while (!command.get(0).equals("Yohoho!")) {
            switch (command.get(0)) {
                case "Loot":
                    //Taking new loot and put it at the beginning.If already exist - skip it

                    addLoot(command, loot);
                    break;
                case "Drop":
                    //Drop from index and put at the end. If index index is invalid - skip
                    dropLoot(command, loot);
                    break;
                case "Steal":
                    stealLoot(command, loot);
                    //Someone stealing items for the end. If number is bigger than all, steal all
                    break;
                default:
                    break;
            }

            command = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        }

        double credits = 0;
        for (String item : loot) {
            credits += item.length();
        }
        if (loot.size() <= 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.", credits / loot.size());
        }

    }


    private static void addLoot(List<String> command, List<String> loot) {
        for (int index = 1; index <= command.size() - 1; index++) {
            if (!loot.contains(command.get(index))) {
                loot.add(0, command.get(index));
            }
        }
    }

    private static void dropLoot(List<String> command, List<String> loot) {

        if (Integer.parseInt(command.get(1)) <= loot.size() - 1 && Integer.parseInt(command.get(1)) >= 0) {
            String droppedLoot = loot.get(Integer.parseInt(command.get(1)));
            loot.remove(Integer.parseInt(command.get(1)));
            loot.add(loot.size(), droppedLoot);
        }
    }

    private static void stealLoot(List<String> command, List<String> loot) {
        if (Integer.parseInt(command.get(1)) >= 0 && Integer.parseInt(command.get(1)) <= loot.size()) {

            int stealingIndex = Math.abs(loot.size() - Integer.parseInt(command.get(1)));
            List<String> stoleLoot = new ArrayList<>();
            if (stealingIndex >= loot.size()) {
                //for (String item : loot) {
                System.out.printf("%s", String.join(", ", loot));
                System.out.println();
                //}
                loot.removeAll(loot);
            } else {
                for (int i = 1; i <= Integer.parseInt(command.get(1)); i++) {
                    stoleLoot.add(loot.get(stealingIndex));
                    loot.remove(stealingIndex);
                }
                System.out.printf("%s", String.join(", ", stoleLoot));
                System.out.println();
            }
        } else {
            System.out.printf("%s", String.join(", ", loot));
            System.out.println();
            //}
            loot.removeAll(loot);
        }
    }
}

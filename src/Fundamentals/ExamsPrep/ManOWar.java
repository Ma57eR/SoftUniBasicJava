package Fundamentals.ExamsPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scan.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warShip = Arrays.stream(scan.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scan.nextLine());

        String[] command = scan.nextLine().split(" ");

        while (!command[0].equals("Retire")) {
            int index = 0;
            int damage = 0;
            int health = 0;
            int startIndex = 0;
            int endIndex = 0;
            switch (command[0]) {
                case "Fire":
                    index = Integer.parseInt(command[1]);
                    if (command.length > 2) {
                        damage = Integer.parseInt(command[2]);
                    }
                    //Fire, index, damage
                    //Check if index is valid
                    if (!isIndexValid(index, warShip)) {
                        break;
                    }
                    //check if damage is bigger than health
                    if (damage >= warShip.get(index)) {
                        System.out.println("You won! The enemy ship has sunken.");
                        warShip.set(index, 0);
                    } else {
                        warShip.set(index, warShip.get(index) - damage);
                    }
                    break;

                case "Defend":
                    if (command.length > 2) {
                        startIndex = Math.min(Integer.parseInt(command[2]),Integer.parseInt(command[1]));
                        endIndex = Math.max(Integer.parseInt(command[2]),Integer.parseInt(command[1]));
                    }

                    if (command.length > 3) {
                        damage = Integer.parseInt(command[3]);
                    } if (!areIndexesValid(startIndex, endIndex, pirateShip)) {
                        break;
                    }
                    for (int pirateSection = startIndex; pirateSection <= endIndex; pirateSection++) {
                        if (pirateShip.get(pirateSection) <= damage) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            pirateShip.set(pirateSection, 0);
                            break;
                        } else {
                            pirateShip.set(pirateSection, pirateShip.get(pirateSection) - damage);
                        }
                    }
                    break;

                case "Repair":
                    int repairIndex = Integer.parseInt(command[1]);
                    if (command.length > 2) {
                        health = Integer.parseInt(command[2]);
                    }

                    if (!isIndexValid(repairIndex, pirateShip)) {
                        break;
                    } else {
                        if (pirateShip.get(repairIndex) + health > maxHealth) {
                            pirateShip.set(repairIndex, maxHealth);
                        } else {
                            pirateShip.set(repairIndex, pirateShip.get(repairIndex) + health);
                        }
                    }
                    break;

                case "Status":
                    int damagedSections = 0;
                    double minHealth = maxHealth * 0.2;
                    for (int section = 0; section < pirateShip.size(); section++) {
                        if (pirateShip.get(section) < minHealth) {
                            damagedSections++;
                        }

                    }
                    System.out.printf("%d sections need repair.%n", damagedSections);
                    break;
                default:
                    break;
            }
            if (!isShipSank(pirateShip, warShip)) {
                command = scan.nextLine().split(" ");
            } else {
                break;
            }

        }
        if (!isShipSank(pirateShip, warShip)) {
            //"Pirate ship status: {pirateShipSum}"
            //"Warship status: {warshipSum}"
            int totalPirateHealth = 0;
            int totalWarShipHealth = 0;
            for (int pirateSection = 0; pirateSection < pirateShip.size(); pirateSection++) {
                totalPirateHealth += pirateShip.get(pirateSection);
            }
            for (int warShipSection = 0; warShipSection <warShip.size(); warShipSection++) {
                totalWarShipHealth += warShip.get(warShipSection);
            }

            System.out.printf("Pirate ship status: %d%n", totalPirateHealth);
            System.out.printf("Warship status: %d", totalWarShipHealth);

        }

    }



    private static boolean isIndexValid(int index, List<Integer> ship) {
        return index < ship.size() && index >= 0;
    }

    private static boolean areIndexesValid(int startIndex, int endIndex, List<Integer> pirateShip) {
        return startIndex >= 0 && startIndex < pirateShip.size() && endIndex >= 0 && endIndex < pirateShip.size();
    }

    private static boolean isShipSank(List<Integer> pirateShip, List<Integer> warShip) {
        boolean isSunk = false;
        for (int pirateSection = 0; pirateSection < pirateShip.size(); pirateSection++) {
            if (pirateShip.get(pirateSection) <= 0) {
                isSunk = true;
                break;
            }
        }
        for (int warship = 0; warship < warShip.size(); warship++) {
            if (warShip.get(warship) <= 0) {
                isSunk = true;
                break;
            }
        }
        return isSunk;
    }

}

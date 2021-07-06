package Fundamentals.ExamsPrep;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int initialHealth = 100;
        int health = initialHealth;
        int bitcoin = 0;
        int totalBitcoin = 0;
        List<String> rooms = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());
        int roomNum = 0;
        for (int room = 0; room < rooms.size(); room++) {

            String[] command = rooms.get(room).split(" ");
            String commandType = command[0];
            roomNum++;
            switch (commandType) {
                case "potion":
                    if (health + Integer.parseInt(command[1]) > initialHealth) {

                        System.out.printf("You healed for %d hp.%n", (initialHealth - health));
                        health = initialHealth;
                        System.out.printf("Current health: %d hp.%n", initialHealth);
                        break;
                    } else {
                        health += Integer.parseInt(command[1]);
                        System.out.printf("You healed for %d hp.%n", Integer.parseInt(command[1]));
                        System.out.printf("Current health: %d hp.%n", health);
                    }
                    break;
                case "chest":
                    totalBitcoin += Integer.parseInt(command[1]);
                    System.out.printf("You found %d bitcoins.%n", Integer.parseInt(command[1]));
                    break;
                default:
                    int damage = Integer.parseInt(command[1]);
                    health -= damage;
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", command[0]);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command[0]);
                        System.out.printf("Best room: %d", roomNum);
                    }
                    break;
            }
            if (health <= 0) {
                break;
            }
        }
        if (health > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", totalBitcoin);
            System.out.printf("Health: %d", health);

        }
    }
}

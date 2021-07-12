package Exams.July2021;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Friends2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> friends = Arrays.asList(scan.nextLine().split(", "));
        String[] command = scan.nextLine().split(" ");

        while (!command[0].equals("Report")) {
            switch (command[0]) {
                case "Blacklist":
                    blacklist(friends, command);
                    break;
                case "Error":
                    error(friends, command);
                    break;
                case "Change":
                    changeName(friends, command);
                    break;
            }
            command = scan.nextLine().split(" ");
        }
        int countLost = 0;
        int countBlacklisted = 0;

        for (String friend : friends) {
            if (friend.equals("Lost")) {
                countLost++;
            }
            if (friend.equals("Blacklisted")) {
                countBlacklisted++;
            }
        }

        System.out.println("Blacklisted names: " + countBlacklisted);
        System.out.println("Lost names: " + countLost);

        for (String friend : friends) {
            System.out.print(friend + " ");
        }
    }

    private static void changeName(List<String> friends, String[] command) {
        int index = Integer.parseInt(command[1]);
        String newName = command[2];

        if (index >= 0 && index < friends.size()) {
            //Тук може да има проблем, ако има Blacklist Или Lost
            System.out.printf("%s changed his username to %s.%n", friends.get(index), newName);
            friends.set(index, newName);
        }


    }

    private static void error(List<String> friends, String[] index) {
        if (Integer.parseInt(index[1]) < friends.size() && Integer.parseInt(index[1]) >= 0) {
            if (!friends.get(Integer.parseInt(index[1])).equals("Blacklisted") && !friends.get(Integer.parseInt(index[1])).equals("Lost")) {
                System.out.println(friends.get(Integer.parseInt(index[1])) + " was lost due to an error.");
                friends.set(Integer.parseInt(index[1]), "Lost");
            }
        }
    }

    private static void blacklist(List<String> friends, String[] command) {
        if (friends.contains(command[1])) {
            System.out.println(command[1] + " was blacklisted.");
            friends.set(friends.indexOf(command[1]), "Blacklisted");
        } else {
            System.out.println(command[1] + " was not found.");
        }

    }
}

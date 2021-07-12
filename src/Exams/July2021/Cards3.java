package Exams.July2021;

import java.util.*;

public class Cards3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> cards = Arrays.asList(scan.nextLine().split(":"));
        List<String> newDeck = new ArrayList<>();
        String[] command = scan.nextLine().split(" ");

        while (!command[0].equals("Ready")) {
            switch (command[0]) {
                case "Add":
                    addCard(cards, command, newDeck);
                    break;
                case "Insert":
                    inserCard(cards, newDeck, command);
                    break;
                case "Remove":
                    removeCard(cards, newDeck, command);
                    break;
                case "Swap":
                    swapping(newDeck, command);
                    break;
                case "Shuffle":
                    newDeck = shuffeling(newDeck);

                    break;
            }
            command = scan.nextLine().split(" ");
        }
        for (String card : newDeck) {
            System.out.print(card + " ");
        }

    }

    private static List<String> shuffeling(List<String> newDeck) {
        List<String> shuffledDeck = new ArrayList<>();

        for (int i = newDeck.size()-1; i >= 0; i--) {
            shuffledDeck.add(newDeck.get(i));
        }
        newDeck = shuffledDeck;
        return newDeck;
    }

    private static void swapping(List<String> newDeck, String[] command) {
        String oldPosition = command[1];
        String newPosition = command[2];
        int oldIndex = newDeck.indexOf(command[1]);
        int newIndex = newDeck.indexOf(command[2]);
        newDeck.set(oldIndex, newPosition);
        newDeck.set(newIndex, oldPosition);
    }

    private static void removeCard(List<String> cards, List<String> newDeck, String[] command) {
        String card = command[1];
        if (newDeck.contains(card)) {
            newDeck.remove(card);
        } else {
            System.out.println("Card not found.");
        }
    }

    private static void inserCard(List<String> cards, List<String> newDeck, String[] command) {
        String card = command[1];
        int index = Integer.parseInt(command[2]);
        boolean cardExist = cards.contains(card);
        boolean indexExist = index >= 0 && index <= newDeck.size();

        if (cardExist && indexExist) {
            newDeck.add(index, card);
        } else {
            System.out.println("Error!");
        }
    }

    private static void addCard(List<String> cards, String[] command, List<String> newDeck) {
        if (cards.contains(command[1])) {
            newDeck.add(command[1]);
        } else {
            System.out.println("Card not found.");
        }

    }
}

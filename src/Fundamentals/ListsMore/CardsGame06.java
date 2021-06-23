package Fundamentals.ListsMore;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> playerOne = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> playerTwo = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> winner = Arrays.asList();
        int minCards = Math.min(playerOne.size(), playerTwo.size());
        for (int card = 0; card < minCards; card++) {
            if (playerOne.get(card) > playerTwo.get(card)) {
                playerOne.add(playerOne.get(card));
                playerOne.add(playerTwo.get(card));
                playerTwo.remove(card);
                playerOne.remove(card);
                card = -1;
            } else if (playerOne.get(card) < playerTwo.get(card)) {
                playerTwo.add(playerTwo.get(card));
                playerTwo.add(playerOne.get(card));
                playerTwo.remove(card);
                playerOne.remove(card);
                card = -1;
            } else {
                playerOne.remove(card);
                playerTwo.remove(card);
                card = -1;
            }
            minCards = Math.min(playerOne.size(), playerTwo.size());
            if (playerOne.size() > playerTwo.size()) {
                winner = playerOne;
            } else {
                winner = playerTwo;
            }
        }
        int output = sumCards(winner);
        if (playerOne.size() > 0) {
            System.out.println("First player wins! Sum: " + output);
        } else {
            System.out.println("Second player wins! Sum: " + output);
        }
    }

    private static int sumCards(List<Integer> winner) {
        int sum = 0;
        for (int index = 0; index < winner.size(); index++) {
            sum += winner.get(index);
        }
        return sum;
    }
}

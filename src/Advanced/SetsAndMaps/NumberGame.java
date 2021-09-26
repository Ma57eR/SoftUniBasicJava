package Advanced.SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<Integer> firstPlayerDeck = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondPlayerDeck = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;
        while (rounds-- > 0 && !firstPlayerDeck.isEmpty() && !secondPlayerDeck.isEmpty()) {

            int firstPlayerCard = firstPlayerDeck.iterator().next();
            firstPlayerDeck.remove(firstPlayerCard);


            int secondPlayerCard = secondPlayerDeck.iterator().next();
            secondPlayerDeck.remove(secondPlayerCard);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerDeck.add(firstPlayerCard);
                firstPlayerDeck.add(secondPlayerCard);
            } else {
                secondPlayerDeck.add(firstPlayerCard);
                secondPlayerDeck.add(secondPlayerCard);
            }


        }

        if (firstPlayerDeck.isEmpty() || secondPlayerDeck.size() > firstPlayerDeck.size()) {
            System.out.println("Second player win!");
        } else if (secondPlayerDeck.isEmpty() || secondPlayerDeck.size() < firstPlayerDeck.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Draw!");
        }

    }
}

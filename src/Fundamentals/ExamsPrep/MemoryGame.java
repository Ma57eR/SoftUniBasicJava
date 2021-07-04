package Fundamentals.ExamsPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> elements = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

        String[] turn = scan.nextLine().split(" ");
        int count = 0;

        while (!turn[0].equals("end")) {
            count++;
            int elementA = Integer.parseInt(turn[0]);
            int elementB = Integer.parseInt(turn[1]);
            //Ако чийтва и пусне 2 еднакви индекса или индекс извън листа
            if (isCheating(elementA, elementB, elements)) {
                cheater(elements, count);
            } else if (elements.get(elementA).equals(elements.get(elementB))) {
                matchFound(elements, elementA, elementB);
            } else if (!elements.get(elementA).equals(elements.get(elementB))) {
                System.out.println("Try again!");
            }
            if (elements.size() == 0) {
                System.out.printf("You have won in %d turns!", count);
                break;
            }
            turn = scan.nextLine().split(" ");
        }
        if (elements.size() > 0) {
            System.out.println("Sorry you lose :(");
            for (int i = 0; i < elements.size(); i++) {
                System.out.print(elements.get(i) + " ");
            }
        }
    }


    private static boolean isCheating(int elementA, int elementB, List<String> elements) {
        return elementA == elementB || elementA >= elements.size() || elementA < 0 || elementB >= elements.size() || elementB < 0;
    }

    private static void cheater(List<String> elements, int count) {
        System.out.println("Invalid input! Adding additional elements to the board");
        //Създраваме нов елемент броя търнове и а отзад
        String additionalElements = "-" + count + "a";
        int middleOfElements = elements.size() / 2;
        elements.add(middleOfElements, additionalElements);
        elements.add(middleOfElements, additionalElements);
    }

    private static void matchFound(List<String> elements, int elementA, int elementB) {
        System.out.printf("Congrats! You have found matching elements - %s!%n", elements.get(elementA));
        int max = Math.max(elementA, elementB);
        int min = Math.min(elementA, elementB);
        elements.remove(max);
        elements.remove(min);
    }
}

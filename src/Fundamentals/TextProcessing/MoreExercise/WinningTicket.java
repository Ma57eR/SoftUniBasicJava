package Fundamentals.TextProcessing.MoreExercise;

import java.util.Scanner;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(",\\s+");

        //Валиден билет трябва да има точно 20 символа
        //Печелившите символи са @, #, $, ^
        for (int i = 0; i < input.length; i++) {
            String currentTicket = input[i].trim();

            if (currentTicket.length() != 20) {
                System.out.println("invalid ticket");
                continue;
            }

            int leftSideSymbols = 0;
            int rightSideSymbols = 0;

            leftSideSymbols = isLeftWin(currentTicket, leftSideSymbols);
            rightSideSymbols = isrightWin(currentTicket, rightSideSymbols, leftSideSymbols);

            if (leftSideSymbols < 6 || rightSideSymbols < 6) {
                //Имаме печеливш
                System.out.printf("ticket \"%s\" - no match", currentTicket);
            }

        }
    }


    private static int isLeftWin(String currentTicket, int leftSideSymbols) {
        int count = 0;
        for (int index = 0; index < currentTicket.length() / 2; index++) {
            char currentChar = currentTicket.charAt(index);
            if (currentChar == '@' || currentChar == '#' || currentChar == '$' || currentChar == '^') {
                if (currentChar == currentTicket.charAt(index) && index <= currentTicket.length()-1) {
                    count++;
                }
            }
        }

        if (count >= 6) {
            leftSideSymbols = count;

        }
        return leftSideSymbols;
    }

    private static int isrightWin(String currentTicket, int rightSideSymbols, int leftSymbols) {
        int count = 0;
        char winSymbol = 0;
        for (int index = currentTicket.length() - 1; index >= currentTicket.length() / 2; index--) {
            char currentChar = currentTicket.charAt(index);
            if (currentChar == '@' || currentChar == '#' || currentChar == '$' || currentChar == '^') {
                if (currentChar == currentTicket.charAt(index) && index <= currentTicket.length()-1) {
                count++;
                winSymbol = currentChar;
                }
            }
        }

        if (count >= 6) {
            rightSideSymbols = count;
        }
        if ((rightSideSymbols >= 6 && rightSideSymbols < 10) && leftSymbols == rightSideSymbols) {
            System.out.printf("ticket \"%s\" - %d%c%n", currentTicket, rightSideSymbols, winSymbol);
        }
        if (leftSymbols == 10 && rightSideSymbols == 10) {
            System.out.printf("ticket \"%s\" - %d%c Jackpot!%n", currentTicket, rightSideSymbols, winSymbol);
        }
        return rightSideSymbols;
    }
}

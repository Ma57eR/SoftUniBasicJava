package Fundamentals.MethodsExcercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char symbol1 = scan.nextLine().charAt(0);
        char symbol2 = scan.nextLine().charAt(0);
        String allSymbols = allSymbols(symbol1, symbol2);
        System.out.println(allSymbols);

    }

    private static String allSymbols(char symbol1, char symbol2) {
        String allSymbols = "";
        int minChar = 0;
        int maxChar = 0;
        if (symbol1 > symbol2) {
            maxChar = symbol1;
            minChar = symbol2;
        } else {
            maxChar = symbol2;
            minChar = symbol1;
        }
        for (int i = minChar+1; i < maxChar+0; i++) {
            allSymbols += (char) i + " ";
        }
        return allSymbols;
    }
}

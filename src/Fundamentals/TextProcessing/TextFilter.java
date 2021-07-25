package Fundamentals.TextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] bannedWords = scan.nextLine().split(", ");
        String input = scan.nextLine();

        while (true) {
            for (String bannedWord : bannedWords) {
                String censor = "";
                for (int i = 0; i < bannedWord.length(); i++) {
                    censor += "*";
                }
                input = input.replace(bannedWord, censor);
            }
            break;
        }
        System.out.println(input);
    }
}

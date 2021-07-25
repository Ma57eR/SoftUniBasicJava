package Fundamentals.TextProcessing;

import java.util.Scanner;

public class DigitsLettersOther {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String digits = "";
        String letters = "";
        String otherCharacters = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                digits += input.charAt(i);
            }
             else if ((input.charAt(i) >= 65 && input.charAt(i) <= 90) || (input.charAt(i) >= 97 && input.charAt(i) <= 122)) {
                letters += input.charAt(i);
            } else {
                otherCharacters += input.charAt(i);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(otherCharacters);
    }
}

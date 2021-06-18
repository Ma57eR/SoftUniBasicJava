package Fundamentals.MethodsExcercise;

import java.util.Scanner;

public class MiddleCharacters06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String text = middleChar(input);
        System.out.println(text);
    }

    private static String middleChar(String input) {
        boolean isEven = false;
        String chars = "";
        if (input.length() % 2 == 0) {
            isEven = true;
        }
        if (isEven) {
            for (int i = input.length() / 2 - 1; i <= input.length() / 2; i++) {
                chars += input.charAt(i);
            }
        } else {
            chars = String.valueOf(input.charAt(input.length() / 2));
        }
        return chars;
    }
}

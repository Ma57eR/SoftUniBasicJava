package Fundamentals.MethodsExcercise;

import java.util.Scanner;

public class PalindromeIntegers09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        boolean palindrome = false;

        while (!input.equals("END")) {
            boolean text = text(input, palindrome);
            System.out.println(text);
            input = scan.nextLine();
        }

    }

    private static boolean text(String input, boolean palindrome) {
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        if (input.equals(reverse)) {
            palindrome = true;
        }
        return palindrome;
    }
}

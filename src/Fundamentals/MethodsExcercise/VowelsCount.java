package Fundamentals.MethodsExcercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().toLowerCase();
        int count = countVowels(input);
        System.out.println(count);


    }

    private static int countVowels(String input) {
        int countVow = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'i') {
                countVow += 1;
            }
        }
        return countVow;
    }
}

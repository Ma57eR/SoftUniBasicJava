package Fundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder decrypted = new StringBuilder();
        for (char ch : input.toCharArray()) {
            decrypted.append((char) (ch + 3));
        }
        System.out.println(decrypted);
    }
}

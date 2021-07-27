package Fundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        String firstString = input[0];
        String secondString = input[1];

        int charSum = 0;

        while (firstString.length() > 0 && secondString.length() > 0) {
            charSum += firstString.charAt(0) * secondString.charAt(0);
            firstString = firstString.substring(1);
            secondString = secondString.substring(1);
        }
        if (firstString.length() > 0) {
            while (firstString.length() > 0) {
                charSum += firstString.charAt(0);
                firstString = firstString.substring(1);
            }
        } else {
            while (secondString.length() > 0) {
                charSum += secondString.charAt(0);
                secondString = secondString.substring(1);
            }
        }
        System.out.println(charSum);
    }
}

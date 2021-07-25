package Fundamentals.TextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String forRemove = scan.nextLine();
        String input = scan.nextLine();

        int startIndex = input.indexOf(forRemove);
        while(input.contains(forRemove)) {
             startIndex = input.indexOf(forRemove);
            int endIndex = startIndex + forRemove.length();
            input = input.substring(0, startIndex) + input.substring(endIndex);

        }
        System.out.print(input);

    }
}

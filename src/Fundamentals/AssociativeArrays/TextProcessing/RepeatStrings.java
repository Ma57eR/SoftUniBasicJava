package Fundamentals.AssociativeArrays.TextProcessing;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length(); j++) {
                str.append(input[i]);
            }

        }
        System.out.println(str);
    }
}

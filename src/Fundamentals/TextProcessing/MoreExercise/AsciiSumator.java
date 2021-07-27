package Fundamentals.TextProcessing.MoreExercise;

import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine();
        String second = scan.nextLine();
        String third = scan.nextLine();
        char firstChar = first.charAt(0);
        char secondChar = second.charAt(0);


        int sum = 0;
        for (char symbol: third.toCharArray()) {
            if (symbol > firstChar && symbol < secondChar) {
                sum+=symbol;
            }
        }
        System.out.println(sum);
    }
}

package Fundamentals.Methods;

import java.util.Scanner;

public class Repeat_String07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int repeat = Integer.parseInt(scan.nextLine());
        String repeated = repeating(input, repeat);
        System.out.println(repeated);

    }


    public static String repeating(String input, int repeat) {
        String concat = "";
        for (int i = 1; i <= repeat; i++) {
            concat += input;
        }
        return concat;

    }
}
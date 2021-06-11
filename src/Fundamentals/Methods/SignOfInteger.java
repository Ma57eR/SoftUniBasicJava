package Fundamentals.Methods;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        integerType(Integer.parseInt(scan.nextLine()));

    }

    public static void integerType(int num) {
        if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        } else if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else {
            System.out.println("The number 0 is zero.");
        }

    }
}

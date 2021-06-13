package Fundamentals.Methods;

import java.util.Scanner;

public class Calculations04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String calculationType = scan.nextLine();
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        switch (calculationType) {
            case "add":
                addMath(num1, num2);
                break;
            case "multiply":
                multiply(num1, num2);
                break;
            case "subtract":
                subtract(num1, num2);
                break;
            case "divide":
                divide(num1, num2);
                break;
        }


    }

    private static void addMath(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    private static void multiply(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }

    private static void subtract(int a, int b) {
        int c = a - b;
        System.out.println(c);
    }

    private static void divide(int a, int b) {
        int c = a / b;
        System.out.println(c);
    }
}

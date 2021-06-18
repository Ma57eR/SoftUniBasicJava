package Fundamentals.Methods;

import java.util.Scanner;

public class Math_Operations11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        int num2 = Integer.parseInt(scan.nextLine());
        int totalSum = totalCalc(num1, num2, type);
        System.out.println(totalSum);

    }

    private static int totalCalc(int num1, int num2, String type) {
        int amount = 0;
        switch (type) {
            case "/":
                amount = num1 / num2;
                break;
            case "*":
                amount = num1 * num2;
                break;
            case "+":
                amount = num1 + num2;
                break;
            case "-":
                amount = num1 - num2;
        }
        return amount;
    }
}

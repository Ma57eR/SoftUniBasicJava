package Fundamentals.MethodsExcercise;

import java.util.Scanner;

public class FactorialDivision08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        double fac1 = factorial1(num1);
        double fac2 = factorial2(num2);
        double result = fac1/fac2;
        System.out.printf("%.2f", result);

    }

    private static long factorial1(double num1) {
        long fact = 1;
        for (int i = (int)num1; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    private static long factorial2(double num2) {
        long fact = 1;
        for (int i = (int)num2; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }
}

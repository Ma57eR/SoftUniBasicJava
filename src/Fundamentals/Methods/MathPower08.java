package Fundamentals.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());
        double result = numPower(num, power);
        System.out.println(new DecimalFormat("0.####").format(result));
    }

    private static double numPower(double num, int power) {
        double powered = Math.pow(num, power);

//        for (int i = 1; i < power; i++) {
//            powered *= num;
//        }
        return powered;
    }
}
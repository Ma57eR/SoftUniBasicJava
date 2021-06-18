package Fundamentals.Methods;


import java.util.Scanner;

public class Multiply_Evens_Odds10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = Math.abs(Integer.parseInt(scan.nextLine()));
        int evenTotal = evenSum(num);
        int oddTotal = oddSum(num);
        int totalSum = evenTotal * oddTotal;

        System.out.println(totalSum);

    }



    private static int evenSum(int num) {
        int evenSum = 0;
        for (int i = 0; i < String.valueOf(num).length(); i++) {
            if (String.valueOf(num).charAt(i) % 2 == 0) {
                evenSum += Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i)));
            }
        }
        return evenSum;
    }

    private static int oddSum(int num) {
        int oddSum = 0;
        for (int i = 0; i < String.valueOf(num).length(); i++) {
            if (String.valueOf(num).charAt(i) %2 != 0) {
                oddSum += Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i)));
            }
        }
        return oddSum;
    }

}

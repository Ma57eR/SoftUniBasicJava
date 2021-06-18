package Fundamentals.MethodsExcercise;

import java.util.Scanner;

public class SmallestOfThree01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        int smallestNum = smallestNum(num1, num2, num3);
        System.out.println(smallestNum);


    }

    private static int smallestNum(int num1, int num2, int num3) {
        int small = Math.min(num1, num2);
        int small2 = Math.min(small, num3);
        return small2;
    }
}

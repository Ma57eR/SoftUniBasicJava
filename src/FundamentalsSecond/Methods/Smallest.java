package FundamentalsSecond.Methods;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        smallestNum(a, b, c);
    }

    private static void smallestNum(int a, int b, int c) {
        int min = Math.min(a, b);
        min = Math.min(min, c);
        System.out.println(min);
    }
}

package Fundamentals.MethodsExcercise;

import java.util.Scanner;

public class NxNMatrix07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int row = rows(num);
    }

    private static int rows(int num) {

        for (int col = 1; col <= num; col++) {
            String rows = "";
            for (int row = 1; row <= num; row++) {
                rows += num + " ";
            }
            System.out.println(rows);
        }
        return 0;
    }
}

package FundamentalsSecond.Arrays;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split(" ");
        int numOfRotations = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numOfRotations; i++) {
            String tmp = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = tmp;
        }
        System.out.print(String.join(" ", array));
    }
}

package FundamentalsSecond.Arrays;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split(" ");
        int numOfRotations = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numOfRotations; i++) {
            //Взимаме първия елемент
            String firstToLast = array[0];
            //Изместваме всички елементи до предпоследния
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            //Заместваме последния елемент
            array[array.length - 1] = firstToLast;
        }
        System.out.print(String.join(" ", array));
    }
}

package FundamentalsSecond.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        StringBuilder topIntegers = new StringBuilder();

        for (int index = 0; index < array.length; index++) {
            boolean isBigger = true;
            for (int i = index+1; i < array.length; i++) {
                if (array[index] > array[i]) {
                } else {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                topIntegers.append(array[index]).append(" ");
            }
        }
        System.out.println(topIntegers);
    }
}

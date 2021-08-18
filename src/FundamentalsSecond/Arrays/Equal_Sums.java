package FundamentalsSecond.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Equal_Sums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder equalIndexes = new StringBuilder();
//        if (array.length == 1) {
//            equalIndexes.append("0" + " ");
         if (array[0] == Arrays.stream(array).sum()) {
            equalIndexes.append("0" + " ");
        }
        for (int i = 1; i < array.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int leftIndex = 0; leftIndex < i; leftIndex++) {
                sumLeft += array[leftIndex];
            }
            for (int rightIndex = array.length - 1; rightIndex > i; rightIndex--) {
                sumRight += array[rightIndex];
            }
            if (sumLeft == sumRight) {
                equalIndexes.append(i + " ");
            }
        }
        if (equalIndexes.length() > 0) {
            System.out.println(String.join(" ", equalIndexes));
        } else {
            System.out.println("no");
        }
    }
}

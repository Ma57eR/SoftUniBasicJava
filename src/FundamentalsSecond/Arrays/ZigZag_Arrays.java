package FundamentalsSecond.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZag_Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfRows = Integer.parseInt(scan.nextLine());
        int[] fArray = new int[numOfRows];
        int[] sArray = new int[numOfRows];

        for (int i = 0; i < numOfRows; i++) {
            int[] currentNums = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0) {
                fArray[i] = currentNums[0];
                sArray[i] = currentNums[1];
            } else {
                fArray[i] = currentNums[1];
                sArray[i] = currentNums[0];
            }
        }
        for (int i = 0; i < fArray.length; i++) {
            System.out.print(fArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < sArray.length; i++) {
            System.out.print(sArray[i] + " ");
        }
    }
}

package FundamentalsSecond.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNum = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == magicNum) {
                    System.out.println(array[i] + " " + array[j]);
                }
            }

        }
    }

}


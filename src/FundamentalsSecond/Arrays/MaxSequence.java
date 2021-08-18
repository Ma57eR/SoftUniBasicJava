package FundamentalsSecond.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split(" ");
        StringBuilder longSequence = new StringBuilder();
        String num = "";
        int count = 1;
        int maxCount = 1;
        for (int i = 0; i < array.length; i++) {
            count = 1;
            //maxCount = 1;
            for (int j = i+1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    count++;
                    if (count > maxCount) {
                        maxCount = count;
                        num = array[i];
                    }
                } else {
                    break;
                }

            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(String.join(" ", num) + " ");
        }

    }
}

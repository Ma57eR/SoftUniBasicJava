package FundamentalsSecond.Arrays;

import java.util.Scanner;

public class Common_Elements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    String[] fArray = scan.nextLine().split(" ");
    String[] sArray = scan.nextLine().split(" ");

        for (int sIndex = 0; sIndex < sArray.length; sIndex++) {
            for (int fIndex = 0; fIndex < fArray.length; fIndex++) {
                if (sArray[sIndex].equals(fArray[fIndex])) {
                    System.out.print(sArray[sIndex] + " ");
                }

            }
        }
    }
}

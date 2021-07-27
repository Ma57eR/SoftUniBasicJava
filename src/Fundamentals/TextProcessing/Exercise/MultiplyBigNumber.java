package Fundamentals.TextProcessing.Exercise;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstLine = scan.nextLine();
        String secondLine = scan.nextLine();
        BigInteger fbInt = new BigInteger(firstLine);
        BigInteger sbInt = new BigInteger(secondLine);

        System.out.println(fbInt.multiply(sbInt));

    }
}

package Fundamentals.Objects;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger firstNum = new BigInteger(scan.nextLine());
        BigInteger secondNum = new BigInteger(scan.nextLine());
        BigInteger sum = new BigInteger("0");

        sum = sum.add(firstNum).add(secondNum);
        System.out.println(sum);

    }
}

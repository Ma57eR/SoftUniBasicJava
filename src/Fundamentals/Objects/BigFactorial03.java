package Fundamentals.Objects;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int n = Integer.parseInt(scan.nextLine());
//        BigInteger factorial = new BigInteger("1");
//
//        for (int i = 1; i <= n; i++) {
//            factorial = factorial.multiply(BigInteger.valueOf(i));
//        }
//
//        System.out.println(factorial);


        Dice myDice = new Dice();
        int sides = myDice.getSides();
        myDice.setSides(10);

        System.out.println(myDice.roll());

    }
}

package Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] prices = Arrays.stream(scan.nextLine().split(", ")).mapToDouble(Double::parseDouble).toArray();

        //
        UnaryOperator<Double> withVat = price -> price * 1.2;

        System.out.println("Prices with VAT:");
        for (double price : prices) {
            System.out.printf("%1$.2f%n", withVat.apply(price));
        }

    }
}

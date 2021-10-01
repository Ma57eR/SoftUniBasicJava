package Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Function<String, Integer> countIntegers = str -> str.split(", ").length;
        Function<String, Integer> sumIntegers = str -> Arrays.stream(str.split(", ")).mapToInt(Integer::parseInt).sum();

        System.out.println("Count = " + countIntegers.apply(input));
        System.out.println("Sum = " + sumIntegers.apply(input));
    }
}

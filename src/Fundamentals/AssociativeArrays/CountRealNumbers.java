package Fundamentals.AssociativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] input = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        //8 2 2 8 2

        Map<Double, Integer> numbers = new TreeMap<>();
        for (double num : input) {
            if (numbers.containsKey(num)) {
                int numOfTimes = numbers.get(num) + 1;
                numbers.put(num, numOfTimes);
            } else {
                numbers.put(num, 1);

            }
        }
        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}

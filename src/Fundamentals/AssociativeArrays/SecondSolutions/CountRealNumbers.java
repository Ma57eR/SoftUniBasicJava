package Fundamentals.AssociativeArrays.SecondSolutions;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] input = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> nums = new TreeMap<>();

        for (double num : input) {
            if (!nums.containsKey(num)) {
                nums.put(num, 1);
            } else {
                int value = nums.get(num) +1;
                nums.put(num, value);
            }
        }
        for (Map.Entry<Double, Integer> num : nums.entrySet()) {
            System.out.printf("%.0f -> %d%n", num.getKey(), num.getValue());

        }
    }
}

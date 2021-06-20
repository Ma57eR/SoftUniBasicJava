package Fundamentals.Lists;


import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int index = 0; index < numbers.size(); index++) {
            double sum = 0;
            if (index != numbers.size() - 1) {
                if (numbers.get(index).equals(numbers.get(index + 1))) {
                    numbers.set(index, (numbers.get(index) + numbers.get(index + 1)));
                    numbers.remove(index+1);
                    index = -1;
                }
            }
        }
        String output = joinElementsByDelimeter(numbers, " ");
        System.out.println(output);


    }

    private static String joinElementsByDelimeter(List<Double> numbers, String delimeter) {
        String output = "";
        for (Double number : numbers) {
            output += (new DecimalFormat("0.#")).format(number) + delimeter;
        }
        return output;
    }
}
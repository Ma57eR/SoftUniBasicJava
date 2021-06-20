package Fundamentals.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int halfSize = input.size()/2;
        for (int index = 0; index < halfSize; index++) {
            int temp = 0;
            temp = (input.get(index) + (input.get(input.size() - 1)));
            input.set(Math.abs(index), temp);
            //input.remove(index);
            input.remove(input.size() - 1);

        }
        String output = joinElements(input, " ");
        System.out.println(output);
    }

    private static String joinElements(List<Integer> input, String delimeter) {
        String output = "";
        for (Integer integer : input) {
            output += integer + delimeter;
        }
        return output;
    }
}

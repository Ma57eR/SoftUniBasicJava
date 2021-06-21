package Fundamentals.Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //int listSize = numbers.size();
        for (int index = 0; index < numbers.size(); index++) {
            if (numbers.get(index) < 0) {
                numbers.remove(index);
                index -=1;
            }
        }
        Collections.reverse(numbers);
        String output = "";
        if (numbers.size() > 0) {
            for (int i = 0; i < numbers.size(); i++) {
                output += numbers.get(i) + " ";
            }
            System.out.println(output);
        } else {
            System.out.println("empty");
        }
    }
}

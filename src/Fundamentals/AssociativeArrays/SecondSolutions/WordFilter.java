package Fundamentals.AssociativeArrays.SecondSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> fruits = Arrays.stream(scan.nextLine().split(" "))
                .filter(fruit -> fruit.length() % 2 == 0)
                .collect(Collectors.toList());


        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

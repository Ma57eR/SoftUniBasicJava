package Fundamentals.ListsMore;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Poke {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int index = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (numbers.size() > 0) {
            int removedNumber = 0;
            if (isIndexValid(index,numbers.size())) {
                removedNumber = numbers.get(index);
                numbers.remove(index);
                indexesCalculation(numbers, removedNumber);
            } else if (index < 0) {
                removedNumber = numbers.get(0);
                numbers.remove(0);
                numbers.add(0, numbers.get(numbers.size() - 1));
                indexesCalculation(numbers, removedNumber);
            } else {
                removedNumber = numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                numbers.add(numbers.size(), numbers.get(0));
                indexesCalculation(numbers, removedNumber);
            }
            sum += removedNumber;
            if (numbers.size() != 0) {
                index = Integer.parseInt(scan.nextLine());
            }

        }
        System.out.println(sum);

    }



    private static boolean isIndexValid(int index, int size) {
        if (index >= 0 && index < size) {
            return true;
        } else {
            return false;
        }
    }

    private static void indexesCalculation(List<Integer> numbers, int removedNumber) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= removedNumber) {
                numbers.set(i, numbers.get(i) + removedNumber);
            } else {
                numbers.set(i, numbers.get(i) - removedNumber);
            }
        }
    }
}

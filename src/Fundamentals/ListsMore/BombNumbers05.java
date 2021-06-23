package Fundamentals.ListsMore;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int[] specialNums = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        //1 2 2 4 2 2 2 9
        //0 1 2 3 4 5 6 7
        //  1   3

        for (int number = 0; number < numbers.size(); number++) {
            if (numbers.get(number) == specialNums[0]) {
                int indexNum = number;
                int forRemove = number - specialNums[1];
                if (number + specialNums[1] > numbers.size()) {

                    for (int index = 0; index < indexNum; index++) {
                        numbers.remove(forRemove);
                    }
                } else {
                    if (forRemove < 0) {
                        forRemove = 0;
                    }
                    if (number - specialNums[1] < 0) {
                        int nextIndex = 0;
                        for (int index = number - specialNums[1]; index < number + specialNums[1]; index++) {
                            numbers.remove(forRemove);
                            if (numbers.size() == 0) {
                                break;
                            }
                        }

                    } else {
                        int nextIndex = number - specialNums[1];
                    }
                    for (int index = number - specialNums[1]; index < number + specialNums[1]+1; index++) {
                        numbers.remove(forRemove);
                        if (numbers.size() == 0) {
                            break;
                        }
                    }
                }
            }
        }
        int summedNumbers = summedNumbers(numbers);
        System.out.println(summedNumbers);
    }

    private static int summedNumbers(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}

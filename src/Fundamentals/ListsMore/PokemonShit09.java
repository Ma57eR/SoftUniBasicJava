package Fundamentals.ListsMore;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonShit09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int index = Integer.parseInt(scan.nextLine());
        int sumOfRemoved = 0;

        while (numbers.size() > 0) {

            //Индекс - маха индекса от листа
            //Премахнатото число увеличава с толкова по-малките
            //Намалява с толкова по-големите

            //Ако индекса е по-малък от нула, махаме първото число и на негово място копираме последното
            if (index < 0) {
                int removedNum = numbers.get(0);
                sumOfRemoved += numbers.get(0);
                numbers.remove(0);
                numbers.add(0, numbers.get(numbers.size() - 1));
                numbersCalc(numbers, removedNum);
            } else if (index > numbers.size() - 1) {
                int removedNum = numbers.get(numbers.size() - 1);
                sumOfRemoved += numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                numbers.add(numbers.get(0));
                numbersCalc(numbers, removedNum);
            } else {

                int removedNum = numbers.get(index);
                sumOfRemoved += numbers.get(index);
                numbers.remove(index);

                numbersCalc(numbers, removedNum);
            }
            if (numbers.size() < 1) {
                break;
            }
            index = Integer.parseInt(scan.nextLine());
        }
        System.out.println(sumOfRemoved);
    }

    private static void numbersCalc(List<Integer> numbers, int removedNum) {
        for (int number = 0; number < numbers.size(); number++) {
            if (removedNum > numbers.get(number)) {
                numbers.set(number, numbers.get(number) + removedNum);
            } else {
                numbers.set(number, numbers.get(number) - removedNum);
            }
        }
    }
}

package Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scan.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());

        //Оставяме само четните числа
        List<Integer> evenNums = nums.stream()
                .filter(e -> e % 2 ==0)
                .collect(Collectors.toList());
        //Запазваме в Стринг резултата от листа, като всяка стойност е разделена със запетая
        String evenOutput = evenNums.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        String sorted = evenNums.stream()
                //Сортираме листа
                .sorted()
                //Обръщаме го в стринг и го записваме в Стринг променливата - предвидена за печат
                .map(String::valueOf)
                        .collect(Collectors.joining(", "));
        System.out.println(evenOutput);
        System.out.println(sorted);
    }
}

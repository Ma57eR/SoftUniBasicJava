package Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] strings = scan.nextLine().split("\\s+");

        //Предикейт, който проверява дали първата буква на всяка дума е голяма и връща TRUE or FALSE;
        Predicate<String> predicate = str -> Character.isUpperCase(str.charAt(0));

        List<String> upperCaseStrings = Arrays.stream(strings)
                //Тук всеки елемент от strings[] минава през Предикейта и връща TRUE or FALSE и само TRUE минават през филтъра
                .filter(predicate)
                .collect(Collectors.toList());

        System.out.println(upperCaseStrings.size());
        upperCaseStrings
                .forEach(System.out::println);

    }
}

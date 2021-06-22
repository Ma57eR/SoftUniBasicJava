package Fundamentals.ListsMore;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> commandType = Arrays.asList(scan.nextLine().split(" "));
        String command = commandType.get(0);

        while (!command.equals("End")) {
            switch (command) {
                case "Add":
                    commandAdd(commandType.get(1),numbers);
                    break;
                case "Insert":
                    if (Integer.parseInt(commandType.get(2)) > numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        commandInsert(numbers, commandType.get(1), commandType.get(2));
                    }
                    break;
                case "Remove":
                    if (Integer.parseInt(commandType.get(1)) > numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        removeIndex(numbers, commandType.get(1));
                    }
                    break;
                case "Shift":
                    if (commandType.get(1).equals("left")) {
                        shiftLeft(numbers, commandType.get(2));
                    } else {
                        shiftRight(numbers, commandType.get(2));
                    }
                    break;
            }
            commandType = Arrays.asList(scan.nextLine().split(" "));
            command = commandType.get(0);

        }
        String output = newList(numbers);
        System.out.println(output);

    }

    private static String newList(List<Integer> numbers) {
        String output = "";
        for (Integer number : numbers) {
            output += number + " ";
        }
        return output;
    }


    private static List<Integer> commandAdd(String number, List<Integer> numList) {
        numList.add(Integer.parseInt(number));
        return numList;
    }

    private static List<Integer> commandInsert(List<Integer> numbers, String number, String index) {
        numbers.add(Integer.parseInt(index), Integer.parseInt(number));
        return numbers;
    }
    private static void removeIndex(List<Integer> numbers, String index) {
        numbers.remove(Integer.parseInt(index));
    }

    private static void shiftLeft(List<Integer> numbers, String rotations) {
        List<Integer> shiftedList = numbers;
        for (int i = 0; i < Integer.parseInt(rotations); i++) {
            int first = shiftedList.get(0);
            for (int j = 0; j < numbers.size()-1; j++) {
                shiftedList.set(j, shiftedList.get(j + 1));
            }
            shiftedList.set(shiftedList.size()-1, first);
        }
        numbers = shiftedList;
    }

    private static void shiftRight(List<Integer> numbers, String rotations) {
        List<Integer> shiftedList = numbers;
        for (int i = 0 ; i < Integer.parseInt(rotations); i++) {
            int last = shiftedList.get(shiftedList.size()-1);
            for (int j = numbers.size() -1; j > 0 ; j--) {
                shiftedList.set(j, shiftedList.get(j-1));
            }
            shiftedList.set(0, last);

        }

    }

}

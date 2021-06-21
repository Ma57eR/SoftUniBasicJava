package Fundamentals.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] commandType = scan.nextLine().split(" ");
        String command = commandType[0];
        int commandNumber = Integer.parseInt(commandType[1]);


        while (!command.equals("end")) {
            commandNumber = Integer.parseInt(commandType[1]);
            switch (command) {
                case "Add":
                    numbers = addNumber(numbers, commandNumber);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(commandNumber));
                    break;
                case "RemoveAt":
                    int removeIndex = Integer.parseInt(commandType[1]);
                    numbers.remove(removeIndex);
                    break;
                case "Insert":
                    int insertIndex = Integer.parseInt(commandType[2]);
                    numbers.add(insertIndex, commandNumber);
                    break;
            }
            commandType = scan.nextLine().split(" ");
            command = commandType[0];

        }
        String output = listJoin(numbers," ");
        System.out.println(output);
    }



    private static List<Integer> addNumber(List<Integer> numbers, int commandNumber) {
        numbers.add(numbers.size(), commandNumber);
        return numbers;
    }
    private static String listJoin(List<Integer> numbers, String delimeter) {
        String output = "";
        for (Integer number : numbers) {
            output += number + delimeter;
        }
        return output;
    }

}
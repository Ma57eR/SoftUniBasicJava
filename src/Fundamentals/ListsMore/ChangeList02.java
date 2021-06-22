package Fundamentals.ListsMore;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] commandTypes = scan.nextLine().split(" ");
        String command = commandTypes[0];

        while (!command.equals("end")) {
            switch (command) {
                case "Delete":
                    deletedNumbers(numbers, commandTypes[1]);
                    break;
                case "Insert":
                    insertedNumbers(numbers, commandTypes[1], commandTypes[2]);
                    break;

            }
            commandTypes = scan.nextLine().split(" ");
            command = commandTypes[0];
        }
        String output = updatedList(numbers);
        System.out.println(output);

    }


    private static List<Integer> deletedNumbers(List<Integer> numbers, String commandType) {
        for (int index = 0; index < numbers.size(); index++) {
            if (numbers.get(index).equals(Integer.parseInt(commandType))) {
                numbers.remove(index);
                index -= 1;
            }
        }
        return numbers;
    }

    private static List<Integer> insertedNumbers(List<Integer> numbers, String element, String position) {
        numbers.add(Integer.parseInt(position), Integer.parseInt(element));
        return numbers;
    }

    private static String updatedList(List<Integer> numbers) {
        String output = "";
        for (Integer number : numbers) {
            output += number + " ";
        }
        return output;
    }

}

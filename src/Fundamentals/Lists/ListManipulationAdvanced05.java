package Fundamentals.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] commandType = scan.nextLine().split(" ");
        String command = commandType[0];
        int commandNumber = Integer.parseInt(commandType[1]);


        while (!command.equals("end")) {
            switch (command) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(commandType[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandType[1].equals("even")) {
                       String evenNum = evenNumbers(numbers);
                        System.out.println(evenNum);
                    } else {
                        String oddNum = oddNumbers(numbers);
                        System.out.println(oddNum);
                    }
                    break;
                case "Get":
                    int listSum = sumList(numbers);
                    System.out.println(listSum);
                    break;
                case "Filter":
                    String filtered = filtering(numbers, commandType[1], Integer.parseInt(commandType[2]));
                    System.out.println(filtered);
            }
            commandType = scan.nextLine().split(" ");
            command = commandType[0];
        }


    }



    private static int sumList(List<Integer> numbers) {
        int sumNumbers =0;
        for (Integer number : numbers) {
            sumNumbers+=number;
        }
        return sumNumbers;
    }

    private static String evenNumbers(List<Integer> numbers) {
        //List<Integer> evens = new ArrayList<>();
        String output = "";
        for (Integer even : numbers) {
            if (even % 2 == 0) {
                output += even + " ";
            }
        }
        return output;
    }

    private static String oddNumbers(List<Integer> numbers) {
        //List<Integer> evens = new ArrayList<>();
        String output = "";
        for (Integer odd : numbers) {
            if (odd % 2 != 0) {
                output += odd + " ";
            }
        }
        return output;
    }

    private static String filtering(List<Integer> numbers, String condition, int number) {
        List<Integer> filteredNumbers = new ArrayList<>();
        String output = "";
        switch (condition) {
            case ">":
                for (Integer integer : numbers) {
                    if (integer > number) {
                        output += integer + " ";
                    }
                }
                break;
            case "<":
                for (Integer integer : numbers) {
                    if (integer < number) {
                        output += integer + " ";
                    }
                }
                break;
            case ">=":
                for (Integer integer : numbers) {
                    if (integer >= number) {
                        output += integer + " ";
                    }
                }
                break;
            case "<=":
                for (Integer integer : numbers) {
                    if (integer <= number) {
                        output += integer + " ";
                    }
                }
                break;
        }
        return output;
    }

}

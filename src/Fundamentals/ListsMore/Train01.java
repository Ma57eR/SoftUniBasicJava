package Fundamentals.ListsMore;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scan.nextLine());
        String[] commandType = scan.nextLine().split(" ");

        while (!commandType[0].equals("end")) {
            if (commandType[0].equals("Add")) {
                wagons.add(Integer.parseInt(commandType[1]));
            } else {
                for (int wagon = 0; wagon < wagons.size(); wagon++) {
                    if (maxCapacity >= ( wagons.get(wagon) + Integer.parseInt(commandType[0]))) {
                        wagons.set(wagon,(wagons.get(wagon) + Integer.parseInt(commandType[0])));
                        break;
                    }
                }
            }
            commandType = scan.nextLine().split(" ");
        }
        String output = wagonPassangers(wagons);
        System.out.println(output);
    }

    private static String wagonPassangers(List<Integer> wagons) {
        String output = "";
        for (Integer wagon : wagons) {
            output += wagon + " ";
        }
        return output;
    }
}

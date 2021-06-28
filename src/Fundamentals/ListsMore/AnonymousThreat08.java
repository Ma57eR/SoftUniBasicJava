package Fundamentals.ListsMore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat08 {
    private static Object StringBuilder;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> strings = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> decryptedString = new ArrayList<>();
        //commands - merge or divide
        String[] commandType = scan.nextLine().split("\\s+");

        while (!commandType[0].equals("3:1")) {
            switch (commandType[0]) {
                case "merge":
                    if (commandType[0].equals("merge")) {
                        int startIndex = Integer.parseInt(commandType[1]);
                        int endIndex = Integer.parseInt(commandType[2]);
                        StringBuilder mergedStrings = new StringBuilder();

                        if (startIndex <= strings.size() - 1) {
                            if (endIndex > strings.size() - 1) {
                                endIndex = strings.size() - 1;
                            }
                            for (int i = startIndex; i <= endIndex; i++) {
                                mergedStrings.append(strings.get(i));
                            }
                            for (int i = startIndex; i <= endIndex; i++) {
                                strings.remove(startIndex);
                            }
                        } else {
                            startIndex = 0;
                            if (endIndex > strings.size() - 1) {
                                endIndex = strings.size() - 1;
                            }
                            for (int i = startIndex; i <= endIndex; i++) {
                                mergedStrings.append(strings.get(i));
                            }
                            for (int i = startIndex; i <= endIndex; i++) {
                                strings.remove(startIndex);
//                                if (i == strings.size() - 1) {
//                                    break;
//                                }
                            }
                        }
                        strings.add(startIndex, mergedStrings.toString());
                    }

                    break;
                case "divide":
                    int index = Integer.parseInt(commandType[1]);
                    int partitions = Integer.parseInt(commandType[2]);
                    String elementForDivide = strings.get(index);
                    strings.remove(index);
                    int partSize = elementForDivide.length() / partitions;
                    int begin = 0;
                    for (int part = 1; part < partitions; part++) {
                        strings.add(index, elementForDivide.substring(begin, begin + partSize));
                        index++;
                        begin+=partSize;
                    }

                    strings.add(index, elementForDivide.substring(begin));

                    break;
            }

            commandType = scan.nextLine().split("\\s+");
        }
        System.out.println(String.join(" ", strings));

    }


}

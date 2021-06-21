package Fundamentals.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int firstLength = firstList.size();
        int secondLength = secondList.size();
        List<Integer> fullList = new ArrayList<>();
        int shorterList = 0;
        if (firstLength >= secondLength) {
            shorterList = firstLength;
        } else {
            shorterList = secondLength;
        }

        while (firstList.size() != 0 && secondList.size() != 0) {

            int index = 0;
            if (fullList.size() == 0) {
                fullList.add(index, firstList.get(index));
                fullList.add(index + 1, secondList.get(index));
            } else {
                fullList.add(fullList.size(), firstList.get(index));
                fullList.add(fullList.size(), secondList.get(index));
            }
            firstList.remove(index);
            secondList.remove(index);
        }
        if (firstList.size() > 0) {
            while (firstList.size() != 0) {
                int index = 0;
                fullList.add(fullList.size(), firstList.get(index));
                firstList.remove(index);
            }
        } else {
            while (secondList.size() != 0) {
                int index = 0;
                fullList.add(fullList.size(), secondList.get(index));
                secondList.remove(index);
            }

        }
        String output = listJoin(fullList, " ");
        System.out.print(String.valueOf(output));

    }

    private static <delimiter> String listJoin(List fullList, String delimiter) {
        String join = "";
        for (Object number : fullList) {
            join += number + delimiter;
        }
        return join;
    }
}

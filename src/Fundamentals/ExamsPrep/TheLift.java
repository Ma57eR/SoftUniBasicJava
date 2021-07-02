package Fundamentals.ExamsPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int capacity = 4;
        int peopleWaiting = Integer.parseInt(scan.nextLine());
        List<Integer> wagons = Arrays.stream(scan.nextLine().split("\\s++")).map(Integer::parseInt).collect(Collectors.toList());


        boolean hasFull = false;
        for (int i = 0; i < wagons.size(); i++) {
            int freespace =0;
            hasFull = false;
            if (wagons.get(i) < capacity) {
                freespace = 4 - wagons.get(i);
            }
            if (freespace <= peopleWaiting) {
                wagons.set(i, 4);
                peopleWaiting -= freespace;
                hasFull = true;

            } else {
                if (peopleWaiting < 0) {
                    break;
                }
                wagons.set(i,wagons.get(i)+peopleWaiting);
                peopleWaiting = 0;
                break;
            }
        }
        if (peopleWaiting != 0 && hasFull) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWaiting);
        } else if (peopleWaiting == 0 && !hasFull) {
            System.out.println("The lift has empty spots!");
        }
        for (int i = 0; i < wagons.size(); i++) {
            System.out.print(wagons.get(i) + " ");
        }
    }
}


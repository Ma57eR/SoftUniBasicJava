package Fundamentals.ExamsPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HearDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> komshii = Arrays.stream(scan.nextLine().split("@")).collect(Collectors.toList());
        String[] already = new String[komshii.size()];
        for (int i = 0; i < komshii.size(); i++) {
            already[i] = komshii.get(i);
        }
        String[] command = scan.nextLine().split(" ");
        int index = 0;
        while (!command[0].equals("Love!")) {
            if (index + Integer.parseInt(command[1]) > komshii.size()-1) {
                index = 0;
            } else {
                index += Integer.parseInt(command[1]);
            }
            komshii.set(index, String.valueOf(Integer.parseInt(komshii.get(index)) - 2));
            if (Integer.parseInt(komshii.get(index)) <= 0) {
                komshii.set(index, "0");

                if (!already[index].equals("1")) {
                    System.out.printf("Place %d has Valentine's day.%n", index);
                } else {
                    System.out.printf("Place %d already had Valentine's day.%n", index);
                }
                already[index] = "1";
            }



            command = scan.nextLine().split(" ");

        }
        System.out.printf("Cupid's last position was %d.%n", index);

        if (isSuccessful(already)) {
            System.out.println("Mission was successful.");
        } else {
            int count = 0;
            for (int i = 0; i < already.length; i++) {
                if (!already[i].equals("1")) {
                    count++;
                }
            }
            System.out.printf("Cupid has failed %d places.", count);
        }

    }

    private static boolean isSuccessful(String[] already) {
        boolean areAll = true;
        for (int i = 0; i < already.length; i++) {
            if (!already[i].equals("1")) {
                return false;
            }
        }
        return areAll;
    }


}

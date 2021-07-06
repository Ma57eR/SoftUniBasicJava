package Fundamentals.ExamsPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HearDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> komshii = Arrays.stream(scan.nextLine().split("@")).collect(Collectors.toList());
        String[] command = scan.nextLine().split(" ");
        int index = 0;
        while (!command[0].equals("Love!")) {
            if (Integer.parseInt(komshii.get(index)) == 0) {
                System.out.printf("Place %d already had Valentine's day.", index);
            } else {

                    //index += Integer.parseInt(command[1]);
                    newKomshii(index, komshii);
                    //int value = Integer.parseInt(komshii.get(index)) - 2;
                    //komshii.set(index, String.valueOf(value));


                if (Integer.parseInt(komshii.get(index)) <= 0) {
                    System.out.printf("Place %d has Valentine's day.", index);
                    komshii.set(index, "0");
                }
            }
            command = scan.nextLine().split(" ");
            if (index + Integer.parseInt(command[1]) > komshii.size()) {
                index = 0;
                newKomshii(index, komshii);
            } else {
                index = index + Integer.parseInt(command[1]);
            }
        }

    }

    private static void newKomshii(int index, List<String> komshii) {
        int value = Integer.parseInt(komshii.get(index)) - 2;
        komshii.set(index, String.valueOf(value));
    }
}

package Fundamentals.ExamsPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Shit {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<String> sequence = Arrays.stream(scanner.nextLine().split("\\| ")).collect(Collectors.toList());
            String input = scanner.nextLine();

            while (!input.equals("Stop!")) {
                String[] command = input.split(" ");
                String commandType = command[0];

                switch (commandType) {

                    case "Join":
                        String genreToAdd = command[1];
                        sequence.add(sequence.size(), genreToAdd);
                        break;

                    case "Drop":
                        String genreToRemove = command[1];
                        if (sequence.contains(genreToRemove)) {
                            sequence.remove(genreToRemove);
                        }
                        break;

                    case "Replace":
                        String genreOld = command[1];
                        String genreNew = command[2];
                        break;
                }
                input = scanner.nextLine();
            }
            System.out.println(sequence);

    }
}
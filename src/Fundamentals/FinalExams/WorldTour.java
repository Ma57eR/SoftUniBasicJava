package Fundamentals.FinalExams;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String stops = scan.nextLine();
        String[] command = scan.nextLine().split(":");

        while (!command[0].equals("Travel")) {
        String commandType = command[0];
        switch (commandType) {
            case "Add Stop":
                int index = Integer.parseInt(command[1]);
                String stringForAdd = command[2];
                if (index < stops.length() && index >= 0) {
                    String tmp = stops.substring(0, index);
                    tmp += stringForAdd;
                    tmp += stops.substring(index);
                    stops = tmp;

                }
                break;
            case "Remove Stop":
                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);
                if (startIndex < stops.length() && endIndex < stops.length() && startIndex >= 0 && endIndex >= 0) {
                    String tmp = stops.substring(0, startIndex);
                    tmp+= stops.substring(endIndex+1);
                    stops = tmp;
                }
                break;
            case "Switch":
                String oldString = command[1];
                String newString = command[2];
                int oldStartIndex = stops.indexOf(oldString);
                int oldEndIndex = oldStartIndex + oldString.length();
                while (stops.contains(oldString)) {
                    stops = stops.substring(oldEndIndex);
                    stops = newString + stops;
                }
                break;


        }
        System.out.println(stops);
        command = scan.nextLine().split(":");
        }
        System.out.println("Ready for world tour! Planned stops: " + stops);
    }
}

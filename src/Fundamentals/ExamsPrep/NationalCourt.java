package Fundamentals.ExamsPrep;

import java.util.Scanner;

public class NationalCourt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstEmployee = Integer.parseInt(scan.nextLine());
        int secondEmployee = Integer.parseInt(scan.nextLine());
        int thirdEmployee = Integer.parseInt(scan.nextLine());
        int totalPeopleForHelp = Integer.parseInt(scan.nextLine());
        int totalPerHour = firstEmployee + secondEmployee + thirdEmployee;
        int peopleInQueue = 0;
        int hours = 0;

        while (totalPeopleForHelp > 0) {

            hours++;
            if (hours % 4 == 0) {
                hours++;
            }
            totalPeopleForHelp -= totalPerHour;
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}

package Fundamentals.ListsMore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseParty03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int guestsNum = Integer.parseInt(scan.nextLine());

        List<String> guests = new ArrayList<>();


        for (int guest = 0; guest < guestsNum; guest++) {
            List<String> currentGuest = Arrays.asList(scan.nextLine().split(" "));
            String name = currentGuest.get(0);
            for (int index = 0; index < currentGuest.size(); index++) {
                if (!currentGuest.get(2).contains("not")) {
                    if (!guests.contains(name)) {
                        guests.add(name);
                        break;
                    } else {
                        System.out.println(name + " is already in the list!");
                        break;
                    }
                } else {
                    if (!guests.contains(name)) {
                        System.out.println(name + " is not in the list!");
                    } else {
                        int guestForRemove = guests.indexOf(name);
                        guests.remove(guestForRemove);
                    }
                    break;
                }

            }

        }
        finalListOfGuests(guests);
    }

    private static void finalListOfGuests(List<String> guests) {
        String output = "";
        for (int guest = 0; guest < guests.size(); guest++) {
            System.out.println(guests.get(guest));
        }

    }
}
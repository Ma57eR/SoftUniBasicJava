package Advanced.SetsAndMaps;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Set<String> vip = new HashSet<>();
        Set<String> regular = new HashSet<>();

        while (!input.equals("PARTY")) {
            if (Character.isDigit(input.charAt(0))) {
                vip.add(input);
            } else {
                regular.add(input);
            }
            input = scan.nextLine();
        }

        while (!input.equals("END")) {
            vip.remove(input);
            regular.remove(input);
            input = scan.nextLine();
        }
        int missingGuests = vip.size() + regular.size();


            System.out.println(missingGuests);
        if (!vip.isEmpty()) {
            System.out.print(String.join(System.lineSeparator(), vip));
        }
            System.out.println();
        if (!regular.isEmpty()) {
            System.out.print(String.join(System.lineSeparator(), regular));
        }

    }
}

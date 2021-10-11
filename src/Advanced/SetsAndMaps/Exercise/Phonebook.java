package Advanced.SetsAndMaps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> phoneBook = new LinkedHashMap<>();

        String[] input = scan.nextLine().split("-");

        while (!input[0].equals("search")) {
            String name = input[0];
            String phone = input[1];

            phoneBook.put(name, phone);
            input = scan.nextLine().split("-");
        }

        String searchedName = scan.nextLine();
        while (!searchedName.equals("stop")) {
        if (phoneBook.containsKey(searchedName)) {
            String currentPhone = phoneBook.get(searchedName);
            System.out.println(searchedName + " -> " + currentPhone);
        } else {
            System.out.println("Contact" + searchedName + "does not exist.");
        }
            searchedName = scan.nextLine();
        }
    }
}

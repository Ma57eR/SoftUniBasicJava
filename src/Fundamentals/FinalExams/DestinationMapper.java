package Fundamentals.FinalExams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String regex = "([=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> destinations = new ArrayList<>();
        int travelPoints = 0;
        while (matcher.find()) {
            destinations.add(matcher.group("destination"));
            travelPoints += matcher.group("destination").length();
        }
        String printDestinations = String.join(", ", destinations);

        System.out.println("Destinations: " + printDestinations);
        System.out.println("Travel Points: " + travelPoints);

    }
}

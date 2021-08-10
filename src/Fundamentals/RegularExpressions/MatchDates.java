package Fundamentals.RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "\\b(?<day>\\d{2})(?<separator>[\\/\\-\\.])(?<Month>[A-z]+)\\2(?<year>\\d{4}\\b)";
        String input = scan.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while ()
    }
}

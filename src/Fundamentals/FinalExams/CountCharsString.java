package Fundamentals.FinalExams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Character, Integer> chars = new LinkedHashMap<>();
        String input = scan.nextLine();

        for (int index = 0; index < input.length(); index++) {
            if (!chars.containsKey(input.charAt(index)) && input.charAt(index) != ' ') {
                chars.put(input.charAt(index), 1);
            } else if (input.charAt(index) != ' ') {
                chars.put(input.charAt(index), chars.get(input.charAt(index)) + 1);
            }
        }

        chars.entrySet().stream()
                .forEach(ch ->{
                    System.out.println(ch.getKey() + " -> " + ch.getValue());
                });
    }
}

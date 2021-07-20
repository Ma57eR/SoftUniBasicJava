package Fundamentals.AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().replace(" ", "");
        LinkedHashMap<String, Integer> chars = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            int occur = 1;
            if (chars.containsKey(input.charAt(i) + "")) {
                occur = chars.get(String.valueOf(input.charAt(i))) + 1;
            }
            chars.put(input.charAt(i) + "", occur);
        }
        for (Map.Entry<String, Integer> entry : chars.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}

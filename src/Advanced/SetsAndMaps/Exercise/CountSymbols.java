package Advanced.SetsAndMaps.Exercise;

import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Set<String> characters = new TreeSet<>();
        Map<String, Integer> charsInfo = new TreeMap<>();

        for (int ch = 0; ch < input.length(); ch++) {
            char currentChar = input.charAt(ch);
            if (!charsInfo.containsKey(String.valueOf(currentChar))) {
                charsInfo.put(String.valueOf(currentChar), 1);
            } else {
                int currentOcurence = charsInfo.get(String.valueOf(currentChar));
                charsInfo.put(String.valueOf(currentChar), currentOcurence+1);
            }
        }
            charsInfo.entrySet().forEach(e -> {
                System.out.print(e.getKey() + ": " + e.getValue() + " time/s" + System.lineSeparator());
            });
    }
}

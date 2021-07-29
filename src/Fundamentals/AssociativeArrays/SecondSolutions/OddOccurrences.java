package Fundamentals.AssociativeArrays.SecondSolutions;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().toLowerCase().split(" ");

        Map<String, Integer> dictionary = new LinkedHashMap<>();

        for (int index = 0; index < input.length; index++) {
            if (dictionary.containsKey(input[index])) {
                int count = dictionary.get(input[index]) + 1;
                dictionary.put(input[index], count);
            } else {
                dictionary.put(input[index], 1);
            }
        }
        List<String> oddWords = new ArrayList<>();
        dictionary.forEach((key, value) -> {
            if (value % 2 != 0) {
                oddWords.add(key);
            }
        });
        String joined = String.join(", ", oddWords);
        System.out.print(joined);
        String res = dictionary.entrySet()
                .stream()
                .filter(entry -> entry.getValue() %2 != 0)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", "));
    }
}

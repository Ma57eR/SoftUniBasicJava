package Fundamentals.ExamsPrep;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class testing {
    public static void main(String[] args) {

        Map<String, List<String>> test = new LinkedHashMap<>();

        test.put("test", new ArrayList<>());
        test.get("test").add("1");
        test.get("test").add("3");
        test.get("test").add("2");
        test.get("test").add("4");

        test.put("atest2", new ArrayList<>());
        test.get("atest2").add("1");
        test.get("atest2").add("3");
        test.get("atest2").add("2");
        test.get("atest2").add("4");

        for (List<String> list : test.values()) {
            Collections.sort(list, Collections.reverseOrder());
        }
        Map<String, List<String>> sortedMap = test.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
//                .forEach(key -> {
//                    key.getValue().stream().sorted();
//                })
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println();


    }
}

package Fundamentals;

import java.util.*;

public class Tests2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Map<Map<String, Integer>, Map<String, Integer>> mapOfMaps = new LinkedHashMap<>();
        Map<String, List<String>> secondMap = new LinkedHashMap<>();

        String name = "Ivan";
        secondMap.put(name, new ArrayList<>());
        secondMap.get(name).add("13");
        secondMap.get(name).add("12");
        secondMap.get(name).add("11");
        System.out.println(secondMap);


        secondMap.entrySet().stream()
                .forEach(entry -> entry.getValue()
                        .sort(Comparator.comparing(String::toString)));

        System.out.println(secondMap);
//        for (Map.Entry<String, List<Integer>> entry : secondMap.entrySet()) {
//            System.out.println(entry.getKey());
//            entry.getValue().sort(Comparator.comparing(integer -> integer));
//            for (int i = 0; i < entry.getValue().size(); i++) {
//                System.out.println(i+1 + ". " + entry.getValue().get(i));
//            }
//        }


    }
}

package Fundamentals.RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> startRacers = Arrays.asList(scan.nextLine().split(", "));
        Map<String, Integer> racersInfo = new LinkedHashMap<>();
        for (int i = 0; i < startRacers.size(); i++) {
            racersInfo.put(startRacers.get(i), 0);
        }
        String input = scan.nextLine();
        String let = "[A-Za-z]";
        Pattern name = Pattern.compile(let);
        String dig = "[0-9]";
        Pattern distance = Pattern.compile(dig);


        while (!input.equals("end of race")) {
            Matcher matchedName = name.matcher(input);
            Matcher matchedDistance = distance.matcher(input);
            StringBuilder currentName = new StringBuilder();
            while (matchedName.find()) {
                currentName.append(matchedName.group());
            }
               int currentDistance = 0;
            while (matchedDistance.find()) {
                currentDistance += Integer.parseInt(matchedDistance.group());
            }
            if (racersInfo.containsKey(currentName.toString())) {
                currentDistance += racersInfo.get(currentName.toString());
                racersInfo.put(currentName.toString(), currentDistance);
            }
            input = scan.nextLine();
        }
/*List<String> firstThreeNames = racersDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) //sorted map by value
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());*/

        Map<String, Integer> sortedMap = racersInfo.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // sorted map by Value
                .limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a1, a2) -> a1, LinkedHashMap::new));

        List<String> winners = new ArrayList<>();

        sortedMap.entrySet().forEach(e -> winners.add(e.getKey()));

        System.out.println("1st place: " + winners.get(0));
        System.out.println("2nd place: " + winners.get(1));
        System.out.println("3rd place: " + winners.get(2));
    }
}

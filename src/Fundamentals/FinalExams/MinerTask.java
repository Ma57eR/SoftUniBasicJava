package Fundamentals.FinalExams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String resource = scan.nextLine();
        int count = 1;
        Map<String, Integer> resources = new LinkedHashMap<>();
        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scan.nextLine());
            if (resources.containsKey(resource)) {
                resources.put(resource, resources.get(resource) + quantity);
            } else {
                resources.put(resource, quantity);
            }
            resource = scan.nextLine();

        }
        resources.entrySet().stream()
                .forEach(rss -> {
                    System.out.println(rss.getKey() + " -> " + rss.getValue());
                });
    }
}

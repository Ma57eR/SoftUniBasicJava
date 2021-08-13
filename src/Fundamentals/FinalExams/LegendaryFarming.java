package Fundamentals.FinalExams;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> mainMaterials = new LinkedHashMap<>();
        mainMaterials.put("fragments", 0);
        mainMaterials.put("motes", 0);
        mainMaterials.put("shards", 0);
        Map<String, Integer> junkMaterials = new LinkedHashMap<>();

        boolean weapon = false;

        while (!weapon) {
            String[] input = scan.nextLine().toLowerCase().split(" ");
            for (int index = 0; index < input.length; index++) {
                String material = input[index+1];
                int quantity = Integer.parseInt(input[index]);
                //Проверка дали материала е от необходимите
                if (isMainMaterial(material)) {
                    mainMaterials.put(material, mainMaterials.get(material) + quantity);
                } else {
                    if (junkMaterials.containsKey(material)) {
                        junkMaterials.put(material, junkMaterials.get(material) + quantity);
                    } else {
                        junkMaterials.put(material, quantity);
                    }
                }
                if (isMaterialEnough(mainMaterials)) {
                    weapon = true;
                    whichWeapon(mainMaterials);
                    break;
                }

                index++;
            }
        }
        mainMaterials.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(item -> System.out.println(item.getKey() + ": " + item.getValue()));

        junkMaterials.entrySet().stream()
                .sorted((item1, item2) -> item1.getKey().compareTo(item2.getKey()))
                .forEach(item -> System.out.println(item.getKey() + ": " + item.getValue()));

    }

    private static void whichWeapon(Map<String, Integer> material) {
        if (material.get("fragments") >=  250) {
            System.out.println("Valanyr obtained!");
            material.put("fragments", material.get("fragments") - 250);
        } else if (material.get("shards") >= 250) {
            System.out.println("Shadowmourne obtained!");
            material.put("shards", material.get("shards") - 250);
        } else {
            System.out.println("Dragonwrath obtained!");
            material.put("motes", material.get("motes") - 250);
        }

    }

    private static boolean isMaterialEnough(Map<String, Integer> material) {
        return material.get("fragments") >=  250|| material.get("shards") >= 250 | material.get("motes") >= 250;
    }

    private static boolean isMainMaterial(String material) {
        return material.equals("fragments") || material.equals("shards") || material.equals("motes");
    }
}

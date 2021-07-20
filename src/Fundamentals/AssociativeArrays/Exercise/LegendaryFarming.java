package Fundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> mainMaterials = new LinkedHashMap<>();
        Map<String, Integer> junkMaterials = new HashMap<>();

        mainMaterials.put("shards", 0);
        mainMaterials.put("fragments", 0);
        mainMaterials.put("motes", 0);



        int tmp = 0;
        boolean megaweapon = false;

        while (!megaweapon) {
            String[] input = scan.nextLine().toLowerCase().split("\\s+");
            for (int i = 0; i < input.length; i++) {
                if (i % 2 == 0 && !megaweapon) {
                    tmp = Integer.parseInt(input[i]);
                    continue;
                } else {
                    if (mainMaterials.containsKey(input[i]) && !megaweapon) {
                        int currentMat = mainMaterials.get(input[i]) + tmp;
                        mainMaterials.put(input[i], currentMat);
                    } else if (junkMaterials.containsKey(input[i]) && !megaweapon) {
                        int currentMat = junkMaterials.get(input[i]) + tmp;
                        junkMaterials.put(input[i], currentMat);
                    } else {
                        if (!megaweapon) {
                        junkMaterials.put(input[i], tmp);
                        }
                    }

                }
                megaweapon =  isMainEnough(mainMaterials, megaweapon);
            }


            //main materials desc quantity


        }
        mainMaterials
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(result -> System.out.printf("%s: %d%n", result.getKey(), result.getValue()));

        junkMaterials
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey())
                .forEach(result -> System.out.printf("%s: %d%n", result.getKey(), result.getValue()));
    }

    private static boolean isMainEnough(Map<String, Integer> mainMaterials, boolean megaweapon) {
        String material = "";
        String weapon = "";
        boolean firstWeapon = false;
        for (Map.Entry<String, Integer> entry : mainMaterials.entrySet()) {

            if (entry.getValue() >= 250 && !firstWeapon) {
                material = entry.getKey();
                entry.setValue(entry.getValue() - 250);
                firstWeapon = true;
                megaweapon = true;
                switch (material) {
                    case "shards":
                        System.out.println("Shadowmourne obtained!");
                        break;
                    case "fragments":
                        System.out.println("Valanyr obtained!");
                        break;
                    case "motes":
                        System.out.println("Dragonwrath obtained!");
                        break;
                }
            }
        }

        return megaweapon;
    }
}

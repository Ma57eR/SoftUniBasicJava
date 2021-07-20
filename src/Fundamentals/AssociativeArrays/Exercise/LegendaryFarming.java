package Fundamentals.AssociativeArrays.Exercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> mainMaterials = new LinkedHashMap<>();
        Map<String, Integer> junkMaterials = new LinkedHashMap<>();

        mainMaterials.put("shards", 0);
        mainMaterials.put("fragments", 0);
        mainMaterials.put("motes", 0);


        String[] input = scan.nextLine().toLowerCase().split("\\s+");
        int tmp = 0;
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0) {
                tmp = Integer.parseInt(input[i]);
                continue;
            } else {
                if (mainMaterials.containsKey(input[i])) {
                    int currentMat = mainMaterials.get(input[i]) + tmp;
                    mainMaterials.put(input[i], currentMat);
                } else if (junkMaterials.containsKey(input[i])) {
                    int currentMat = junkMaterials.get(input[i]) + tmp;
                    junkMaterials.put(input[i], currentMat);
                } else {
                    junkMaterials.put(input[i], tmp);
                }

            }

        }
    }
}

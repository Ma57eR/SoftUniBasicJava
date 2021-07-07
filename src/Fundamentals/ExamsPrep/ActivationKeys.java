package Fundamentals.ExamsPrep;

import java.util.*;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String rawKey = scan.nextLine();
        String[] commands = scan.nextLine().split("\\>\\>\\>");

        while (!commands[0].equals("Generate")) {
            switch (commands[0]) {
                case "Contains":
                    isContains(rawKey, commands[1]);
                    break;
                case "Flip":

                    rawKey = (flipping(rawKey, commands[1], commands[2], commands[3]));
                    break;
                case "Slice":
                    rawKey = slicing(rawKey, commands[1], commands[2]);
                    break;
            }
            commands = scan.nextLine().split("\\>\\>\\>");
        }

        System.out.printf("Your activation key is: %s", rawKey);
    }

    private static String slicing(String rawKey, String sIndex, String eIndex) {
        int startIndex = Integer.parseInt(sIndex);
        int endIndex = Integer.parseInt(eIndex);
        List<String> rawKeyList = new ArrayList<>();
        //Пълним листа с поредицата символи от rawKey
        for (int i = 0; i < rawKey.length(); i++) {
            rawKeyList.add(""+rawKey.charAt(i));
        }
        //Проверяваме дали индексите са съществуващи
        if (startIndex < rawKey.length() && endIndex < rawKey.length()) {
            //Махаме символите от дадените индекси
            for (int i = startIndex; i < endIndex; i++) {
                rawKeyList.remove(startIndex);
            }
            rawKey = "";
            //След като сме занулили rawKey го пълним отново с останалите символи в листа
            for (String character : rawKeyList) {
                rawKey+=character;
            }
            System.out.println(rawKey);
        }
    return rawKey;
    }

    private static String flipping(String rawKey, String upperOrLower, String sIndex, String eIndex) {
        int startIndex = Integer.parseInt(sIndex);
        int endIndex = Integer.parseInt(eIndex);
        if (startIndex < rawKey.length() && endIndex < rawKey.length()) {
            String tmp;
            switch (upperOrLower) {
                case "Upper":
                    tmp = rawKey;
                    //Пълним rawKey с индексите от 0 до стартовия със старите им стойности
                    rawKey = tmp.substring(0, startIndex);
                    //Добавяме променените символи от стартовия до крайния зададен индекс
                    rawKey += tmp.substring(startIndex, endIndex).toUpperCase();
                    //Добавяме останалите непроменени символи
                    rawKey += tmp.substring(endIndex);
                    System.out.println(rawKey);
                    break;
                case "Lower":
                    tmp = rawKey;
                    //Пълним rawKey с индексите от 0 до стартовия със старите им стойности
                    rawKey = tmp.substring(0, startIndex);
                    //Добавяме променените символи от стартовия до крайния зададен индекс
                    rawKey += tmp.substring(startIndex, endIndex).toLowerCase();
                    //Добавяме останалите непроменени символи
                    rawKey += tmp.substring(endIndex);
                    System.out.println(rawKey);
            }
        }
        return rawKey;
    }

    private static void isContains(String rawKey, String substring) {
        if (rawKey.contains(substring)) {
            System.out.printf("%s contains %s%n", rawKey, substring);
        } else {
            System.out.println("Substring not found!");
        }
    }
}

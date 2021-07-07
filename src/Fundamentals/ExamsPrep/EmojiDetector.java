package Fundamentals.ExamsPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String input = scan.nextLine();
        List<Integer> thresholdList = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            //Проверяваме дали символа е цифра и ако е цифра, добавяме в листа
            if ((int) input.charAt(i) >= 47 && (int) input.charAt(i) <= 57) {
                thresholdList.add(Character.getNumericValue(input.charAt(i))); //превръщаме символа в цифра
            }
        }
        int threshold = 0;
        for (int i = 0; i < thresholdList.size(); i++) {
            if (thresholdList.get(i)> 0) {
                threshold *= thresholdList.get(i);
            }
        }
        List<String> emojis = Arrays.asList(input.split("\\:\\:[a-zA-Z]\\:\\:"));
        List<Integer> emojisCoolness = new ArrayList<>();

        for (String emoji : emojis) {
            int coolness = 0;
            for (int chars = 0; chars < emoji.length(); chars++) {
                coolness += (int) emoji.charAt(chars);
            }
            emojisCoolness.add(coolness);
        }

    }
}

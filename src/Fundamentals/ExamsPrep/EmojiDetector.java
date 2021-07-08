package Fundamentals.ExamsPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String regex = "(?<name>([*]{2})[A-Z][a-z]{2,}([*]{2})|([:]{2})[A-Z][a-z]{2,}([:]{2}))";
        Pattern pattern = Pattern.compile(regex);



        String input = scan.nextLine();
        List<Integer> thresholdList = new ArrayList<>();
        List<String> emojis = new ArrayList<>();
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            String name1 = matcher.group("name");
            emojis.add(name1);
        }

        for (int i = 0; i < input.length(); i++) {
            //Проверяваме дали символа е цифра и ако е цифра, добавяме в листа
            if ((int) input.charAt(i) >= 47 && (int) input.charAt(i) <= 57) {
                thresholdList.add(Character.getNumericValue(input.charAt(i))); //превръщаме символа в цифра
            }
        }
        long threshold = 1;
        for (int i = 0; i < thresholdList.size(); i++) {
            if (thresholdList.get(i) > 0) {
                threshold *= thresholdList.get(i);
            }
        }
        System.out.println("Cool threshold: " + threshold);



        List<String> coolEmojis = new ArrayList<>();
        int numOfEmojis = 0;
        for (String emoji : emojis) {
            int coolness = 0;
            String cleanEmoji = "";
            if (emoji.contains(":")) {
                cleanEmoji = emoji.replace(":", "");
                cleanEmoji.trim();
                numOfEmojis++;
            } else {
                cleanEmoji = emoji.replace("*", "");
                cleanEmoji.trim();
                numOfEmojis++;
            }
            for (int chars = 0; chars < cleanEmoji.length(); chars++) {
                coolness += (int) cleanEmoji.charAt(chars);
            }


            if (coolness > threshold) {
                coolEmojis.add(emoji);
            }
        }
        System.out.printf("%s emojis found in the text. The cool ones are:%n", emojis.size());
        for (String coolEmoji : coolEmojis) {
            System.out.println(coolEmoji);
        }

    }
}

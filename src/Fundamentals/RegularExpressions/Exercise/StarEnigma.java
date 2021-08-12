package Fundamentals.RegularExpressions.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //Трябва да се каунтнат всички букви и да се намали броя от аски сумата на всяка буква след това

        int numOfMessages = Integer.parseInt(scan.nextLine());



        List<String> decryptedMessage = new ArrayList<>();
        String regex = "[starSTAR]";
        Pattern pattern = Pattern.compile(regex);
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 0; i < numOfMessages; i++) {

            String input = scan.nextLine();
            int countLetters = 0;
            //Броим определените букви, за да дешефрираме входните данни
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                countLetters++;
            }

            StringBuilder decrypted = new StringBuilder();
            //Дешифрираме входните данни, добавяме в билдера и след това в листа
            for (int k = 0; k < input.length(); k++) {
                decrypted.append(Character.valueOf((char) (input.charAt(k) - countLetters)));
            }
            decryptedMessage.add(decrypted.toString());

        }

        String splitting = "@(?<planet>[A-Za-z]+)[^@!:>-]*:(?<population>\\d+)[^@!:>-]*!(?<attackType>[AD])![^@!:>-]*->(?<soldiers>[0-9]+)";
        Pattern split = Pattern.compile(splitting);

        for (String message : decryptedMessage) {
            //StringBuilder planet = new StringBuilder();
            //StringBuilder population = new StringBuilder();
            //StringBuilder attackType = new StringBuilder();
            //StringBuilder soldiers = new StringBuilder();
            Matcher messageInfo = split.matcher(message);
            //Пълним информацията от съобщението
            while (messageInfo.find()) {
                if (messageInfo.group("attackType").equals("A")) {
                    attackedPlanets.add(messageInfo.group("planet"));
                } else if (messageInfo.group("attackType").equals("D")) {
                    destroyedPlanets.add(messageInfo.group("planet"));
                }
                //planet.append(messageInfo.group("planet"));
                //population.append(messageInfo.group("population"));
                //attackType.append(messageInfo.group("attackType"));
                //soldiers.append(messageInfo.group("soldiers"));
            }

        }

        //TODO
        //Новия регекс да добавя за разбиването на decryptedMessage на планета и  другите неща.
        //Може би директно ще се принтят
        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);

        System.out.println("Attacked planets: " + attackedPlanets.size());

        if (attackedPlanets.size() > 0) {
            for (String attackedPlanet : attackedPlanets) {
                System.out.println("-> " + attackedPlanet);
            }
        }
        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        if (destroyedPlanets.size() > 0) {
        for (String destroyedPlanet : destroyedPlanets) {
            System.out.println("-> " + destroyedPlanet);
        }
        }



    }
}

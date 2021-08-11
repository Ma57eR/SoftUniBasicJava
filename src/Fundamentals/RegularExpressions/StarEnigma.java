package Fundamentals.RegularExpressions;

import java.util.ArrayList;
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


        for (int i = 0; i < numOfMessages; i++) {

            String input = scan.nextLine();
            int countLetters = 0;
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                countLetters++;
            }

            StringBuilder decrypted = new StringBuilder();
            for (int k = 0; k < input.length(); k++) {
                decrypted.append(Character.valueOf((char) (input.charAt(k) - countLetters)));
            }
            decryptedMessage.add(decrypted.toString());

        }

        //TODO
        //Новия регекс да добавя за разбиването на decryptedMessage на планета и  другите неща.
        //Може би директно ще се принтят


    }
}

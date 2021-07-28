package Fundamentals.TextProcessing.MoreExercise;

import java.util.*;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Map<String, String> morseAlphabet = new TreeMap();
        fillAlphabet(morseAlphabet);
        String[] input = scan.nextLine().split(" ");
        StringBuilder translated = new StringBuilder();

        for (int word = 0; word < input.length; word++) {
            String currentWord = input[word];
            for (Map.Entry<String, String> entry : morseAlphabet.entrySet()) {
                if (entry.getValue().equals(currentWord)) {
                    translated.append(entry.getKey());
                }
            }
            if (currentWord.equals("|")) {
                translated.append(" ");
            }

        }
        System.out.println();


    }

    private static void fillAlphabet(Map<String, String> morseAlphabet) {
        morseAlphabet.put("A", ".-");
        morseAlphabet.put("B", "-...");
        morseAlphabet.put("C", "-.-.");
        morseAlphabet.put("D", "-..");
        morseAlphabet.put("E", ".");
        morseAlphabet.put("F", "..-.");
        morseAlphabet.put("G", "--.");
        morseAlphabet.put("H", "....");
        morseAlphabet.put("I", "..");
        morseAlphabet.put("J", ".---");
        morseAlphabet.put("K", "-.-");
        morseAlphabet.put("L", ".-..");
        morseAlphabet.put("M", "--");
        morseAlphabet.put("N", "-.");
        morseAlphabet.put("O", "---");
        morseAlphabet.put("P", ".--.");
        morseAlphabet.put("Q", "--.-");
        morseAlphabet.put("R", ".-.");
        morseAlphabet.put("S", "...");
        morseAlphabet.put("T", "-");
        morseAlphabet.put("U", "..-");
        morseAlphabet.put("V", "...-");
        morseAlphabet.put("W", ".--");
        morseAlphabet.put("X", "-..-");
        morseAlphabet.put("Y", "-.--");
        morseAlphabet.put("Z", "--..");
    }

}

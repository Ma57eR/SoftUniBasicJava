package Fundamentals.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        Map<String, String> synonym = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String word = scan.nextLine();
            String syn = scan.nextLine();

            if (!synonym.containsKey(word)) {
                synonym.put(word, syn);
            } else {
                String tmp = synonym.get(word) + ", " + syn;
                synonym.put(word, tmp);
            }
        }
        for (Map.Entry<String, String> entry : synonym.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
        }

    }
}

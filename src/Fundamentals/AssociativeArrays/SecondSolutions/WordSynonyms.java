package Fundamentals.AssociativeArrays.SecondSolutions;

import sun.reflect.generics.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        Map<String, List<String>> synonyms = new TreeMap<>();

        for (int i = 0; i < num; i++) {

            String word = scan.nextLine();
            String syn = scan.nextLine();

            synonyms.putIfAbsent(word, new ArrayList<>());
            synonyms.get(word).add(syn);
        }
        for (Map.Entry<String, List<String>> entry: synonyms.entrySet()) {
            System.out.print(entry.getKey() + " - ");
            entry.getValue().forEach(s -> {s.toString().replace("[", "").replace("]", "");});

            System.out.println();
        }

    }
}

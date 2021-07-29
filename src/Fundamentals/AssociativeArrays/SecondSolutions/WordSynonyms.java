package Fundamentals.AssociativeArrays.SecondSolutions;



import java.util.*;


public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        Map<String, List<String>> synonyms = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {

            String word = scan.nextLine();
            String syn = scan.nextLine();

            synonyms.putIfAbsent(word, new ArrayList<>());
            synonyms.get(word).add(syn);
        }
        synonyms.forEach((word, synon) ->{
            System.out.println(word + " - " + String.join(", ", synon));
        });

    }
}

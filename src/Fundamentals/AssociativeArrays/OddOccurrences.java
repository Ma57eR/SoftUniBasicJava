package Fundamentals.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().toString().toLowerCase().split(" ");
       // int occur = 0;
        LinkedHashMap<String, Integer> forPrint = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            if (!forPrint.containsKey(input[i])) {
                int count = 0;
                for (int j = 0; j < input.length; j++) {

                    if (input[j].equals(input[i])) {
                        count++;
                    }
                }
                if (count % 2 != 0) {
                    forPrint.put(input[i], 0);
                }
            } else {
                int occur = forPrint.get(input[i])+1;
                forPrint.put(input[i],occur);
            }
        }
        for (int i = 0; i < forPrint.size(); i++) {
            System.out.printf("%s", forPrint.get(i));
            if (i < forPrint.size() - 1) {
                System.out.println(", ");
            }

        }

    }
}

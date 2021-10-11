package Advanced.SetsAndMaps.Exercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();


        for (int i = 0; i < input[0]; i++) {
            int n = Integer.parseInt(scan.nextLine());
                firstSet.add(n);
        }
        for (int i = 0; i < input[1]; i++) {
            int n = Integer.parseInt(scan.nextLine());
            secondSet.add(n);
        }
        Set<Integer> duplicatedOnly = new LinkedHashSet<>();
        duplicatedOnly = firstSet;

        duplicatedOnly.retainAll(secondSet);

        duplicatedOnly.forEach(e-> {
            System.out.print(e + " ");
        });
    }
}

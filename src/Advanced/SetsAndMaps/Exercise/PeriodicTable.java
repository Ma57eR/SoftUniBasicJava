package Advanced.SetsAndMaps.Exercise;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Set<String> chemicals = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            chemicals.addAll(Arrays.asList(input));
        }

        for (String chemical : chemicals) {
            System.out.print(chemical + " ");
        }
    }
}

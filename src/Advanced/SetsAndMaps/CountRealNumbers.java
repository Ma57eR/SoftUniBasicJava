package Advanced.SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] input = Arrays.stream(scan.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> count = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            double currentNumber = input[i];
            if (!count.containsKey(currentNumber)) {
                count.put(currentNumber, 1);
            } else {
                int currentCount = count.get(currentNumber) + 1;
                count.put(currentNumber, currentCount);
            }
        }

        for (Map.Entry<Double, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

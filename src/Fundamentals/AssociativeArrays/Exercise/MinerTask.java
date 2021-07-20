package Fundamentals.AssociativeArrays.Exercise;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> miner = new LinkedHashMap<>();

        String command = scan.nextLine();

        while (!command.equals("stop")) {
            int quantity = Integer.parseInt(scan.nextLine());

            if (!miner.containsKey(command)) {
                miner.put(command, quantity);
            } else {
                int currentQuantity = miner.get(command) + quantity;
                miner.put(command, currentQuantity);
            }
            command = scan.nextLine();
        }

        for (Map.Entry<String, Integer> entry : miner.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

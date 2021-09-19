package Advanced.StacksAndQueues;

import java.util.*;
import java.util.stream.Collectors;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(" ");
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, data);

        int n = Integer.parseInt(scanner.nextLine());
        while (queue.size() > 1){
            //Местене на човека за триене на първо място
            for (int i = 1; i < n; i++) {
                //Първия отива последен // върти го
                queue.offer(queue.poll());
            }

            System.out.println("Removed " + queue.poll());
        }

        System.out.println("Last is " + queue.poll());

    }
        }

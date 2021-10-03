package Advanced.StacksAndQueues.Exercises;


import java.util.*;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int forOffer = input[0];
        int forRemove = input[1];
        int forCheck = input[2];
        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < forOffer; i++) {
            queue.offer(numbers[i]);
        }
        for (int i = 0; i < forRemove; i++) {
            queue.pop();
        }

        if (queue.contains(forCheck)) {
            System.out.println("true");
        } else {
            if (queue.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(queue));
            }
        }

    }
}

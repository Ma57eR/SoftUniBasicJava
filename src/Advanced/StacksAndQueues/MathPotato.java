package Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Пълнене на Queue от инпут
        Deque<String> queue = Arrays.stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toCollection(ArrayDeque::new));
        int toss = Integer.parseInt(scan.nextLine());
        int cycle = 1;
        while (queue.size() > 1) {
            if (isCyclePrime(cycle)) {
                for (int i = 1; i < toss; i++) {
                    queue.offer(queue.poll());
                }
                System.out.println("Prime " + queue.peek());
                cycle++;
            } else {
                for (int i = 1; i < toss; i++) {
                    queue.offer(queue.poll());
                }
                System.out.println("Removed " + queue.poll());
                cycle++;
            }
        }
        System.out.println("Last is " + queue.poll());

    }

    private static boolean isCyclePrime(int cycle) {
        if (cycle < 2) {
            return false;
        } else {
            for (int i = 2; i < cycle; i++) {
                if (cycle % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

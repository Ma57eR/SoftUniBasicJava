package Advanced.StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Deque<Long> fibonacci = new ArrayDeque<>();
        int n = Integer.parseInt(scan.nextLine());
        if (n > 2) {
            fibonacci.push(1L);
            fibonacci.push(1L);
            fibonacci.push(2L);
        } else if (n == 1){
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(2);
        }

        for (int num = 3; num <= n; num++) {
            long previousNum = fibonacci.poll();
            long lastNum = fibonacci.peek() + previousNum;
            fibonacci.push(previousNum);
            fibonacci.push(lastNum);
        }
        if (n>2) {
        System.out.println(fibonacci.peek());
        }
    }
}

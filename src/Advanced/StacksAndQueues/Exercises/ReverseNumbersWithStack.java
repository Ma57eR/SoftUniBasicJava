package Advanced.StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Deque<String> stack = new ArrayDeque<>();

        String[] input = scan.nextLine().split(" ");

        for (int index = 0; index < input.length; index++) {
            stack.push(input[index]);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

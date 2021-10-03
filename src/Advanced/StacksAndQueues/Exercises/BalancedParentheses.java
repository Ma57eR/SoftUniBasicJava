package Advanced.StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("");

        Deque<String> stack = new ArrayDeque<>();
        boolean areBalanced = true;

        for (int index = 0; index < input.length; index++) {


            String currentBracket = input[index];
            if (areBalanced) {
                switch (currentBracket) {
                    case "}":
                        if (stack.pop().equals("{")) {
                            continue;
                        } else {
                            areBalanced = false;
                        }
                        break;
                    case ")":
                        if (stack.pop().equals("(")) {
                            continue;
                        } else {
                            areBalanced = false;
                        }
                        break;
                    case "]":
                        if (stack.pop().equals("[")) {
                            continue;
                        } else {
                            areBalanced = false;
                        }
                        break;
                }
                stack.push(input[index]);
            }
        }
        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

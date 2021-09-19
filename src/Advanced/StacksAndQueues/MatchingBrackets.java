package Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String expression = scan.nextLine();

        Deque<Integer> stack = new ArrayDeque<>();

        for (int index = 0; index < expression.length(); index++) {
            char ch = expression.charAt(index);
            //Добавя индекса на скобата в стека.
            //Ако намери затваряща, влиза в елс, принтира и чисти стойността от стека
            //Ако намери друга отваряща скоба, добавя я в стека и търси затваряща, за да го принтне)
            if (ch == '(') {
                stack.push(index);
            } else if (ch == ')') {
                int startIndex = stack.pop();
                String content = expression.substring(startIndex, index+1);
                System.out.println(content);
            }

        }

    }
}
